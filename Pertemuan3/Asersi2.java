/*
* Nama File    : Asersi2.java
* Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 6 Maret 2025
*/

class LingkaranAsersi {
    private double jariJari;

    public LingkaranAsersi(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -2;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!"; 
        // asersi kurang tepat karena dia mencek jari2 jangan negatif bukan jangan nol
        LingkaranAsersi I = new LingkaranAsersi(jariJari);
        double kelilingLingkaran = I.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
