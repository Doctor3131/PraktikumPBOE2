package Pertemuan6.ResponsiP6;

abstract class Ruang implements TarifKebersihan {
    protected String kode;
    protected double tinggi;
    protected double lebar;
    protected double panjang;
    protected int kapasitas;

    public Ruang() {

    }

    public Ruang(String kode, double tinggi, double lebar, double panjang, int kapasitas) {
        this.kode = kode;
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.panjang = panjang;
        this.kapasitas = kapasitas;
    }

    public String getKode() {
        return kode;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    } 

    public void printInfo() {
        System.out.println("Kode Ruang: " + kode);
        System.out.println("Tinggi: " + tinggi + " m");
        System.out.println("Lebar: " + lebar + " m");
        System.out.println("Panjang: " + panjang + " m");
        System.out.println("kapasitas: " + kapasitas + " orang");
    }

    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * getTarifDefaultKebersihan();
    }
}
