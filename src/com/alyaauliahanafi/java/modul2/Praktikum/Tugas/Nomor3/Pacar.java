package com.alyaauliahanafi.java.modul2.Praktikum.Tugas.Nomor3;

public class Pacar extends Mahasiswa {//mewarisi class mahasiswa
    //deklarasi dan inisialisasi variable
    public String namaPacar = "Anya";
    public int lamHub = 8;
    //method
    public void getStatus(){
        System.out.println("Nama Pacar\t\t:"+namaPacar);
        System.out.println("Lama Hubungan\t:"+lamHub+" tahun");
    }
}

