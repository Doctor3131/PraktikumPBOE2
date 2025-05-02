package LatihanTutorial;

/*
* Nama File    : Senjata.java
* Deskripsi    : class Senjata untuk LatihanTutorial
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Mei 2025
*/

public class Senjata {
    
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public Senjata(String bunyi, boolean menusuk) {
        this.bunyi = bunyi;
        this.menusuk = menusuk;
    }

    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " "); 
        }
        System.out.println(""); 
}

    public void pasangBayonet() {
        setMenusuk(true); 
        System.out.println("Bayonet Terpasang"); 
    }

    public String menusuk() {
        if (isMenusuk()) { 
            return "Jleb! "; 
        } else {
            return "Gagal, belum pasang bayonet"; 
        }
    }
}
