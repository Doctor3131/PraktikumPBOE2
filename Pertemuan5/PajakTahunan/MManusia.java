package Pertemuan5.PajakTahunan;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MManusia {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateP1 = null, dateP2 = null, datePe1 = null, datePt1 = null;
        
        try {
            dateP1 = dateFormat.parse("01-04-2000");
            dateP2 = dateFormat.parse("01-04-2010");
            datePe1 = dateFormat.parse("01-01-2000");
            datePt1 = dateFormat.parse("09-01-1977");
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
        
        PNS p1 = new PNS("Setriyo", dateP1, 1500000, "Jl. Seroja", "198302032000041002");
        Pengusaha pe1 = new Pengusaha("Adhy", datePe1, 5000000, "Jl. Air", "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", datePt1, 500000, "Jl. Bunga 9 Tembalang", "wonogiri");
        PNS p2 = new PNS("Panji", dateP2, 10000000, "19800421201004100");
        
        p2.setAlamat("Jl. Panorama 111 Tembalang");
        
        System.out.println("");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("");

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}