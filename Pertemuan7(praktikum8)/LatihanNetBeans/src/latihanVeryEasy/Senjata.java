package latihanVeryEasy;

/*
* Nama File    : Senjata.java
* Deskripsi    : class Senjata untuk latihanVeryEasy
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Mei 2025
*/


public class Senjata {
    
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak() {
        System.out.print(getBunyi() + " ");
        this.peluru -= 1;
        System.out.println("\nSisa Peluru: " + this.peluru);
    }
}

