/*
* Nama File    : Student.java
* Deskripsi    : sub class dari Person
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 24/04/2025
*/


package Pertemuan6.Person;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) {
        return 2 < hr || 8 > hr;
    }
}
