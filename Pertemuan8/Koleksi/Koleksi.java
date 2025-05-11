/*
* Nama File    : Koleksi.java
* Deskripsi    : merupakan implementasi dari soal poin 3.5
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 11/05/2025
*/


package Koleksi;

public class Koleksi<T> {
    private int nbelm;
    private Object[] wadah;
    
    public Koleksi(int maxSize) {
        wadah = new Object[maxSize];
        nbelm = 0;
    }
    
    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return (T) wadah[index];
        }
        return null;
    }
    
    public void setIsi(int index, T nilai) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = nilai;
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            nbelm = size;
        }
    }
    
    public void add(T nilai) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = nilai;
            nbelm++;
        }
    }
    
    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
        }
    }
    
    public void showAll() {
        System.out.println("Isi koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(i + ": " + wadah[i]);
        }
    }
}