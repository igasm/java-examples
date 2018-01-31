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

public class NaiveSingletonTest {

  @Test
  public void testMultipleCallsForSameThread(){
    NaiveSingleton naiveSingleton1 = NaiveSingleton.getInstance();
    NaiveSingleton naiveSingleton2 = NaiveSingleton.getInstance();

    assertSame(naiveSingleton1, naiveSingleton2);
  }

  //may fail because this implementation is not thread same
  @Test
  public void testMultipleCallsForDifferentThread() throws InterruptedException, ExecutionException {
    List<Callable<NaiveSingleton>> tasks = new ArrayList<>();

    for(int i=0; i<1000000; i++){
      tasks.add(NaiveSingleton::getInstance);
    }

    ExecutorService executorService = Executors.newFixedThreadPool(8);
    List<Future<NaiveSingleton>> results = executorService.invokeAll(tasks);

    //waiting for all of the threads to complete
    NaiveSingleton expectedInstance = NaiveSingleton.getInstance();
    for(Future<NaiveSingleton> result : results){
      NaiveSingleton instance = result.get();
      assertNotNull(instance);
      assertSame(expectedInstance, instance);
    }

    executorService.shutdown();
  }

}