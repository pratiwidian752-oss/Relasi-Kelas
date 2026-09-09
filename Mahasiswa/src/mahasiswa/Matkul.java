/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
public class Matkul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d1 = new Dosen("Pak Budi");
        Dosen d2 = new Dosen("Bu Sari");
        Dosen d3 = new Dosen("Pak Andi");
 
        Matakuliah mk1 = new Matakuliah("OOP", 3, 85, d1);
        Matakuliah mk2 = new Matakuliah("Basis Data", 3, 90, d2);
        Matakuliah mk3 = new Matakuliah("Bahasa Inggris", 2, 80, d3);
 
        Matakuliah[] mkArr = {mk1, mk2, mk3};
 
        Mahasiswa mhs = new Mahasiswa("Raisa", mkArr);
        mhs.tampilData();
    }
}