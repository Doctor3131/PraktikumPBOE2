/*
 * Nama File    : Pengusaha.java
 * Pembuat      : Siriel Wafa Nuriel Fahri
 * Tanggal      : 22 Februari 2025
 */


package Pertemuan5.PajakTahunan;
import java.util.Date;


public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, Date tglMulaiKerja, double pendapatan, String alamat, String npwp) {
        super(nama, tglMulaiKerja, pendapatan, alamat);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungMasaKerja() {
        Date now = new Date();
        long temp1 = Math.abs(now.getTime() - getTglMulaiKerja().getTime());
        double temp2 = temp1 / (1000.0 * 60 * 60 * 24 * 365);
        return temp2 + 3;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Pengusaha ===");
        System.out.println("Nama: " + getNama());
        System.out.println("NPWP: " + getNpwp());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
}
