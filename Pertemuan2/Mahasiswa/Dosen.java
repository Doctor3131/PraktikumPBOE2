package Mahasiswa;

/*
* Nama File    : Dosen.java
* Deskripsi    : class file dosen
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Maret 2025
*/


public class Dosen {
    /*******************ATRIBUT**********************/
    private String nip;
    private String nama;
    private String prodi;

    /*******************METHOD***********************/
    public Dosen() {
        nip = "54326590238754";
        nama = "Alan Suryajana";
        prodi = "Informatika";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }


}
