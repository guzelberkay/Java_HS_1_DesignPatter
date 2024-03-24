package com.berkay.service;


import com.berkay.sigleton.s01.EagerSingleton;
import com.berkay.sigleton.s02.LazySingleton;

public class KullaniciService {
    private EagerSingleton eagerSingleton;
    private LazySingleton lazySingleton;
    public void islemler(){
        eagerSingleton = EagerSingleton.getInstance();

        System.out.println(lazySingleton.toplam(32,32,3));
        System.out.println(lazySingleton);
    }
}
