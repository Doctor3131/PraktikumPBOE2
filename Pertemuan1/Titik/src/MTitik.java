/*
* Nama File    : MTitik.java
* Deskripsi    : Berisi atribut dan method dalam class Titik
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 20 Februari 2025
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(4,3);
        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        System.out.print("Titik T1: ");
        T1.printTitik();
        System.out.println("");


        Titik T2 = T1;
        System.out.print("Titik T2: ");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.print("Titik T2 sesudah T1 dirubah: ");
        T2.printTitik();
        System.out.println("");


        Titik T3 = new Titik();
        // Titik T4 = new Titik(3,5);
        System.out.print("Titik T3: ");
        T3.printTitik();
        // System.out.print("Titik T4: ");
        // T4.printTitik();
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah obyek Titik = " + T2.getCounterTitik());
        System.out.println("");


        // main-main kuadran
        Titik Kuadran1 = new Titik(3, 4);
        Titik Kuadran2 = new Titik(-3, 4);
        Titik Kuadran3 = new Titik(-3, -4);
        Titik Kuadran4 = new Titik(3, -4);

        System.out.println("Kuadran titik (" + Kuadran1.getAbsis() + "," + Kuadran1.getOrdinat() + ") = " + Kuadran1.getKuadran());
        System.out.println("Kuadran titik (" + Kuadran2.getAbsis() + "," + Kuadran2.getOrdinat() + ") = " + Kuadran2.getKuadran());
        System.out.println("Kuadran titik (" + Kuadran3.getAbsis() + "," + Kuadran3.getOrdinat() + ") = " + Kuadran3.getKuadran());
        System.out.println("Kuadran titik (" + Kuadran4.getAbsis() + "," + Kuadran4.getOrdinat() + ") = " + Kuadran4.getKuadran());
        System.out.println("");


        // main-main jarak dari titik pusat
        System.out.println("Jarak dari titik pusat dengan titik (" + Kuadran1.getAbsis() + "," + Kuadran1.getOrdinat() + ") = " + Kuadran1.getJarakPusat());
        System.out.println("Jarak dari titik pusat dengan titik (" + Kuadran2.getAbsis() + "," + Kuadran2.getOrdinat() + ") = " + Kuadran2.getJarakPusat());
        System.out.println("Jarak dari titik pusat dengan titik (" + Kuadran3.getAbsis() + "," + Kuadran3.getOrdinat() + ") = " + Kuadran3.getJarakPusat());
        System.out.println("Jarak dari titik pusat dengan titik (" + Kuadran4.getAbsis() + "," + Kuadran4.getOrdinat() + ") = " + Kuadran4.getJarakPusat());
        System.out.println("");


        // main-main jarak dari titik pusat
        Titik T = new Titik(3,4);
        System.out.println("Titik T = (" + T.getAbsis() + "," + T.getOrdinat() + ")");
        System.out.println("Jarak dari titik T dengan titik (" + Kuadran1.getAbsis() + "," + Kuadran1.getOrdinat() + ") = " + Kuadran1.getJarak(T));
        System.out.println("Jarak dari titik T dengan titik (" + Kuadran2.getAbsis() + "," + Kuadran2.getOrdinat() + ") = " + Kuadran2.getJarak(T));
        System.out.println("Jarak dari titik T dengan titik (" + Kuadran3.getAbsis() + "," + Kuadran3.getOrdinat() + ") = " + Kuadran3.getJarak(T));
        System.out.println("Jarak dari titik T dengan titik (" + Kuadran4.getAbsis() + "," + Kuadran4.getOrdinat() + ") = " + Kuadran4.getJarak(T));
        System.out.println("");
     
        
        // main-main refleksi part 1
        Kuadran1.refleksiX();
        Kuadran1.refleksiY();
        System.out.println("");
        Kuadran2.refleksiX();
        Kuadran2.refleksiY();
        System.out.println("");
        Kuadran3.refleksiX();
        Kuadran3.refleksiY();
        System.out.println("");
        Kuadran4.refleksiX();
        Kuadran4.refleksiY();
        System.out.println("");


        // main-main refleksi part 2
        System.out.print("refleksi sumbu x dengan fungsi get, titik: (" + Kuadran1.getAbsis() + "," + Kuadran1.getOrdinat() + ") = " );
        Kuadran1.getRefleksiX().printTitik();
        System.out.print("refleksi sumbu y dengan fungsi get, titik: (" + Kuadran1.getAbsis() + "," + Kuadran1.getOrdinat() + ") = " );
        Kuadran1.getRefleksiY().printTitik();
        System.out.println("");
        
        System.out.print("refleksi sumbu x dengan fungsi get, titik: (" + Kuadran2.getAbsis() + "," + Kuadran2.getOrdinat() + ") = " );
        Kuadran2.getRefleksiX().printTitik();
        System.out.print("refleksi sumbu y dengan fungsi get, titik: (" + Kuadran2.getAbsis() + "," + Kuadran2.getOrdinat() + ") = " );
        Kuadran2.getRefleksiY().printTitik();
        System.out.println("");
        
        System.out.print("refleksi sumbu x  dengan fungsi get, titik: (" + Kuadran3.getAbsis() + "," + Kuadran3.getOrdinat() + ") = " );
        Kuadran3.getRefleksiX().printTitik();
        System.out.print("refleksi sumbu y  dengan fungsi get, titik: (" + Kuadran3.getAbsis() + "," + Kuadran3.getOrdinat() + ") = " );
        Kuadran3.getRefleksiY().printTitik();
        System.out.println("");

        System.out.print("refleksi sumbu x  dengan fungsi get, titik: (" + Kuadran4.getAbsis() + "," + Kuadran4.getOrdinat() + ") = " );
        Kuadran4.getRefleksiX().printTitik();
        System.out.print("refleksi sumbu y  dengan fungsi get, titik: (" + Kuadran4.getAbsis() + "," + Kuadran4.getOrdinat() + ") = " );
        Kuadran4.getRefleksiY().printTitik();
        System.out.println("");

    }
}
