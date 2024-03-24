package com.berkay;


import com.berkay.service.KullaniciService;
import com.berkay.sigleton.s01.EagerSingleton;

public class Runner {
    public static void main(String[] args) {
//        EagerSingleton eagerSingleton = new EagerSingleton();
//        System.out.println(eagerSingleton.toplam(32, 32, 233, 21, 324, 35));
        KullaniciService kullaniciService = new KullaniciService();
        kullaniciService.islemler();
        kullaniciService.islemler();
        kullaniciService.islemler();
        kullaniciService.islemler();
        kullaniciService.islemler();
        System.out.println("Eager adet...:");
    }
}
