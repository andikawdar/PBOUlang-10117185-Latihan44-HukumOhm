/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan44.hukumohm;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Latihan 44 - Hukum Ohm.
 */
public class Baterai {
    //Atribute
    float kuatArus, hambatan;

    Baterai(float par_kuatArus, float par_hambatan) {
        kuatArus = par_kuatArus;
        hambatan = par_hambatan;
    }
    
    //Function
 
    float getKuatArus() {
        return kuatArus;
    }

    float getHambatan() {
        return hambatan;
    }
    float hitungTegangan(){
    float hasil = kuatArus* hambatan;
    return hasil;     
    }
    
}
