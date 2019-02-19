/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Pengurangan Tabungan
 *  
 */
public class PBO3ULANG10116049Latihan42Tabungan {

    
    public static int saldo;
    public static int jumlah;
    
    
    public static void main(String[] args) {
       Scanner baca = new Scanner(System.in);
        
       System.out.println("====PROGRAM PENARIKAN UANG ====");
       System.out.print("Masukan Saldo Awal : ");
       saldo = baca.nextInt();
       
       Tabungan tabungan = new Tabungan(saldo);
      
       System.out.println("Saldo Anda Sekarang : " 
                           + tabungan.ambilUang(jumlah));
       
        
       
    }
    
}
