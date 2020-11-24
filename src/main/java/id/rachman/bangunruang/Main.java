/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.bangunruang;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi menghitung volume bangun ruang dengan pendekatan object oriented
 *                     dan penerapan konsep pewarisan, abstract
 */

public class Main {
    public static void main(String[] args) {
        BangunRuang bola = new Bola(7);
        bola.tampilVolume();
        
        BangunRuang tabung = new Tabung(10,21);
        tabung.tampilVolume();
        
        BangunRuang kerucut = new Kerucut(14,9);
        kerucut.tampilVolume();
    }
}