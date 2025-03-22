/*
 * Nama File    : Petani.java
 * Pembuat      : Siriel Wafa Nuriel Fahri
 * Tanggal      : 22 Februari 2025
 */


package Pertemuan5.PajakTahunan;
import java.util.Date;

public class Petani extends Manusia implements Pajak{
    private String asalKota;
    private static int counterPetani = 0;
    
    public Petani(String nama, Date tglMulaiKerja, double pendapatan, String alamat, String asalKota) {
        super(nama, tglMulaiKerja, pendapatan, alamat);
        this.asalKota = asalKota;
        counterPetani++;
    }
    
    public String getAsalKota() {
        return asalKota;
    }
    
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    @Override
    public double hitungMasaKerja() {
        Date now = new Date();
        long temp1 = Math.abs(now.getTime() - getTglMulaiKerja().getTime());
        double temp2 = temp1 / (1000.0 * 60 * 60 * 24 * 365);
        return temp2 + 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Petani ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Asal Kota: " + getAsalKota());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
}
