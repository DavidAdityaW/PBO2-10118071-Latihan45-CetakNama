/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan45.cetaknama;


/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     cetak nama
 * 
 */
public class Printer {
    
    private int jmlCetak;
    private String nama;
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public int getJmlCetak() {
        return jmlCetak;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama Anda \t\t\t : " + getNama());
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.print(i + ". ");
            System.out.println(getNama());
        }
    }
    
}
