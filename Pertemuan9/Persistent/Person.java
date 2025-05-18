/*
* Nama File    : Person.java
* Deskripsi    : file Person
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 16 Mei 2025
*/


package Pertemuan9.Persistent;

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
}
