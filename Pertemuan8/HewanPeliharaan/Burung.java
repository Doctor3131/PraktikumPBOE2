/*
* Nama File    : Burung.java
* Deskripsi    : child class dari anabul, class burung
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 25/04/25
*/


package Pertemuan8.HewanPeliharaan;

public class Burung extends Anabul {
    // Constructor
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println("Burung bergerak dengan terbang");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Burung berbunyi cuit");
    }
}
