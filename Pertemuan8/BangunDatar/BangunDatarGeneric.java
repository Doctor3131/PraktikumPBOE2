/*
* Nama File    : BangunDatarGeneric.java
* Deskripsi    : merupakan file generic dari kelas bangun datar
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/

package BangunDatar;

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    
    public T get() {
        return bangunDatar;
    }
    
    public double hitungLuas() {
        return bangunDatar.luas();
    }
    
    public double hitungKeliling() {
        return bangunDatar.keliling();
    }
}
