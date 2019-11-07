/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan44.hukumohm;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Latihan 44 - Hukum Ohm
 */
public class PBOUlang10117185Latihan44HukumOhm {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        
        
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println("");
        System.out.println("");
        System.out.print("Kuat Arus : ");
        float KuatArus = masukan.nextFloat();
        System.out.println("Ampere");
        

        System.out.print("Hambatan : ");
        float Hambatan = masukan.nextFloat();
        System.out.println("Ohm");
        Baterai obj_Hambatan = new Baterai (KuatArus,Hambatan);
        
        System.out.print("Hasil Tegangan :" +obj_Hambatan.hitungTegangan()+ " volt ");
   
    }
    
}
