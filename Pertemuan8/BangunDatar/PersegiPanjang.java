/*
* Nama File    : PersegiPanjang.java
* Deskripsi    : merupakan kelas persegi panjang
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/

package BangunDatar;

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
    
    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}
