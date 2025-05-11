/*
* Nama File    : KoleksiAnabul.java
* Deskripsi    : merupakan kelas implementasi collection pada anabul
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package Pertemuan8.HewanPeliharaan;

public class KoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(10);
        
        koleksiAnabul.add(new Kucing("aku"));
        koleksiAnabul.add(new Anjing("suka"));
        koleksiAnabul.add(new Burung("kamu"));
        koleksiAnabul.add(new Kucing("dia"));
        koleksiAnabul.add(new Anjing("juga"));
        koleksiAnabul.add(new Burung("suka"));
        koleksiAnabul.add(new Kucing("aku"));
        koleksiAnabul.add(new Anjing("ayo"));
        koleksiAnabul.add(new Burung("nikah"));
        koleksiAnabul.add(new Kucing("sayang"));
        
        System.out.println("KOLEKSI ANABUL");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            System.out.println("\nAnabul " + (i+1) + ":");
            System.out.println("Nama: " + koleksiAnabul.getIsi(i).getNama());
            System.out.print("Suara: ");
            koleksiAnabul.getIsi(i).bersuara();
            System.out.print("Gerakan: ");
            koleksiAnabul.getIsi(i).gerak();
        }
    }
}

