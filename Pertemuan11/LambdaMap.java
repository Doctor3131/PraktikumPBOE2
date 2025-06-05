/*
* Nama File    : LambdaMap.java
* Deskripsi    : Implementasi lamda pada list
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 5 Juni 2025
*/


package Pertemuan11;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24782374943", "sadfjlsd");
        mahasiswaMap.put("24782374945", "sadfjjfl");
        mahasiswaMap.put("24782374487", "sadfjsdf");
        mahasiswaMap.put("24782374452", "sadfdsff");

        mahasiswaMap.forEach((key, value) -> System.out.println("NIM: " +key+ " Nama: " +value));
    }
}