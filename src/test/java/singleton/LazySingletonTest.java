package singleton;

import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.testng.Assert.*;

//thread safe and lazy-created
public class LazySingletonTest {

  @Test
  public void testMultipleCallsForSameThread(){
    LazySingleton singleton1 = LazySingleton.getInstance();
    LazySingleton singleton2 = LazySingleton.getInstance();

    assertSame(singleton1, singleton2);
  }

  @Test
  public void testMultipleCallsForDifferentThread() throws InterruptedException, ExecutionException {
    List<Callable<LazySingleton>> tasks = new ArrayList<>();

    for(int i=0; i<1000000; i++){
      tasks.add(LazySingleton::getInstance);
    }

    ExecutorService executorService = Executors.newFixedThreadPool(8);
    List<Future<LazySingleton>> results = executorService.invokeAll(tasks);

    //waiting for all of the threads to complete
    LazySingleton expectedInstance = LazySingleton.getInstance();
    for(Future<LazySingleton> result : results){
      LazySingleton instance = result.get();
      assertNotNull(instance);
      assertSame(expectedInstance, instance);
    }

    executorService.shutdown();
  }
}