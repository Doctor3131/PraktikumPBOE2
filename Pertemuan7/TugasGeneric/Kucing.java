/*
* Nama File    : Kucing.java
* Deskripsi    : class kucing child dari anabul
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 25/04/25
*/


package Pertemuan7.TugasGeneric;

public class Kucing extends Anabul {
    // Constructor
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println("Kucing bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println("Kucing berbunyi meong");
    }
}