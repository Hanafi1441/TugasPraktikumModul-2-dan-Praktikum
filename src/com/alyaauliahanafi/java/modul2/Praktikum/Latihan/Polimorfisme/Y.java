package com.alyaauliahanafi.java.modul2.Praktikum.Latihan.Polimorfisme;

public class Y extends  X {//Y class turunan X

    @Override
    public void getValue(String value) {//constructor
        super.getValue(value);
        System.out.println("Value kelas Y : " + value);
    }
}
