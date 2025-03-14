import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
            
            DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", sdf.parse("5 May 1990"), sdf.parse("1 January 2015"), 5000000);
            DosenTamu dosenTamu = new DosenTamu("9876543210", "12345678", "Budi", sdf.parse("15 March 1990"), sdf.parse("1 July 2020"), 4500000, sdf.parse("31 December 2025"));
            
            dosenTetap.printInfo();
            dosenTamu.printInfo();
        } catch (ParseException e) {
            System.out.println("Error format tanggal: " + e.getMessage());
        }
    }
}
