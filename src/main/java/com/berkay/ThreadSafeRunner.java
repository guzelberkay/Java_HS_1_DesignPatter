package com.berkay;

import com.berkay.sigleton.s03.ThreadSafeSingleton;

public class ThreadSafeRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            new Thread(() -> {
                ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
                System.out.println("nesne referansi....: " + threadSafeSingleton);
            }).start();
        }
        try {
            Thread.sleep(4000L);
        }catch (Exception exception){

        }
    }
}

