/*
* Nama File    : RuangDepartemen.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Pertemuan6.ResponsiP6;

public class RuangDepartemen extends Ruang implements Departemen {
    protected int jumlahMeja;
    protected int jumlahKursi;
    protected int jumlahLemari;
    protected String namaDepartemen;
    protected String namaKetuaDepartemen;
    protected double tarifBiayaKebersihan;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int meja, int kursi, int lemari, String namaDepartemen, String namaKetuaDepartemen, double tarifBiayaKebersihan) {
        super(kode, tinggi, lebar, panjang, kapasitas);
        this.jumlahMeja = meja;
        this.jumlahKursi = kursi;
        this.jumlahLemari = lemari;
        this.namaDepartemen = namaDepartemen;
        this.namaKetuaDepartemen = namaKetuaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }
    
    @Override
    public double getTarifDefaultKebersihan() {
        return getTarifBiayaKebersihan();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        tampilkanInformasiDepartemen();
        System.out.println("Tarif Biaya Kebersihan: Rp " + tarifBiayaKebersihan);
    }

    @Override
    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    @Override
    public String getNamaKetuaDepartemen() {
        return namaKetuaDepartemen;
    }

    @Override
    public void tampilkanInformasiDepartemen() {
        System.out.println("Nama Departemen: " + namaDepartemen);
        System.out.println("Ketua Departemen: " + namaKetuaDepartemen);
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