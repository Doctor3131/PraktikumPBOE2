/*
* Nama File    : Datum.java
* Deskripsi    : file class Datum
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.TugasGeneric;

public class Datum<T> {
    private T isi;
    
    // Constructor
    public Datum() {
        this.isi = null;
    }
    
    public Datum(T isi) {
        this.isi = isi;
    }
    
    // Getter 
    public T getIsi() {
        return isi;
    }
    
    // Setter 
    public void setIsi(T isi) {
        this.isi = isi;
    }
    
    public void tampilkanIsi() {
        if (isi != null) {
            System.out.println("Isi Datum: " + isi);
            
            if (isi instanceof Pertemuan6.HewanPeliharaan.Anabul) {
                Pertemuan6.HewanPeliharaan.Anabul anabul = (Pertemuan6.HewanPeliharaan.Anabul) isi;
                System.out.println("Nama Anabul: " + anabul.getNama());
                System.out.print("Suara: ");
                anabul.bersuara();
                System.out.print("Gerakan: ");
                anabul.gerak();
            }
        } else {
            System.out.println("Datum kosong");
        }
    }
}