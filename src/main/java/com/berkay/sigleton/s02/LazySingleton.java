package com.berkay.sigleton.s02;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton(){
        count++;
    }
    public static int count;

    public static LazySingleton getInstance(){
        if(INSTANCE == null)
        INSTANCE = new LazySingleton();
        return INSTANCE;
    }
    public int toplam(int... sayilar) {
        int result = 0;
        for (int sayi : sayilar) result += sayi;
        return result;
    }
}
