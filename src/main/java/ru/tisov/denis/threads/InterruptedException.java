package ru.tisov.denis.threads;

public class InterruptedException {

    public static void main(String[] args) throws java.lang.InterruptedException {
        RunningThread runningThread = new RunningThread();
        runningThread.start();

        Thread.currentThread().sleep(500);
        runningThread.interrupt();

        SleepingThread sleepingThread = new SleepingThread();
        sleepingThread.start();

        Thread.currentThread().sleep(500);
        sleepingThread.interrupt();
    }

    static class RunningThread extends Thread {

        private volatile int var = 0;

        @Override
        public void run() {
            while (true) {
                if (this.isInterrupted()) {
                    System.out.println("Thread was interrupted while running");
                    break;
                }
                ++var;
            }
        }
    }

    static class SleepingThread extends Thread {

        private volatile int var = 0;

        @Override
        public void run() {
            while (true) {
                if (this.isInterrupted()) {
                    System.out.println("Thread was interrupted while running");
                    break;
                }
                try {
                    this.sleep(1500);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Interrupted Exception was caught");
                    return;
                }
                ++var;
            }
        }
    }

}
