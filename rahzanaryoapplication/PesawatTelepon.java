/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahzanaryoapplication;

/**
 *
 * @author rahzanAryo
 */
public class PesawatTelepon {
    
    String jenis;
    int harga;
    
    void isi(String jenisPesawatTelepon, int hargaPesawatTelepon){
        jenis = jenisPesawatTelepon;
        harga = hargaPesawatTelepon;
    }
    
    void tampil(){
        System.out.println("Jenis Pesawat Telepon: " + jenis);
        System.out.println("Harga Pesawat Telepon: "+ harga);
    }
}
