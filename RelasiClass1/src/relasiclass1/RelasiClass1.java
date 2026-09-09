/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relasiclass1;

/**
 *
 * @author LENOVO
 */
public class RelasiClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Processor p = new Processor("Intel P4", 3, 1.8);
        Laptop l = new Laptop ("Toshiba", p);
        l.tampilData();
    }
    
}
