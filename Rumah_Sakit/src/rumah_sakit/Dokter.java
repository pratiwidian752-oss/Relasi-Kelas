/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumah_sakit;

/**
 *
 * @author LENOVO
 */
public class Dokter {
    public String namaDr;
    public int tarifDr;
 
    public Dokter(){
    }
 
    public Dokter(String nm, int tr){
        namaDr = nm;
        tarifDr = tr;
    }
 
    public void tampilData(){
        System.out.println("Nama Dokter = "+namaDr);
        System.out.println("Tarif Dokter = "+tarifDr);
    }
}
 