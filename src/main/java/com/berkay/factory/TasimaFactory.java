package com.berkay.factory;

public class TasimaFactory {
    public static Tasima builder(TasimaTipi tip) {
        return switch (tip) {
            case KAMYONET -> new Kamyonet();
            case TIR -> new Tir();
            case GEMI -> new Gemi();
            case UCAK -> new Ucak();
        };
    }
}
