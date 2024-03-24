package com.berkay.sigleton.s05;

public class BillPugh {
    public static int count;
    private BillPugh(){
        count++;
    }

    private static class BillPughHelper{
        private static final BillPugh INSTANCE = new BillPugh();

    }

    public static BillPugh getInstance(){
        return BillPughHelper.INSTANCE;
    }

}
