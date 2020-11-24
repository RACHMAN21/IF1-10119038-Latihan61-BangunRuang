/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.bangunruang;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class abstract BangunRuang
 * 
 */

public abstract class BangunRuang {
    protected double r; // jari-jari

    public BangunRuang(double r) {
        this.r = r;
    }
    
    public double getR() {
        return r;
    }
    
    public abstract double hitungVolume();
    
    public void tampilVolume() {
        System.out.printf("Hasil : V = %.1f %n%n", hitungVolume());
    }
}