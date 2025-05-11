/*
* Nama File    : ArrayList.java
* Deskripsi    : program penggunaan objek ArrayList sebagai collection class
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package Pertemuan8.Collection;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generik");
        strings.remove("praktikum");

        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}
