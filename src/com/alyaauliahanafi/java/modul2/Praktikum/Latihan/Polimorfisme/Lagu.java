package com.alyaauliahanafi.java.modul2.Praktikum.Latihan.Polimorfisme;

public class Lagu {
    //deklarasi
    public String judul;
    public  String pencipta;

    //overloading
    public Lagu(String judul) {
        this.judul = judul;
    }

    //overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
    }
}
