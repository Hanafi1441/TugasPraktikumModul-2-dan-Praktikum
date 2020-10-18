package com.alyaauliahanafi.java.modul2.Praktikum.Tugas.Nomor1;

public class Club {
    //deklarasi variable
    String nama;
    String pelatih;
    String asal;
    int tropi;
    String stadion;
    //contructor 1 tanpa parameter
    public Club (){
    }

    //contructor 2 dengan 1 parameter
    public Club (String nama){
        this.nama = nama;

    }

    //contructor 3 dengan 2 parameter
    public Club (String nama,String pelatih){
        this.nama = nama;
        this.pelatih = pelatih;
    }

    //contructor 4 dengan 3 parameter
    public Club (String nama,String pelatih, String asal){
        this.nama = nama;
        this.pelatih = pelatih;
        this.asal = asal;
    }

    //contructor 5 dengan 4 parameter
    public Club (String nama,String pelatih, String asal, int tropi){
        this.nama = nama;
        this.pelatih = pelatih;
        this.asal = asal;
        this.tropi = tropi;
    }
    //contructor 6 dengan 5 parameter
    public Club (String nama,String pelatih, String asal, int tropi, String stadion){
        this.nama = nama;
        this.pelatih = pelatih;
        this.asal = asal;
        this.tropi = tropi;
        this.stadion = stadion;
    }
    //class get team
    public void getTeam(){
        System.out.println("Nama Club\t\t:"+nama);
        System.out.println("Pelatih\t\t\t:"+pelatih);
        System.out.println("Asal Club\t\t:"+asal);
        System.out.println("Jumlah Trophy\t:"+tropi);
        System.out.println("Stadion\t\t\t:"+stadion);
    }
}
