/*
* Nama File    : Main.java
* Deskripsi    : merupakan main file dari kelas / tugas koleksi
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package Koleksi;

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        
        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.add('D');
        koleksiKarakter.add('E');
        koleksiKarakter.add('F');
        koleksiKarakter.add('G');
        koleksiKarakter.add('H');
        koleksiKarakter.add('I');
        koleksiKarakter.add('J');
        
        System.out.println("Koleksi awal:");
        koleksiKarakter.showAll();
        
        System.out.println("\nMengubah karakter pada indeks 3 menjadi 'X'");
        koleksiKarakter.setIsi(3, 'X');
        
        System.out.println("\nKoleksi setelah diubah:");
        koleksiKarakter.showAll();
        
        System.out.println("\nMengambil elemen pada indeks 5: " + koleksiKarakter.getIsi(5));
        
        System.out.println("\nMenghapus elemen pada indeks 7");
        koleksiKarakter.delete(7);
        
        System.out.println("\nKoleksi setelah penghapusan:");
        koleksiKarakter.showAll();
        
        System.out.println("\nUkuran koleksi saat ini: " + koleksiKarakter.getSize());
    }
}