/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasiclass1;

/**
 *
 * @author LENOVO
 */
public class Laptop {
    public String merk;
    public Processor proc;
    
    public Laptop(){
    }
    
    public Laptop(String me, Processor pr){
        merk = me;
        proc = pr;
    }
    
    public void tampilData(){
        System.out.println("Merk Laptop =" +merk);
        proc.tampilData();
    }
}
