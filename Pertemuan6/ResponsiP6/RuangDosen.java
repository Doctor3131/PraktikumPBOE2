package Pertemuan6.ResponsiP6;

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int kursi, int meja) {
        super(kode, tinggi, lebar, panjang, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = kursi;
        this.jumlahMeja = meja;
    }
    
    @Override
    public double cekTarifBiayaKebersihan(double tarifKebersihan) {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
    }
}