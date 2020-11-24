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
 * Deskripsi Program : program ini berisi class Kerucut yang merupakan sub-class
 *                     dari class abstract BangunRuang yang merupakan sup-class
 */

public class Kerucut extends BangunRuang {
    public double t; // tinggi
    
    public Kerucut(double r, double t) {
        super(r);
        this.t = t;
    }
    
    public double getT() {
        return t;
    }
    
    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(super.getR(),2)*t)/3;
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Kerucut");
        super.tampilVolume();
    }
}