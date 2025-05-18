/*
* Nama File    : ReadSerializedPerson.java
* Deskripsi    : file ReadSerializedPerson
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 16 Mei 2025
*/


package Pertemuan9.Persistent;

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
