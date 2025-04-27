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
        Programmer pegawai4 = new Programmer("Arem");
        Programmer pegawai5 = new Programmer("Ma");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*
 * Penjelasan Manfaat Polimorfisme
 * Kita dapat secara langsung mengelompokkan pelbagai pegawai ke dalam ArrayList
 */