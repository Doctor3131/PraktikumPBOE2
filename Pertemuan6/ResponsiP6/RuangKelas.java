package Pertemuan6.ResponsiP6;

public class RuangKelas extends Ruang {
    protected int jumlahKursiTersedia;
    protected int jumlahKursiRusak;
    protected static final double tarifKebersihan = 5000; 
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak) {
        super(kode, tinggi, lebar, panjang, kapasitas);
        this.jumlahKursiTersedia = kursiTersedia;
        this.jumlahKursiRusak = kursiRusak;
    }
    
    @Override
    public double cekTarifBiayaKebersihan(double tarif) {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jumlahKursiRusak);
    }
}