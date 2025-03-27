/*
* Nama File    : RuangDosen.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Pertemuan6.ResponsiP6;

public class RuangDosen extends Ruang implements Departemen {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private String namaDepartemen;
    private double tarifBiayaKebersihan;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int kursi, int meja, String namaDepartemen, double tarifBiayaKebersihan) {
        super(kode, tinggi, lebar, panjang, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = kursi;
        this.jumlahMeja = meja;
        this.namaDepartemen = namaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }
    
    @Override
    public double getTarifDefaultKebersihan() {
        return getTarifBiayaKebersihan();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        tampilkanInformasiDepartemen();
        System.out.println("Tarif Biaya Kebersihan: Rp " + tarifBiayaKebersihan);
    }

    @Override
    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    @Override
    public String getNamaKetuaDepartemen() {
        return "Tidak Tersedia";
    }

    @Override
    public void tampilkanInformasiDepartemen() {
        System.out.println("Departemen: " + namaDepartemen);
    }

    @Override
    public double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }

    @Override
    public void setTarifBiayaKebersihan(double tarif) {
        this.tarifBiayaKebersihan = tarif;
    }
}