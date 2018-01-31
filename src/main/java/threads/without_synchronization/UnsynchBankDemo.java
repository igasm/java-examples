package threads.without_synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnsynchBankDemo {

  public static final int ACCOUNTS_NUMBER = 100;
  public static final int INITIAL_BALANCE = 1000;
  public static final int MAX_AMOUNT = 1000;
  public static final int DELAY = 10;

  //dwa wątki na raz mogą próbować zaktualizowac jedno konto
  public static void main(String[] args) {
    Bank bank = new Bank(ACCOUNTS_NUMBER, INITIAL_BALANCE);
    for( int i=0; i<ACCOUNTS_NUMBER; i++){
      int fromAccount = i;
      Runnable r = () -> {
        try {
          for(int j=0; j<100; j++){
            int toAccount = (int) (bank.size() * Math.random());
            int amount = (int) (MAX_AMOUNT * Math.random());
            bank.transfer(fromAccount, toAccount, amount);
            Thread.sleep((int) (DELAY * Math.random()));
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      };
      Thread t = new Thread(r);
      t.start();
    }
  }

}
