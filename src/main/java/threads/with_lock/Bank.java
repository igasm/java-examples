package threads.with_lock;

import java.net.ServerSocket;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Bank z kilkoma kontami, konrolujący dostęp za pomocą blokad.
 */
public class Bank {
  
  int[] accounts;
  private Lock bankLock = new ReentrantLock();
  private Condition sufficientFunds;

  /**
   * Tworzy bank.
   * @param n liczba kont
   * @param initialBalance saldo początkowe na każdym koncie
   */
  public Bank(int n, int initialBalance){
    accounts = new int[n];
    Arrays.fill(accounts, initialBalance);
    sufficientFunds = bankLock.newCondition();
  }

  /**
   * przelewa pieniądze między kontami
   * @param from konto, z którego ma nastąpić przelew
   * @param to konto, na które mają zostać przelane środki
   * @param amount kwota do przelania
   */
  public void transfer(int from, int to, int amount){
    bankLock.lock();
    try {

      while (accounts[from] < amount){
        sufficientFunds.await();  //puts thread on the list of threads waiting to condition to be fulfilled
      }

      System.out.print(Thread.currentThread());
      accounts[from] -= amount;
      System.out.printf(" %d z %d na %d", amount, from, to);
      accounts[to] += amount;
      System.out.printf(" Saldo ogólne: %d", getTotalBalance());
      System.out.println();

      sufficientFunds.signalAll();  //unblocks all of threads from list of threads waiting to condition to be fulfilled

    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      bankLock.unlock();
    }
  }

  /**
   * Zwraca sumę sald wszystkich kont.
   * @return saldo ogólne
   */
  public int getTotalBalance() {
    int sum = 0;
    for (int a : accounts){
      sum += a;
    }
    return sum;
  }

  /**
   * zwraca liczbę kont w banku
   * @return
   */
  public int size(){
    return accounts.length;
  }

}
