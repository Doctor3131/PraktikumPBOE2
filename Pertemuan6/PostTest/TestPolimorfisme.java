/*
* Nama File    : TestPolimorfisme.java
* Deskripsi    : main class
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/

package Pertemuan6.PostTest;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
