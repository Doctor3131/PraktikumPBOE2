public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(), new Titik(3, 4));
        Garis G3 = new Garis(new Titik(2,2), new Titik(5,6));
        Garis G4 = new Garis(new Titik(0.5,-4), new Titik(7,0.5));


        System.out.println("G1: " + G1.getGarisStr());
        System.out.println("G2: " + G2.getGarisStr());
        System.out.println("G3: " + G3.getGarisStr());
        System.out.println("G4: " + G4.getGarisStr());
        System.out.println("banyak titik: " + Garis.getCounter());
        System.out.println("");

        // Panjang Garis
        System.out.println("Panjang garis G1: " + G1.getPanjangGaris());
        System.out.println("Panjang garis G2: " + G2.getPanjangGaris());
        System.out.println("");

        // Gradien
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.println("");
    
        // Titik Tengah
        System.out.println("Titik tengah G1: " + G1.getTitikTengah().getTitikStr());
        System.out.println("Titik tengah G2: " + G2.getTitikTengah().getTitikStr());
        System.out.println("");

        // Sejajar
        System.out.println("Apakah sejajar G1 dengan G3: " + G1.isSejajar(G3));
        System.out.println("Apakah sejajar G2 dengan G3: " + G2.isSejajar(G3));
        System.out.println("");

        // Tegak Lurus
        System.out.println("Apakah tegak lurus G1 dengan G4: " + G1.isTegakLurus(G4));
        System.out.println("Apakah tegak lurus G2 dengan G4: " + G2.isTegakLurus(G4));
        System.out.println("");
        
        // menampilkan titik awal dan akhir garis
        G1.printGaris();
        G2.printGaris();
        G3.printGaris();
        G4.printGaris();
        System.out.println("");

        // menampilkan persamaan garis dalam bentuk string
        G1.printPersamaanGaris();
        G2.printPersamaanGaris();
        G3.printPersamaanGaris();
        G4.printPersamaanGaris();
        System.out.println("");

    }
}
