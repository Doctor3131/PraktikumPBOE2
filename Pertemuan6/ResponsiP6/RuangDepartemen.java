package Pertemuan6.ResponsiP6;

public class RuangDepartemen extends Ruang {
    protected int jumlahMeja;
    protected int jumlahKursi;
    protected int jumlahLemari;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, 
                           int kapasitas, int meja, int kursi, int lemari) {
        super(kode, tinggi, lebar, panjang, kapasitas);
        this.jumlahMeja = meja;
        this.jumlahKursi = kursi;
        this.jumlahLemari = lemari;
    }
    
    @Override
    public double cekTarifBiayaKebersihan(double tarifKebersihan) {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
    }
}