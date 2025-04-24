/*
 * Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Siriel Wafa Nuriel Fahri
 * Tanggal      : 20 Februari 2025
 */

public class Titik {
    /*******************ATRIBUT**********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*******************METHOD***********************/
    // konstruktor untuk membuat titik (0,0) dan menyimpan jumlah object titik di class Titik
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    // konstruktor untuk membuat titik (x,y) dan menyimpan jumlah object titik di class Titik
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    } 

    // mengembalikan nilai absis 
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // merubah nilai absis dengan x
    void setAbsis(double x) {
        absis = x;
    }

    // merubah nilai ordinat dengan y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser titik 
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // menampilkan nilai titik
    void printTitik() {
        System.out.println("Titik ( " + absis + " , " + ordinat + " )");
    }

    // mengembalikan nilai CounterTitik yaitu n banyak titik yang dibuat
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai kuadran titik tersebut
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else { 
            return -1; // jika tidak masuk ke kuadran
        }
    }

    // mengembalikan nilai jarak titik dari titik pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    } 
    
    // mengembalikan nilai jarak titik dengan titik T
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    // membuat refleksi sumbu x dari titik
    void refleksiX() {
        System.out.println("Refleksi sumbu X titik (" + this.getAbsis() + "," + this.getOrdinat() + ") adalah: " + this.getAbsis() + "," + this.getOrdinat()*-1);
    }

    // membuat refleksi sumbu y dari titik
    void refleksiY() {
        System.out.println("Refleksi sumbu Y titik (" + this.getAbsis() + "," + this.getOrdinat() + ") adalah: " + this.getAbsis()*-1 + "," + this.getOrdinat());
    }

    // mengembalikan nilai refksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, ordinat*-1);
    }

    // mengembalikan nilai refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(absis*-1, ordinat);
    }

    String getTitikStr() { 
        return "( " + getAbsis() + "," + getOrdinat() + " )";
    }
}

