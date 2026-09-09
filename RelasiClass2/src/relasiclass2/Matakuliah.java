/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasiclass2;

/**
 *
 * @author LENOVO
 */
public class Matakuliah {
    public String nama;
    public int sks;

    public Matakuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    
    public Matakuliah(){
    }
    
    public void tampilData(){
        System.out.println("Nama MK = "+nama);
        System.out.println("SKS = "+sks);
    }
}