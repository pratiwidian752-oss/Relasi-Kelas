/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rumah_sakit;

/**
 *
 * @author LENOVO
 */
public class Pasien {
public String namaPasien;
    public Dokter dr;
    public Obat ob;
 
    public Pasien(){
    }
 
    public Pasien(String na, Dokter d, Obat o){
        namaPasien = na;
        dr = d;
        ob = o;
    }
 
    public int hitungTotalBiaya(){
        return dr.tarifDr + ob.harga;
    }
 
    public void tampilData(){
        System.out.println("Nama Pasien = "+namaPasien);
        dr.tampilData();
        ob.tampilData();
        System.out.println("Total Biaya = "+hitungTotalBiaya());
    }
}
 