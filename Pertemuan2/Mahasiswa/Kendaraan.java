package Mahasiswa;

public class Kendaraan {
    /*******************ATRIBUT**********************/
    
    private String noPlat;
    private String jenis;

    /*******************METHOD***********************/
    public Kendaraan() {
        noPlat = "1234";
        jenis = "Mobil";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    } 

    public String getNoPlat() {
        return noPlat;
    }

    public String jenis() {
        return jenis;
    }
}
