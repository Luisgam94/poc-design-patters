package com.dev.gam.concurrency.executor;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

class WorkerTask implements Callable<String> {
  private final String name;

  public WorkerTask(String name) {
    this.name = name;
  }

  @Override
  public String call() throws Exception {
    System.out.println("WorkerTask [" + name + "] executed on : "
        + LocalDateTime.now().toString());
    return "WorkerTask [" + name + "] is SUCCESS !!";
  }
}
