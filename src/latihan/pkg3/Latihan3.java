/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inputan User
        Scanner masukan = new Scanner (System.in);
        
        // Deklarasi Variabel
        int a, b, c;
        
        // Menampilkan Judul
        System.out.println("Program Menjumlahkan 2 Nilai");
        
        // User Memasukkan Nilai a
        System.out.print("Masukkan Nilai a : ");
        a = masukan.nextInt();
        
        // User Memasukkan Nilai b
        System.out.print("Masukkan Nilai b : ");
        b = masukan.nextInt();
        
        // User Memasukkan Nilai c
        System.out.print("Masukkan Nilai c : ");
        c = masukan.nextInt();
        
        // Sebagai Spasi/Jeda
        System.out.println();
        
        // Operasi Aritmatika Penjumlahan 2 Nilai
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
        }
    // Konstruktor
    private static int jumlah (int a, int b){
        // Menghitung Hasil dari Ke 2 Nilai
        int hasil = a + b;
        
        // Menampilkan Hasil
        return hasil;
    }
}