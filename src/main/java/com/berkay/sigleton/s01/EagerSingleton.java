package com.berkay.sigleton.s01;

public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
    public static int count;
    private EagerSingleton() {

        count++;
    }

    public int toplam(int... sayilar) {
        int result = 0;
        for (int sayi : sayilar) result += sayi;
        return result;
    }
}
