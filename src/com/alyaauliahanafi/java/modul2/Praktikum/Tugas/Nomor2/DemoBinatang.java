package com.alyaauliahanafi.java.modul2.Praktikum.Tugas.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {
        //membuat objek baru
        Burung burung = new Burung();
        //isi data
        burung.nama = "Ngurai Batu";
        burung.makan = "Kroto";
        burung.tidur = "Di malam hari";
        burung.terbang = "Dengan cara terbang ";
        //memanggil method
        System.out.println("========= BURUNG =========");
        burung.getNama();
        burung.binatang();
        burung.setTerbang();
        System.out.println();

        //isi data
        Ikan ikan = new Ikan();
        ikan.nama = "Hiu";
        ikan.makan = "Ikan kecil";
        ikan.tidur = "Saat berenang Hiu bisa juga tidur";
        ikan.berenang = "Dengan cara berenang";
        //memanggil method
        System.out.println("=========== IKAN ===========");
        ikan.getNama();
        ikan.binatang();
        ikan.setBerenang();
        System.out.println();
        //isi data

        Kucing kucing = new Kucing();
        kucing.nama = "Caracal";
        kucing.makan = "Daging";
        kucing.tidur = "Di malam hari";
        kucing.meong = "Dengan  cara mengeluarkan suara meong";
        //memanggil method
        System.out.println("=========== KUCING ==========");
        kucing.getNama();
        kucing.binatang();
        kucing.setMeong();




    }
}
