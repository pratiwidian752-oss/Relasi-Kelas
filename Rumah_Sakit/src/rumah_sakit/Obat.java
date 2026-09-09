/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumah_sakit;

/**
 *
 * @author LENOVO
 */
public class Obat {
    public String namaObat;
    public int harga;
 
    public Obat(){
    }
 
    public Obat(String nm, int har){
        namaObat = nm;
        harga = har;
    }
 
    public void tampilData(){
        System.out.println("Nama Obat = "+namaObat);
        System.out.println("Harga Obat = "+harga);
    }
}
