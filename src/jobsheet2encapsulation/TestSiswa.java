/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2encapsulation;

/**
 *
 * @author ASUS
 */
public class TestSiswa {
    public static void main (String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Karina");
        siswa.setabsen(17);
        siswa.setaddress("Malang");
        
        System.out.print("Name : "+siswa.getName()+ " Absen : "+ siswa.getAbsen()+ " Address : "+ siswa.getAddress());
        
    }
}
