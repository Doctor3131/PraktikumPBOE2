/*
* Nama File    : LambdaList.java
* Deskripsi    : Implementasi lamda pada list
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 5 Juni 2025
*/


package Pertemuan11;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}