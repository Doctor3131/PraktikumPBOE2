/*
* Nama File    : Person.java
* Deskripsi    : sub class dari Pegawai
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/


package Pertemuan6.Person;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isAsleep(int hr) {
        return 22 < hr || 7 > hr;
    }

    public String toString() {
        return name;
    }

    public void status (int hr) {
        if (this.isAsleep(hr)) {
            System.out.println("Now offline: " + this );
        } else {
            System.out.println("Now online: " + this );
        }
    }
}
