/*
* Nama File    : LabNonKomputer.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Responsi1.ResponsiP6;

class LaboratoriumNonKomputer extends Ruang implements Laboratorium {
    private String namaLaboratorium;
    private double hargaSewa;
    private String jenisLaboratorium;
    private String[] mataKuliah;
    private static final double tarifKebersihan = 5000;
    
    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String jenisLab, String[] mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLab;
        this.hargaSewa = hargaSewa;
        this.jenisLaboratorium = jenisLab;
        this.mataKuliah = mataKuliah;
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
    public String getJenisLaboratorium() {
        return jenisLaboratorium;
    }
    
    @Override
    public String[] getMataKuliah() {
        return mataKuliah;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        tampilkanInformasiLaboratorium();
        System.out.println("Jenis Laboratorium: " + jenisLaboratorium);
        
        System.out.print("Mata Kuliah: ");
        for (String mk : mataKuliah) {
            System.out.print(mk + " ");
        }
        System.out.println();
    }
}