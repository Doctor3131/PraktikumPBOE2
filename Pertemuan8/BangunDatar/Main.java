/*
* Nama File    : Main.java
* Deskripsi    : merupakan main file dari kelas bangun datar
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/

package BangunDatar;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        BangunDatarGeneric<Persegi> bdGenericPersegi = new BangunDatarGeneric<>();
        bdGenericPersegi.set(persegi);
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 3);
        BangunDatarGeneric<PersegiPanjang> bdGenericPersegiPanjang = new BangunDatarGeneric<>();
        bdGenericPersegiPanjang.set(persegiPanjang);
        
        Segitiga segitiga = new Segitiga(3, 4, 3, 4, 5);
        BangunDatarGeneric<Segitiga> bdGenericSegitiga = new BangunDatarGeneric<>();
        bdGenericSegitiga.set(segitiga);
        
        System.out.println("Sisi: " + bdGenericPersegi.get().getSisi());
        System.out.println("Luas: " + bdGenericPersegi.hitungLuas());
        System.out.println("Keliling: " + bdGenericPersegi.hitungKeliling());
        
        System.out.println("Panjang: " + bdGenericPersegiPanjang.get().getPanjang());
        System.out.println("Lebar: " + bdGenericPersegiPanjang.get().getLebar());
        System.out.println("Luas: " + bdGenericPersegiPanjang.hitungLuas());
        System.out.println("Keliling: " + bdGenericPersegiPanjang.hitungKeliling());
        
        System.out.println("Alas: " + bdGenericSegitiga.get().getAlas());
        System.out.println("Tinggi: " + bdGenericSegitiga.get().getTinggi());
        System.out.println("Luas: " + bdGenericSegitiga.hitungLuas());
        System.out.println("Keliling: " + bdGenericSegitiga.hitungKeliling());
    }
}