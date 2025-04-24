package Mahasiswa;

public class MataKuliah {
    /*******************ATRIBUT**********************/
    private String idMatKul;
    private String nama;
    private int sks;

    /*******************METHOD***********************/
    public MataKuliah() {
        idMatKul = "01";
        nama = "Matematika";
        sks = 3;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return idMatKul;
    }
    
    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
