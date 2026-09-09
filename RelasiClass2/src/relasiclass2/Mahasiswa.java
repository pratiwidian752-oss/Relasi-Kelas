/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasiclass2;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public String namaMhs;
    public Matakuliah[] mk;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa (String nm, Matakuliah[] kul){
        namaMhs = nm;
        mk = kul;
    }
    
    public void tampilData(){
        System.out.println("Nama Mhs ="+namaMhs);
        for(int i=0; i<mk.length; i++){
            mk[i].tampilData();
        }
    }
}
