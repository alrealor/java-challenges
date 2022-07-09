package com.arao.challenges.topics.threads;

public class Thread2 extends Thread {

    NumberCounter counter;

    public Thread2 (NumberCounter counter) {
        this.counter = counter;
    }

    public void run() {
        this.counter.nonSyncDisplayNumbers();
    }
}
