/*
* Nama File    : BangunDatarGenericTest.java
* Deskripsi    : file class BangunDatarGenericTest
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1/05/2025
*/

package Pertemuan7.BangunDatar;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2); 
        
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>(); 
        bdg.set(l); 
        
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling()); 
        System.out.println("tipe generic : " + bdg.get().getClass().getName()); 
    }
}