/*
* Nama File    : MapTest.java
* Deskripsi    : program yang menggunakan generik untuk pasangan Kunci-Nilai
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package Pertemuan8.Collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>(); 
        map.put(1, "Satu");
        map.put(2, "Dua");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();

        System.out.println("hasil dengan forEach");

        for(Integer k : key) {
            System.out.println(map.get(k));
        }
    }
}
