public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;
    
    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    void setAwal(Titik Ta) {
        awal = Ta;
    }

    void setAkhir(Titik Tb) {
        akhir = Tb;
    }

    Titik getAwal() {
        return awal;
    }

    Titik getAkhir() {
        return akhir;
    }

    static int getCounter() {
        return counterGaris;
    }

    
}
