/*
* Nama File    : ExceptionOnArray.java
* Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 6 Maret 2025
*/


public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInterger = new Integer[4];
        try {
            arrayInterger[2] = 11;
            arrayInterger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
