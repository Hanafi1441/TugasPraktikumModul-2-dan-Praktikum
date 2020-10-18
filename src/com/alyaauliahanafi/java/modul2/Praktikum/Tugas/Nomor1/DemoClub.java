package com.alyaauliahanafi.java.modul2.Praktikum.Tugas.Nomor1;

public class DemoClub {
    public static void main(String[] args) {
        Club club = new Club();
        Club club1 = new Club("Kebumen FC");
        Club club2 = new Club("Kebumen FC","Tsubasa ");
        Club club3 = new Club("Kebumen FC","Tsubasa","Kebumen");
        Club club4 = new Club("Kebumen FC","Tsubasa","Kebumen",90);
        Club club5 = new Club("Kebumen FC","Tsubasa","Kebumen",90,"Candradimuka");

        //panggil class getteam
        club.getTeam();
        System.out.println();
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
