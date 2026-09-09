package balok1.latihanjava;
public class Balok {
    public double panjang;
    protected double lebar;
    double tinggi;
    public static double jumVolumeTotalBalok = 0;
    
    public static int jumTotalBalok = 0;
    public Balok() {
        jumTotalBalok++;
    }

 
public double hitungVolume(){
    double volume = (panjang * lebar * tinggi);
    jumVolumeTotalBalok += volume;
    return volume;
}
public double hitungLuasPermukaan(){
    double LuasPermukaan = (2 * (panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    return LuasPermukaan;
}
public double hitungDiagonalRuang(){
    double DiagonalRuang = Math.sqrt((panjang*panjang)+(lebar*lebar)+(tinggi*tinggi));
    return DiagonalRuang;
}
double hitungDiagonalSisiDepan(){
    double diagonalSisiDepan= Math.sqrt((panjang*panjang)+(tinggi*tinggi));
    return diagonalSisiDepan;
}
protected double hitungDiagonalSisiSamping(){
    double diagonalSisiSamping = Math.sqrt((tinggi*tinggi)+(lebar*lebar));
    return diagonalSisiSamping;
}
private double hitungDiagonalSisiAtas(){
    double diagonalSisiAtas = ((panjang*panjang)+(lebar*lebar));
    return diagonalSisiAtas;
}
public void tampilData(){
    System.out.println("Volume "+hitungVolume());
    System.out.println("LuasPermukaan "+hitungLuasPermukaan());
    System.out.println("DiagonalRuang "+hitungDiagonalRuang());
    System.out.println("DiagonalSisiDepan "+hitungDiagonalSisiDepan());
    System.out.println("DiagonalSisiSamping "+hitungDiagonalSisiSamping());
    System.out.println("DiagonalSisiAtas "+hitungDiagonalSisiAtas());
    System.out.println();
}
public static void main(String[] args){
}
}