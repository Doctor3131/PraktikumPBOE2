/*
* Nama File    : Car.java
* Deskripsi    : sub class dari Vehicle
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/

package Pertemuan6.Vehicle;

public class Car extends Vehicle{
    void calRent(int jarak, float harga) {
        float fare = jarak + harga;
        fare = fare - 1f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
