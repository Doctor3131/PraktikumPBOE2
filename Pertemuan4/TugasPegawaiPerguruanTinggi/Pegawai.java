/*
* Nama File    : Pegawai.java
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 14 Maret 2025
*/


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


class Pegawai {
    protected String NIP, nama;
    protected Date tanggalLahir, TMT;
    protected double gajiPokok;
    protected SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");

    public Pegawai(String NIP, String nama, Date tanggalLahir, Date TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        Calendar tmtCal = Calendar.getInstance();
        tmtCal.setTime(TMT);
        Calendar today = Calendar.getInstance();
        int years = today.get(Calendar.YEAR) - tmtCal.get(Calendar.YEAR);
        int months = today.get(Calendar.MONTH) - tmtCal.get(Calendar.MONTH);
        if (months < 0) {
            years--;
            months += 12;
        }
        return years * 12 + months;
    }
}