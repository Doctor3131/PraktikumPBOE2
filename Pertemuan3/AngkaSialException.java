/*
* Nama File    : AngkaSialException.java
* Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 6 Maret 2025
*/


public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan masukan angka 13 karena angka sial");
    }
}
