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
public class Terbesar {
    private int h;
    public int cari(int i, int arr[]) {
        for (int z = 1;z<=i;z++) {
            if (arr[z] > h)
                h = arr[z];
        }
        return h;
    }
    
}
