/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
public class Matakuliah {
    public String namaMk;
    public int sks;
    public int nilai;
    public Dosen dsn;
 
    public Matakuliah(){
    }
 
    public Matakuliah (String na, int sk, int nil, Dosen dO){
        namaMk = na;
        sks = sk;
        nilai = nil;
        dsn = dO;
    }
 
    public void tampilData(){
        System.out.println("Nama MK = "+namaMk);
        System.out.println("SKS = "+sks);
        System.out.println("Nilai = "+nilai);
        dsn.tampilData();ss
        System.out.println();
    }
}
