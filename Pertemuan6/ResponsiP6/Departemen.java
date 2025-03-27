/*
* Nama File    : Departemen.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 27 Maret 2025
*/
package Pertemuan6.ResponsiP6;

public interface Departemen {
    String getNamaDepartemen();
    String getNamaKetuaDepartemen();
    void tampilkanInformasiDepartemen();
    
    double getTarifBiayaKebersihan();
    void setTarifBiayaKebersihan(double tarif);
}