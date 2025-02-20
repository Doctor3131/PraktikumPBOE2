public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    } 

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik ( " + absis + " , " + ordinat + " )");
    }

    static int getCounterTitik() {
        return counterTitik;
    }
}
