package Pertemuan6.ResponsiP6;

public class Main {
    public static void main(String[] args) {
        RuangDepartemen departemenInformatika = new RuangDepartemen(
            "DEPT-INF-01", 15, 10, 4.5, 50, 10, 20, 5, 
            "Departemen Informatika", "Dr. Budi Santoso", 8000
        );
        
        RuangDepartemen departemenSistem = new RuangDepartemen(
            "DEPT-SIS-01", 12, 8, 4, 40, 8, 15, 4, 
            "Departemen Sistem Informasi", "Dr. Sri Wahyuni", 7500
        );
        
        // Membuat ruang dosen dengan tarif kebersihan berbeda
        RuangDosen ruangDosenInformatika = new RuangDosen(
            "DOS-INF-01", 5, 4, 3, 2, 
            "Dr. Ahmad Zaki", 2, 1, "Departemen Informatika", 6500
        );
        
        RuangDosen ruangDosenSistem = new RuangDosen(
            "DOS-SIS-01", 4, 3, 2.5, 1, 
            "Dr. Eko Nugroho", 1, 1, "Departemen Sistem Informasi", 6200
        );
        
        System.out.println("=== Informasi Ruang Departemen Informatika ===");
        departemenInformatika.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + departemenInformatika.hitungBiayaKebersihan());
        
        System.out.println("\n=== Informasi Ruang Departemen Sistem Informasi ===");
        departemenSistem.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + departemenSistem.hitungBiayaKebersihan());
        
        System.out.println("\n=== Informasi Ruang Dosen Informatika ===");
        ruangDosenInformatika.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + ruangDosenInformatika.hitungBiayaKebersihan());
        
        System.out.println("\n=== Informasi Ruang Dosen Sistem Informasi ===");
        ruangDosenSistem.printInfo();
        System.out.println("Biaya Kebersihan: Rp " + ruangDosenSistem.hitungBiayaKebersihan());
        
        // Demonstrasi perubahan tarif
        System.out.println("\n=== Perubahan Tarif ===");
        departemenInformatika.setTarifBiayaKebersihan(9000);
        System.out.println("Tarif Baru Departemen Informatika: Rp " + departemenInformatika.getTarifBiayaKebersihan());
    }
}