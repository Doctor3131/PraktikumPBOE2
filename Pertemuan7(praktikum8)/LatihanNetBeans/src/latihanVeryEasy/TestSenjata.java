
package latihanVeryEasy;

/*
* Nama File    : TestSenjata.java
* Deskripsi    : test/main file untuk latihanVeryEasy
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 1 Mei 2025
*/

public class TestSenjata {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
