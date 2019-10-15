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
public class Terkecil {
    private int l;
    public int cari(int i,int arr[]) {
        l = arr[1];
        for (int m = 1; m <= i;m++) {
            if (arr[m] < l )
                l = arr[m];
        }
        return l;
    }
}
