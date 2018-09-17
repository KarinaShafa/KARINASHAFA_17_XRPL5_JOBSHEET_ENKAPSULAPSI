/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] args) {
        int password;

        Tugas1 Tayo = new Tugas1(40);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        Tayo.getPenumpang(121);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        System.out.println(" Rata-rata Penumpang : " + Tayo.getAverege());

    }
}
