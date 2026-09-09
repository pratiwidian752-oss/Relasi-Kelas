/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rumah_sakit;

/**
 *
 * @author LENOVO
 */
public class Rumah_Sakit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dokter dr = new Dokter("dr. Andi", 150000);
        Obat ob = new Obat("Paracetamol", 15000);
        Pasien p = new Pasien("Budi", dr, ob);
        p.tampilData();
        System.out.println();
 
        // contoh lain membuat objek
        Pasien p1 = new Pasien("Siti", new Dokter("dr. Rina", 200000), new Obat("Amoxicillin", 25000));
        p1.tampilData();
    }
}
