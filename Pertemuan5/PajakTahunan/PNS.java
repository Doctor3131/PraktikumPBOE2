package Pertemuan5.PajakTahunan;

import java.util.Date;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, Date tglMulaiKerja, double pendapatan, String alamat, String nip) {
        super(nama, tglMulaiKerja, pendapatan, alamat);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, Date tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan, "");
        this.nip = nip;
        counterPNS++;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getNIP() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungMasaKerja() {
        Date now = new Date();
        long temp1 = Math.abs(now.getTime() - getTglMulaiKerja().getTime());
        double temp2 = temp1 / (1000.0 * 60 * 60 * 24 * 365);
        return temp2 + 5;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi PNS ===");
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNIP());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
        System.out.println();
    }
    

}
