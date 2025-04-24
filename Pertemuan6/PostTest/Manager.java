/*
* Nama File    : Manager.java
* Deskripsi    : sub class dari Pegawai
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/


package Pertemuan6.PostTest;

public class Manager extends Pegawai{
    private int tunjungan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjungan);
    }
}
