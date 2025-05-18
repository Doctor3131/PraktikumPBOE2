/*
* Nama File    : Serializable.java
* Deskripsi    : file Serializable
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 16 Mei 2025
*/


package Pertemuan9.Persistent;

import java.io.*;

class Person implements Serializable {
    private String name;
    public Person (String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SrializablePerson{
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try{
            FileOutputStream f= new FileOutputStream("person.ser");
            ObjectOutputStream s= new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}