/*
* Nama File    : Anabul.java
* Deskripsi    : parent class anabul
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 25/04/25
*/


package Pertemuan7.TugasGeneric;

public class Anabul {
    private String nama;
    
    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    // Selector 
    public String getNama() {
        return nama;
    }
    
    // Mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void gerak() {
        System.out.println("Anabul bergerak");
    }
    
    public void bersuara() {
        System.out.println("Anabul bersuara");
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.print("Suara: ");
        bersuara();
        System.out.print("Gerakan: ");
        gerak();
        System.out.println();
    }
}