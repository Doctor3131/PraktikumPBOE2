/*
* Nama File    : Anjing.java
* Deskripsi    : child class dari anabul, class Anjing
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 25/04/25
*/


package Pertemuan8.HewanPeliharaan;

public class Anjing extends Anabul {
    // Constructor
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println("Anjing bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara guk-guk");
    }
}