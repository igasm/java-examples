package threads.without_synchronization;

import java.util.Arrays;

/**
 * Bank z kilkoma kontami
 */
public class Bank {
  
  int[] accounts;

  public Bank(int n, int initialBalance){
    accounts = new int[n];
    Arrays.fill(accounts, initialBalance);
  }

  /**
   * przelewa pieniądze między kontami
   * @param from konto, z którego ma nastąpić przelew
   * @param to konto, na które mają zostać przelane środki
   * @param amount kwota do przelania
   */
  public void transfer(int from, int to, int amount){
    System.out.print(Thread.currentThread());
    accounts[from] -= amount;
    System.out.printf(" %d z %d na %d", amount, from, to);
    accounts[to] += amount;
    System.out.printf(" Saldo ogólne: %d", getTotalBalance());
    System.out.println();
  }

  public int getTotalBalance() {
    int sum = 0;
    for (int a : accounts){
      sum += a;
    }
    return sum;
  }

  public int size(){
    return accounts.length;
  }

}
