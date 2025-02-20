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
        Titik T4 = new Titik(3,5);
        System.out.print("Titik T3: ");
        T3.printTitik();
        System.out.print("Titik T4: ");
        T4.printTitik();
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah obyek Titik = " + T2.getCounterTitik());
        System.out.println("");

        
    }
}
