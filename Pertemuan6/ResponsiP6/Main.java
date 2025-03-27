package Pertemuan6.ResponsiP6;

public class Main {
    public static void main(String[] args) {
        // Membuat laboratorium komputer
        LabKomputer labKomputer = new LabKomputer(
            "LAB-KOM-01", 10, 8, 3.5, 30, "Lab Komputer Utama", 500000, 25
        );
        
        // Membuat laboratorium non-komputer
        LaboratoriumNonKomputer labBiologi = new LaboratoriumNonKomputer(
            "LAB-BIO-01", 12, 9, 4, 25, "Lab Biologi Pusat", 750000, 
            "Biologi", new String[]{"Biologi Umum", "Mikrobiologi"}
        );
        
        // Menampilkan informasi
        System.out.println("=== Informasi Laboratorium Komputer ===");
        labKomputer.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + labKomputer.cekTarifBiayaKebersihan(0));
        
        System.out.println("\n=== Informasi Laboratorium Biologi ===");
        labBiologi.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + labBiologi.cekTarifBiayaKebersihan(0));
    }
}
