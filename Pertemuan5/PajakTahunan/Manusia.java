/*
 * Nama File    : Manusia.java
 * Pembuat      : Siriel Wafa Nuriel Fahri
 * Tanggal      : 22 Februari 2025
 */

package Pertemuan5.PajakTahunan;
import java.util.Date;


public abstract class Manusia {
    protected String nama;
    protected String alamat;
    protected double pendapatan;
    private Date tglMulaiKerja;
    private static int counterMns = 0;

    

    public Manusia(String nama, Date tglMulaiKerja, double pendapatan, String alamat) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan = pendapatan;
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setTglMulaiKerja(Date tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public Date getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract double hitungMasaKerja();
    
    public abstract void cetakInfo();

}
