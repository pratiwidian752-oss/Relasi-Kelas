/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasiclass1;

/**
 *
 * @author LENOVO
 */
public class Processor {
    public String merk;
    public double cache;
    public double clock;
    
    public Processor(){
    }
    
    public Processor(String me, double ca, double cl){
        merk = me;
        cache = ca;
        clock = cl;
    }
    
    public void tampilData(){
        System.out.println("Merk Processor ="+merk);
        System.out.println("Cache Memory ="+cache);
        System.out.println("Kecepatan Clock ="+clock);
    }

    
}
