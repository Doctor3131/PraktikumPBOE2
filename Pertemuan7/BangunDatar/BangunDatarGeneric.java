/*
* Nama File    : BangunDatarGeneric.java
* Deskripsi    : file class BangunDatarGeneric
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/


package Pertemuan7.BangunDatar;

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}