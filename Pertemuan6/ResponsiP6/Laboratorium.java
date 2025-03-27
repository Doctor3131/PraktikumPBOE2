package Pertemuan6.ResponsiP6;

interface Laboratorium {
    String getNamaLaboratorium();
    double getHargaSewa();
    void tampilkanInformasiLaboratorium();
    
    default int getJumlahKomputer() {
        return 0; 
    }
    
    default String getJenisLaboratorium() {
        return "Umum"; 
    }
    
    default String[] getMataKuliah() {
        return new String[0]; 
    }
}