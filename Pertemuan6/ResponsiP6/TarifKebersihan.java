/*
* Nama File    : TarifKebersihan.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Pertemuan6.ResponsiP6;

public interface TarifKebersihan {

    double TARIF_RUANG_KELAS = 5000;
    double TARIF_LAB_KOMPUTER = 5000;
    double TARIF_LAB_NON_KOMPUTER = 5000;

    default double getTarifDefaultKebersihan() {
        return 0; 
    }

    default double hitungBiayaKebersihan() {
        return 0; 
    }
}
