/*
* Nama File    : Pegawai.java
* Deskripsi    : parent class dari Programmer dan Manager
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/


package Pertemuan6.PostTest;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok: " + this.gajiPokok);
    }
}
