package balok1.latihanjava;

public class PerhitunganBalok {
    public static void main(String[] args) {
        Balok blk1 = new Balok();
        blk1.panjang = 15;
        blk1.lebar = 8;
        blk1.tinggi =  10;
        
        Balok blk2 = new Balok();
        blk2.panjang = 18;
        blk2.lebar = 4;
        blk2.tinggi =  16;
        
        Balok blk3 = new Balok();
        blk3.panjang = 20;
        blk3.lebar = 6;
        blk3.tinggi =  17;
        
    blk1.tampilData();
    blk2.tampilData();
    blk3.tampilData();
    System.out.println("Jumlah Total Obyek balok yang dibuat " + Balok.jumTotalBalok);
    System.out.println("Jumlah Total Volume Balok = " + Balok.jumVolumeTotalBalok);
    }
    }
