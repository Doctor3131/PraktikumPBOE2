package latihanMedium;

/*
* Nama File    : KontrolSenjata.java
* Deskripsi    : class KontrolSenjata yang berguna untuk mengontrol senjatanya file untuk latihanMedium
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Mei 2025
*/


public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (senjata.getPeluru() <= 0) {
            System.out.println("Peluru Habis");
            return;
        }
        
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
    
    public void isiPeluru(int jumlahPeluru) {
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
    }
    
    public void pasangBayone() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb! Menusuk musuh";
        } else {
            return "Gagal! Tidak ada bayonet";
        }
    }

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
     
}