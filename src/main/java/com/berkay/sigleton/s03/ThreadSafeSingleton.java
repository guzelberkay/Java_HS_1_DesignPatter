package com.berkay.sigleton.s03;

public class ThreadSafeSingleton {
    /**
     * "Raise condition", çoklu kullanıcı ve ya çoklu işlemcili yapıları tarif eder.
     * Belli bellek bölgelerindeki verilere aynı anda erişimi tarif eder ve bu erişim
     * yaşattığı sornları ifade eder.
     * Burada olan sorunları düşündüğümüzde çözüm olaraj geliştirilen başlıca konular şunlardır;
     * - mutex
     * - semafor'lar
     * kilitlenmeler
     */
    private static ThreadSafeSingleton INSTANCE;

    public static int count;

    private ThreadSafeSingleton() {
        count++;
    }

    public static ThreadSafeSingleton getInstance() {
        synchronized (ThreadSafeSingleton.class) {
            if (INSTANCE == null)
                INSTANCE = new ThreadSafeSingleton();
            return INSTANCE;
        }
    }
}
