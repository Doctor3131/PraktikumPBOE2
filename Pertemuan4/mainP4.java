public class mainP4 {
    public static void main(String[] args) {
        // Membuat objek bangun datar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("merah");
        bd.setBorder("hitam");

        // Membuat objek persegi
        Persegi p = new Persegi(6, "Hijau", "kuning");

        System.out.println("");
        System.out.println("Info Bangun Datar");
        bd.printInfo();

        System.out.println("");
        System.out.println("Info Persegi");
        p.printInfo();
    }
}
