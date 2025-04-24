/*
* Nama File    : Vehicle.java
* Deskripsi    : parent class dari Bus dan Car
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/

package Pertemuan6.Vehicle;

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}

