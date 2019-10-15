/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author Firman Alfinas
 */
public class Nilai {
   private int nilaiH;
   private int nilaiL;
   public void hasil(String VarNamaP, int varI, int varNilaiArr[]) {
        Terbesar h = new Terbesar();
        Terkecil l = new Terkecil();
        nilaiH = h.cari(varI, varNilaiArr);
        nilaiL = l.cari(varI, varNilaiArr);
        System.out.println("");
        System.out.println("Nilai terbesar adalah "+nilaiH);
        System.out.println("Nilai terkecil adalah "+nilaiL);
        System.out.println("");
        System.out.println("Nama petugas : "+ VarNamaP);
    }
}
