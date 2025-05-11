/*
* Nama File    : BangunDatar.java
* Deskripsi    : merupakan kelas bangun datar
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package BangunDatar;

abstract class BangunDatar {
    public abstract double luas();
    public abstract double keliling();
}

class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luas() {
        return sisi * sisi;
    }
    
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}