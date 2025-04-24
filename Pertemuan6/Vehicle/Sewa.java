/*
* Nama File    : Sewa.java
* Deskripsi    : main class
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/

package Pertemuan6.Vehicle;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
