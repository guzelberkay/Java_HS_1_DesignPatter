package com.berkay;

import com.berkay.factory.Kamyonet;
import com.berkay.factory.Tasima;
import com.berkay.factory.TasimaFactory;
import com.berkay.factory.TasimaTipi;

public class RunnerFactory {
    public static void main(String[] args) {
        Tasima tasima;
        tasima = TasimaFactory.builder(TasimaTipi.GEMI);
        tasima.tasimaYap("","",343,2);
    }
}
