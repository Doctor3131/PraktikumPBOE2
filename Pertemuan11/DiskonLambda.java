/*
* Nama File    : DiskonLambda.java
* Deskripsi    : Ekspresi lambda dasar
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : Kamis 5 Juni 2025
*/


package Pertemuan11;

interface IDiskon {
    public double hitungDiskon(int harga);
}


public class DiskonLambda {
    
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Merdeka: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Merdeka: " + diskonBiasa.hitungDiskon(45000));
    }
}
