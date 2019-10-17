/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan35.tunjangan;
// package scanner
import java.util.Scanner;

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
public class PBO210118071Latihan35Tunjangan {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan;
        String status;
        
        Karyawan k = new Karyawan();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiPokok = input.nextInt(); 
        k.setGajiPokok(gajiPokok);
        System.out.print("Status anda? (Menikah/Belum) \t : ");
        status = input.next(); 
        k.setStatus(status);
        
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok \t : " + k.getGajiPokok());
        System.out.println("Tunjangan \t : " + k.getTunjangan());
        System.out.println("Total Gaji \t : " + k.hitungGaji());
        System.out.println("(Developed by : David Aditya Winarto)");
        
    } 
}
