package com.berkay.sigleton.s04;

public class DoubleChackLocking {
    private static volatile DoubleChackLocking INSTANCE;
    private static int count;

    private DoubleChackLocking() {
        count++;
    }

    public static DoubleChackLocking getInstance() {
        synchronized (DoubleChackLocking.class) {
            if (INSTANCE == null) {
                INSTANCE = new DoubleChackLocking();
            }

        }
        return INSTANCE;
    }
}
