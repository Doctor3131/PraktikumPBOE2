/*
* Nama File    : MetodeGenerik.java
* Deskripsi    : file class MetodeGenerik
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.TugasGeneric;

public class MetodeGenerik {
    
    public <T> Datum<T> buatDatum(T nilai) {
        return new Datum<T>(nilai);
    }
    
    public <T> Datum<T> buatDatumKosong() {
        return new Datum<T>();
    }
    
    public <T> void ubahNilai(Datum<T> datum, T nilaiBaru) {
        datum.setIsi(nilaiBaru);
    }
    
    public <T extends Pertemuan7.TugasGeneric.Anabul> void simulasiAnabul(Datum<T> datum) {
        T anabul = datum.getIsi();
        if (anabul != null) {
            System.out.println("\n--- Simulasi " + anabul.getClass().getSimpleName() + " ---");
            System.out.println("Nama: " + anabul.getNama());
            System.out.print("Suara: ");
            anabul.bersuara();
            System.out.print("Gerakan: ");
            anabul.gerak();
        } else {
            System.out.println("Datum kosong, tidak bisa melakukan simulasi");
        }
    }
    
    public void tampilkanInfoDatum(Datum<?> datum) {
        System.out.println("\n=== Info Datum ===");
        datum.tampilkanIsi();
    }
}