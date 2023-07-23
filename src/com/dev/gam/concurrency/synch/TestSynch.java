package com.dev.gam.concurrency.synch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class TestSynch {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    //SynchronizedMethods summation = new SynchronizedMethods();
    SynchronizedMethods method = new SynchronizedMethods();

    IntStream.range(0, 15)
        .forEach(count -> service.submit(
            () -> {
              method.synchronisedCalculate();
              System.out.println(method.getSyncSum());
            }));

    //service.awaitTermination(1, TimeUnit.NANOSECONDS);

    service.shutdown();
    try {
      if (!service.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
        service.shutdownNow();
      }
    } catch (InterruptedException ex) {
      service.shutdownNow();
      Thread.currentThread().interrupt();
    }
  }
}
