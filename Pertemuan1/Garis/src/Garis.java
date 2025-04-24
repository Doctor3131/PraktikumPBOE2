/*
* Nama File    : Garis.java
* Deskripsi    : File Class Garis
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 20 Februari 2025
*/


public class Garis {
    /*******************ATRIBUT**********************/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;
    
    /*******************METHOD***********************/
    // konstruktor
    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // setter
    void setAwal(Titik Ta) {
        awal = Ta;
    }

    void setAkhir(Titik Tb) {
        akhir = Tb;
    }

    // getter
    Titik getAwal() {
        return awal;
    }

    Titik getAkhir() {
        return akhir;
    }

    // getter static
    static int getCounter() {
        return counterGaris;
    }

    double getPanjangGaris() {
        return awal.getJarak(akhir);
    }

    double getGradien() {
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    Titik getTitikTengah() {
        return new Titik((akhir.getAbsis() + awal.getAbsis())/2, (akhir.getOrdinat() + awal.getOrdinat())/2);
    }

    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris() {
        System.out.println(getGarisStr());
    }

    void printPersamaanGaris() {
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
