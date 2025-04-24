/*
* Nama File    : AngkaSial.java
* Deskripsi    : Program penggunaan exception buatan sendiri, pengenalan 'throw' dan 'throws'
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 6 Maret 2025
*/


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        } 
    }
}

/*
Baris 12 tidak dieksekusi ketika eksepsi terjadi
hal ini dikarenakan ketika angka == 13, langusung throw new AngkaSialException()
*/ 

/*
Baris 21 dieksekusi pada cobaAngka(13) karena kena throw pada kondisional angka == 13
lalu di catch oleh baris 21
*/ 