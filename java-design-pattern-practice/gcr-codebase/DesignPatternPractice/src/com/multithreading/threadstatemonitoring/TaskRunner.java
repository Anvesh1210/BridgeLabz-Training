package com.multithreading.threadstatemonitoring;

public class TaskRunner extends Thread {
    TaskRunner(String name) {
        setName(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 0; i < 1000000; i++);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
