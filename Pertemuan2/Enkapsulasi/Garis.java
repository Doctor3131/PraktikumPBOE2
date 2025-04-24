package Enkapsulasi;
/*
* Nama File    : Garis.java
* Deskripsi    : File Class Garis
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 20 Februari 2025
*/

public class Garis {
    /*******************ATRIBUT**********************/
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;
    
    /*******************METHOD***********************/
    // konstruktor
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    public Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // setter
    public void setAwal(Titik Ta) {
        awal = Ta;
    }

    public void setAkhir(Titik Tb) {
        akhir = Tb;
    }

    // getter
    public Titik getAwal() {
        return awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    // getter static
    public static int getCounter() {
        return counterGaris;
    }

    public double getPanjangGaris() {
        return awal.getJarak(akhir);
    }

    public double getGradien() {
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    public Titik getTitikTengah() {
        return new Titik((akhir.getAbsis() + awal.getAbsis())/2, (akhir.getOrdinat() + awal.getOrdinat())/2);
    }

    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    public void printGaris() {
        System.out.println(getGarisStr());
    }

    public void printPersamaanGaris() {
        String a = "y = ";
        String b = getGradien() + "x ";
        double temp = (getGradien() * awal.getAbsis()) - awal.getOrdinat();
        String c = "- " + temp;
        if (temp > 0) c = "+ " + temp; 

        System.out.println(a + b + c);
    }

    public String getGarisStr() {
        return "[ " + getAwal().getTitikStr() + "," + getAkhir().getTitikStr() + " ]" ; 
    }

}
