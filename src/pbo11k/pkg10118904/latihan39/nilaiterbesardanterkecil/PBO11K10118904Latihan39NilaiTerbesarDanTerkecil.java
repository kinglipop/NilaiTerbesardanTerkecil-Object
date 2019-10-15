/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan39.nilaiterbesardanterkecil;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang program menentukan nilai terbesar dan terkecil
 */
public class PBO11K10118904Latihan39NilaiTerbesarDanTerkecil {
public static Scanner input = new Scanner(System.in);
    public static void insertNilai(int i,String namaP) {
        int[] nilaiArr = new int[1000];
        for(int j = 1; j <= i;j++) {
        System.out.print("Masukan nilai mahasiswa Ke-"+j+" = ");
            nilaiArr[j] = input.nextInt();
        }
        Nilai nilai = new Nilai();
        nilai.hasil(namaP, i, nilaiArr);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String namaP;
        System.out.println("==== Program nilai terbesar dan nilai terkecil nilai mahasiswa ====");
        System.out.print("Masukan nama petugas : ");
        namaP = input.nextLine();
        System.out.print("Masukan banyaknya mahasiswa : ");
        n = input.nextInt();
        insertNilai(n, namaP);
    }
    
}
