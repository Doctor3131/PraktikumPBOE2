/*
* Nama File    : LabKomputer.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Pertemuan6.ResponsiP6;

class LabKomputer extends Ruang implements Laboratorium {
    private String namaLaboratorium;
    private double hargaSewa;
    private int jumlahKomputer;
    private static final double tarifKebersihan = 5000;
    
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLab;
        this.hargaSewa = hargaSewa;
        this.jumlahKomputer = jumlahKomputer;
    }
    
    @Override
    public double getTarifDefaultKebersihan() {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    @Override
    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }
    
    @Override
    public double getHargaSewa() {
        return hargaSewa;
    }
    
    @Override
    public void tampilkanInformasiLaboratorium() {
        System.out.println("Nama Laboratorium: " + namaLaboratorium);
        System.out.println("Harga Sewa: Rp " + hargaSewa);
    }
    
    @Override
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        tampilkanInformasiLaboratorium();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}