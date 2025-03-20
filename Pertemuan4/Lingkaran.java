/*
* Nama File    : Lingkaran.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 13 Maret 2025
*/

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {

    }

    public Lingkaran(double diameter, String border, String warna) {
        this.jari = diameter/2;
        setBorder(border);
        setWarna(warna);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }
}
