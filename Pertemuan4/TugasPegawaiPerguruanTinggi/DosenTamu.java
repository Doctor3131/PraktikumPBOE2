/*
* Nama File    : DosenTamu.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 14 Maret 2025
*/

import java.util.Date;

class DosenTamu extends Pegawai {
    private String NIDK;
    private Date tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String NIDK, String nama, Date tanggalLahir, Date TMT, double gajiPokok, Date tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public void printInfo() {
        System.out.println("\n===== Dosen Tamu =====");
        System.out.println("NIDK : " + NIDK);
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + sdf.format(tanggalLahir));
        System.out.println("TMT : " + sdf.format(TMT));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : Fakultas Sains dan Matematika");
        System.out.println("Masa Kerja : " + (hitungMasaKerja() / 12) + " tahun " + (hitungMasaKerja() % 12) + " bulan");
        System.out.println("Masa Kontrak Berakhir : 9 bulan");
        System.out.println("Tanggal Berakhir Kontrak : " + sdf.format(tanggalBerakhirKontrak));
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : 2,5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}