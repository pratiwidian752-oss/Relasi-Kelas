/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public String namaMhs;
    public Matakuliah[] mk;
 
    public Mahasiswa(){
    }
 
    public Mahasiswa(String nm, Matakuliah[] kul){
        namaMhs = nm;
        mk = kul;
    }
 
    public double hitungNilaiTotal(){
        double totalNilaiKaliSks = 0;
        double totalSks = 0;
        for(int i=0; i<mk.length; i++){
            totalNilaiKaliSks += mk[i].nilai * mk[i].sks;
            totalSks += mk[i].sks;
        }
        return totalNilaiKaliSks / totalSks;
    }
 
    public void tampilData(){
        System.out.println("Nama Mhs = "+namaMhs);
        for(int i=0; i<mk.length; i++){
            mk[i].tampilData();
        }
        System.out.println("Nilai Total = "+hitungNilaiTotal());
    }
}