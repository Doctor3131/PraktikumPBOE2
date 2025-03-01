package Mahasiswa;
import java.util.ArrayList;

/*
* Nama File    : Mahasiswa.java
* Deskripsi    : file class mahasiswa
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Maret 2025
*/

public class Mahasiswa {
    /*******************ATRIBUT**********************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*******************METHOD***********************/
    public Mahasiswa() {
        this("24060123120035", "Siriel Fahri", "Informatika");
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatkul = new ArrayList<>(50);
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();

    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }

    public void addMatKul(MataKuliah matKul) {
        listMatkul.add(matKul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatkul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println(" NIM: " + getNim());
        System.out.println(" NAMA: " + getNama());
        System.out.println(" PRODI: " + getprodi());
    }

    public void printDetailMhs() {
        System.out.println("");
        System.out.println("DATA MAHASISWA");
        printMhs();
        System.out.println("");
        System.out.println("DAFTAR MATKUL YANG DIAMBIL");
        for (MataKuliah mk : listMatkul) {
            System.out.println(" " + mk.getNama());
        }
        System.out.println("");
        System.out.print("DOSEN: ");
        System.out.println(dosenWali.getNama());
        System.out.println("");
        System.out.print("KENDARAAN KULIAH: ");
        System.out.println(kendaraan.jenis());
        System.out.println("");
    }
}
