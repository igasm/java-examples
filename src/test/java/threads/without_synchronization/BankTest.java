package threads.without_synchronization;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.*;

public class BankTest {

  public static final double MAX_AMOUNT = 1000;

  class AccountsPair{

    final int from;
    final int to;

    AccountsPair(int from, int to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public String toString(){
      return from + " : " + to;
    }
  }

  List<AccountsPair> cartesianProductOf(int accountsNumber){
    List<Integer> accountsList1 = IntStream.rangeClosed(0, accountsNumber).boxed().collect(toList());
    List<Integer> accountsList2 = IntStream.rangeClosed(0, accountsNumber).boxed().collect(toList());

    List<AccountsPair> accountsCombinations = new ArrayList <>();
    accountsList1.forEach(a -> accountsList2.forEach( b -> accountsCombinations.add(new AccountsPair(a, b))));
    return accountsCombinations;
  }

  @Test
  public void testMultipleCalls() throws InterruptedException, ExecutionException {
    int accountsNumber = 3;
    int initialBalance = 1000;
    Bank bank = new Bank(accountsNumber, initialBalance);
    int expectedTotalBalance = bank.getTotalBalance();

    List<AccountsPair> allAccountPairCombinations = cartesianProductOf(accountsNumber-1);

    List<Callable<Integer>> tasks = new ArrayList <>();
    for(AccountsPair pair : allAccountPairCombinations){
      int amount = (int) (MAX_AMOUNT * Math.random());
      tasks.add(() -> {bank.transfer(pair.from, pair.to, amount); return bank.getTotalBalance();});
    }

    ExecutorService executorService = Executors.newFixedThreadPool(8);
    //invokeAll returns a list of Future objects after all tasks finish or the timeout expires
    List<Future<Integer>> totalBalanceResults = executorService.invokeAll(tasks);

    List<Integer> actualTotalBalances = new ArrayList <>();
    for(Future<Integer> balance : totalBalanceResults){
        actualTotalBalances.add(balance.get());
    }

    List<Integer> expectedTotalBalances = new ArrayList <>();
    IntStream.range(0, actualTotalBalances.size())
        .forEach( balance -> expectedTotalBalances.add(expectedTotalBalance) );

    //each element should not be equal to expectedTotalBalance
    //due to interruptions on threats
    assertThat(actualTotalBalances).doesNotContainSequence(expectedTotalBalances);

    executorService.shutdown();
  }

}