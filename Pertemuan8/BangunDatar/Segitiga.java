/*
* Nama File    : Segitiga.java
* Deskripsi    : merupakan kelas Segitiga
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/

package BangunDatar;

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    public double getAlas() {
        return alas;
    }
    
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
    
    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}