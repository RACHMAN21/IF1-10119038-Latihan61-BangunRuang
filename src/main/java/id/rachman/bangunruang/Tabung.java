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
 * Deskripsi Program : program ini berisi class Tabung yang merupakan sub-class
 *                     dari class abstract BangunRuang yang merupakan sup-class
 */

public class Tabung extends BangunRuang {
    public double h; // ketinggian
    
    public Tabung(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }
    
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(super.getR(),2)*h;
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Tabung");
        super.tampilVolume();
    }
}