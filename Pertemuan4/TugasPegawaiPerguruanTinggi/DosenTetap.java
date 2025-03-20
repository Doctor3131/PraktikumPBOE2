/*
* Nama File    : DosenTetap.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 14 Maret 2025
*/


import java.util.Calendar;
import java.util.Date;

class DosenTetap extends Pegawai {
    private String NIDN;
    private Date BUP;

    public DosenTetap(String NIP, String NIDN, String nama, Date tanggalLahir, Date TMT, double gajiPokok) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.BUP = hitungBUP();
    }

    private Date hitungBUP() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggalLahir);
        cal.add(Calendar.YEAR, 65);
        return cal.getTime();
    }

    public double hitungTunjangan() {
        return 0.02 * (hitungMasaKerja() / 12) * gajiPokok;
    }

    public void printInfo() {
        System.out.println("===== Dosen Tetap =====");
        System.out.println("NIDN : " + NIDN);
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + sdf.format(tanggalLahir));
        System.out.println("TMT : " + sdf.format(TMT));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : Fakultas Sains dan Matematika");
        System.out.println("Masa Kerja : " + (hitungMasaKerja() / 12) + " tahun " + (hitungMasaKerja() % 12) + " bulan");
        System.out.println("BUP : " + sdf.format(BUP));
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : 2% x " + (hitungMasaKerja() / 12) + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}