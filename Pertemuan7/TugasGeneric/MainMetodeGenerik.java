/*
* Nama File    : MainMetodeGenerik.java
* Deskripsi    : file main class MetodeGenerik
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.TugasGeneric;


public class MainMetodeGenerik {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI CONTOH METODE GENERIK ===");
        
        MetodeGenerik cmg = new MetodeGenerik();
        
        Kucing kucing = new Kucing("Meow");
        Anjing anjing = new Anjing("Buddy");
        Burung burung = new Burung("Tweet");
        
        Datum<Kucing> datumKucing = cmg.buatDatum(kucing);
        Datum<Anjing> datumAnjing = cmg.buatDatum(anjing);
        Datum<Burung> datumBurung = cmg.buatDatum(burung);
        
        cmg.tampilkanInfoDatum(datumKucing);
        cmg.tampilkanInfoDatum(datumAnjing);
        cmg.tampilkanInfoDatum(datumBurung);
        
        cmg.simulasiAnabul(datumKucing);
        cmg.simulasiAnabul(datumAnjing);
        cmg.simulasiAnabul(datumBurung);
        
        Kucing kucingBaru = new Kucing("Kitty");
        System.out.println("Sebelum diubah:");
        cmg.tampilkanInfoDatum(datumKucing);
        
        cmg.ubahNilai(datumKucing, kucingBaru);
        System.out.println("\nSetelah diubah:");
        cmg.tampilkanInfoDatum(datumKucing);
        
        Datum<String> datumString = cmg.buatDatum("Ini adalah string");
        Datum<Integer> datumInteger = cmg.buatDatum(42);
        
        System.out.println("\n=== DATUM DENGAN TIPE DATA LAIN ===");
        cmg.tampilkanInfoDatum(datumString);
        cmg.tampilkanInfoDatum(datumInteger);
        
        System.out.println("\n=== MEMBUAT DATUM KOSONG DAN MENGISINYA ===");
        Datum<Anabul> datumAnabulKosong = cmg.buatDatumKosong();
        cmg.tampilkanInfoDatum(datumAnabulKosong);
        
        Anabul anabulBaru = new Anabul("Hewan Baru");
        cmg.ubahNilai(datumAnabulKosong, anabulBaru);
        System.out.println("\nSetelah diisi:");
        cmg.tampilkanInfoDatum(datumAnabulKosong);
    }
}