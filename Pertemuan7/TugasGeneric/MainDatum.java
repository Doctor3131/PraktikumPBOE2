/*
* Nama File    : MainDatum.java
* Deskripsi    : file main dari Datum
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.TugasGeneric;

public class MainDatum {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI KELAS GENERIK DATUM ===");
        
        // Membuat objek dari kelas turunan Anabul
        Kucing kucing = new Kucing("Meow");
        Anjing anjing = new Anjing("Buddy");
        Burung burung = new Burung("Tweet");
        
        // Membuat objek Datum untuk masing-masing hewan
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        
        // Mensimulasikan perilaku hewan melalui Datum
        System.out.println("\n--- Simulasi Kucing melalui Datum ---");
        datumKucing.tampilkanIsi();
        
        System.out.println("\n--- Simulasi Anjing melalui Datum ---");
        datumAnjing.tampilkanIsi();
        
        System.out.println("\n--- Simulasi Burung melalui Datum ---");
        datumBurung.tampilkanIsi();
        
        // Mencoba mengubah nilai
        System.out.println("\n--- Mengubah Nilai Datum Kucing ---");
        Kucing kucingBaru = new Kucing("Kitty");
        datumKucing.setIsi(kucingBaru);
        datumKucing.tampilkanIsi();
        
        // Mencoba dengan tipe data lain
        Datum<String> datumString = new Datum<>("Ini adalah string");
        System.out.println("\n--- Datum dengan String ---");
        datumString.tampilkanIsi();
        
        Datum<Integer> datumInteger = new Datum<>(42);
        System.out.println("\n--- Datum dengan Integer ---");
        datumInteger.tampilkanIsi();
    }
}