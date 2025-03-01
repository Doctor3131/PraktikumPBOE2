package Mahasiswa;

/*
* Nama File    : MAIN FILE MAHASISWA
* Deskripsi    : merupakan main file
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Maret 2025
*/


public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");

        // Membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        // Menghubungkan mahasiswa dengan dosen wali dan kendaraan
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah ke daftar mahasiswa
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan jumlah SKS yang diambil
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
