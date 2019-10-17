/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan35.tunjangan;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     tunjangan karyawan
 * 
 */
public class Karyawan {
    private double gajiPokok;
    private double tunjangan;
    private double totalGaji;
    private String status;

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        if ("Menikah".equals(status) || "menikah".equals(status) || "MENIKAH".equals(status)) {
            tunjangan = gajiPokok * 35 / 100;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double hitungGaji(){
       totalGaji = gajiPokok + tunjangan;
       return totalGaji;
    }
}
