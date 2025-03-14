``` mermaid
classDiagram
    class Pegawai {
        -String NIP
        -String nama
        -Date tanggalLahir
        -Date TMT
        -double gajiPokok
        +Pegawai(NIP, nama, tanggalLahir, TMT, gajiPokok)
        +String getNIP()
        +String getNama()
        +Date getTanggalLahir()
        +Date getTMT()
        +double getGajiPokok()
        +int hitungMasaKerja()
        +String formatDate(Date date)
        +double hitungTunjangan()
        +void printInfo()
    }
    
    class Dosen {
        -String fakultas
        +Dosen(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas)
        +String getFakultas()
        +double hitungTunjangan()
        +void printInfo()
    }
    
    class DosenTetap {
        -String NIDN
        -Date tanggalPensiun
        +DosenTetap(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas, NIDN)
        +String getNIDN()
        +Date getTanggalPensiun()
        -Date hitungTanggalPensiun()
        +double hitungTunjangan()
        +void printInfo()
    }
    
    class DosenTamu {
        -String NIDK
        -Date tanggalBerakhirKontrak
        +DosenTamu(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas, NIDK, tanggalBerakhirKontrak)
        +String getNIDK()
        +Date getTanggalBerakhirKontrak()
        +double hitungTunjangan()
        +void printInfo()
    }
    
    class TenagaKependidikan {
        -String bidang
        -Date tanggalPensiun
        +TenagaKependidikan(NIP, nama, tanggalLahir, TMT, gajiPokok, bidang)
        +String getBidang()
        +Date getTanggalPensiun()
        -Date hitungTanggalPensiun()
        +double hitungTunjangan()
        +void printInfo()
    }
    
    class Main {
        +main(String[] args)
    }
    
    Pegawai <|-- Dosen : inheritance
    Pegawai <|-- TenagaKependidikan : inheritance
    Dosen <|-- DosenTetap : inheritance
    Dosen <|-- DosenTamu : inheritance
    Main ..> DosenTetap : creates
    Main ..> DosenTamu : creates
    Main ..> TenagaKependidikan : creates
```