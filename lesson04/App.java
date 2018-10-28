package ru.kravchenko.se;

import lombok.SneakyThrows;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        final ABC a = new ABC('A', 'B');
        a.start();

        final ABC b = new ABC('B', 'C');
        b.start();

        final ABC c = new ABC('C', 'A');
        c.start();
    }

    private static class ABC extends Thread {

        private static Object monitor = new Object();

        private static volatile char currentLatter = 'A';

        private char firstLatter;

        private char secondLatter;

        ABC(char firstLatter, char secondLatter) {
            this.firstLatter = firstLatter;
            this.secondLatter = secondLatter;
        }

        @Override
        @SneakyThrows
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (monitor) {
                    while (currentLatter != this.firstLatter) {
                        monitor.wait();
                    }
                    System.out.println(this.firstLatter);
                    currentLatter = this.secondLatter;
                    monitor.notifyAll();
                }
            }
        }
    }
}
