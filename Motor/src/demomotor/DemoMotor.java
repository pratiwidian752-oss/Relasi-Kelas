package demomotor;
public class DemoMotor {
    public String kodeMtr;
    protected String merkMtr;
    String jenisMtr;
    private float kecepatan;
    private int gigi;
    public static int JumTotalMotor;
    public DemoMotor(){
        System.out.println("Obyek terbentuk dari konstruktor default");
        merkMtr = "KOSONG";
        kecepatan = gigi = 0;
    }
    public DemoMotor(int g){
        System.out.println("Obyek terbentuk dari konstruktor berparameter 1");
    merkMtr = "KOSONG";
    kecepatan = 0;
    gigi = g;
    }
    public DemoMotor(int g, float v){
        System.out.println("Obyek terbentuk dari konstruktor berparameter 2");
        merkMtr = "KOSONG";
        kecepatan = v;
        gigi =g;
    }
    public void start() {
        gigi = 1;
        kecepatan = 0;
        System.out.println("Porsneling awal = "+gigi);
    }
    private void kurangiPorsneling () {
        gigi--;
        System.out.println("Kurangi Posneling = "+gigi);
    }
    private void tambahPorsneling () {
        gigi++;
        System.out.println("Tambah Porsneling = "+gigi);
    }
    public void tambahVelocity (float v) {
        kecepatan +=v;
        if (v>10)
            tambahPorsneling();
    }
    public void kurangiVelocity (float v) {
        kecepatan -=v;
        if (v>5.5)
            kurangiPorsneling();
       }
    public void stop() {
    kecepatan =0;
    gigi = 0;
    System.out.println("berhenti = "+kecepatan);
    }
    public void tampilData() {
        System.out.println("KODE MOTOR = "+kodeMtr);
        System.out.println("MEREK MOTOR = "+merkMtr);
        System.out.println("JENIS MOTOR = "+jenisMtr);
        System.out.println("KECEPATAN = "+kecepatan);
        System.out.println("GIGI = "+gigi);
        System.out.println();
    }
    public static void JumTotalMotor(){
        JumTotalMotor = JumTotalMotor + 1;
    }
    
    
    public static void main(String[] args) {
        DemoMotor s1;
        s1 = new DemoMotor();
        DemoMotor.JumTotalMotor();
        s1.kodeMtr="S001";s1.merkMtr="Vixion";
        s1.jenisMtr="Road Sport";s1.kecepatan=0;
        s1.gigi=0;
        s1.tambahVelocity (15); s1.kurangiVelocity(3);
        s1.tampilData();
        DemoMotor s2 = new DemoMotor(2);
        DemoMotor.JumTotalMotor();
        s2.tampilData();
        DemoMotor s3= new DemoMotor(4,25);
        DemoMotor.JumTotalMotor();
        s3.tampilData();
        System.out.println("Jumlah Total Obyek Motor yang dibuat "+DemoMotor.JumTotalMotor);
    }
}
