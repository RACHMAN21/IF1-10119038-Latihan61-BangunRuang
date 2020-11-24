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
 * Deskripsi Program : program ini berisi class Bola yang merupakan sub-class
 *                     dari class abstract BangunRuang yang merupakan sup-class
 */

public class Bola extends BangunRuang {
    public Bola(double r) {
        super(r);
    }
    
    @Override
    public double hitungVolume() {
        return (4 * Math.PI * Math.pow(super.getR(),3)) /3;
    }
    
    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Bola");
        super.tampilVolume();
    }
}