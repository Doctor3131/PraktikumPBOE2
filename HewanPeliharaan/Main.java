package Pertemuan6.HewanPeliharaan;

// File: MainProgram.java
public class Main {
    public static void main(String[] args) {
        Anabul anabul = new Anabul("Hewan Peliharaan");
        
        Kucing kucing = new Kucing("aku");
        Anjing anjing = new Anjing("suka");
        Burung burung = new Burung("kamu");
        
        System.out.println("=== DEMONSTRASI POLIMORFISME ANABUL ===");
        
        System.out.println("\n--- Info Anabul (Kelas Induk) ---");
        anabul.displayInfo();
        
        System.out.println("\n--- Info Kucing ---");
        kucing.displayInfo();
        
        System.out.println("\n--- Info Anjing ---");
        anjing.displayInfo();
        
        System.out.println("\n--- Info Burung ---");
        burung.displayInfo();
        
        System.out.println("\n=== DEMONSTRASI MENGGUNAKAN ARRAY POLIMORFIK ===");
        
        Anabul[] daftarAnabul = new Anabul[4];
        daftarAnabul[0] = anabul;
        daftarAnabul[1] = kucing;
        daftarAnabul[2] = anjing;
        daftarAnabul[3] = burung;
        
        System.out.println("\nMensimulasikan semua bunyi dan gerakan setiap tipe anabul:");
        for (int i = 0; i < daftarAnabul.length; i++) {
            System.out.println("\nAnabul " + (i+1) + " (" + daftarAnabul[i].getNama() + "):");
            System.out.print("Suara: ");
            daftarAnabul[i].bersuara();
            System.out.print("Gerakan: ");
            daftarAnabul[i].gerak();
        }
    }
}