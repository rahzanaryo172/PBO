/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahzanaryoapplication;

/**
 *
 * @author Rahzan Aryo
 */
public class RahzanAryoApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek dari class manusia
        Manusia manusia = new Manusia();
        
        //Mengisi atribut class
        manusia.isiVariabel("Rahzan Aryo ", 21);
        
        //Memanggil method print manusia
        manusia.printManusia();
        
        
        PesawatTelepon call= new PesawatTelepon();
        
        call.isi("Intercom", 200000);
        call.tampil();
    }
    
}
