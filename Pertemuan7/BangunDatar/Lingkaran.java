/*
* Nama File    : Lingkaran.java
* Deskripsi    : file class Lingkaran
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.BangunDatar;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}