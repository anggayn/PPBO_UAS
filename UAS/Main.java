// Contoh class induk (superclass)
class Kendaraan {
    private String merek;
    private String warna;
    
    // Constructor
    public Kendaraan(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }
    
    // Getter dan setter
    public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    // Metode lain
    public void infoKendaraan() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
    }
}

// Contoh class anak (subclass)
class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    // Constructor
    public Mobil(String merek, String warna, int jumlahPintu) {
        super(merek, warna);
        this.jumlahPintu = jumlahPintu;
    }
    
    // Getter dan setter
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    // Override metode infoKendaraan()
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Contoh interface
interface KendaraanBerat {
    double hitungBerat();
}

// Contoh implementasi interface
class Truk extends Kendaraan implements KendaraanBerat {
    private double bebanMaksimal;
    
    // Constructor
    public Truk(String merek, String warna, double bebanMaksimal) {
        super(merek, warna);
        this.bebanMaksimal = bebanMaksimal;
    }
    
    // Implementasi metode dari interface KendaraanBerat
    @Override
    public double hitungBerat() {
        return bebanMaksimal;
    }
    
    // Override metode infoKendaraan()
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Beban Maksimal: " + bebanMaksimal + " ton");
    }
}

public class Main {
    public static void main(String[] args) {
        // Pewarisan dan polymorphism
        Kendaraan kendaraan1 = new Kendaraan("Honda", "Merah");
        kendaraan1.infoKendaraan();
        
        System.out.println();
        
        Mobil mobil1 = new Mobil("Toyota", "Biru", 4);
        mobil1.infoKendaraan();
        
        System.out.println();
        
        // Getter dan setter
        mobil1.setMerek("Mitsubishi");
        mobil1.setWarna("Hitam");
        mobil1.setJumlahPintu(2);
        mobil1.infoKendaraan();
        
        System.out.println();
        
        // Interface dan inheritance antar interface
        Truk truk1 = new Truk("Isuzu", "Putih", 10.5);
        truk1.infoKendaraan();
        System.out.println("Berat Truk: " + truk1.hitungBerat() + " ton");
        
        System.out.println();
        
        // Anonymous class
        KendaraanBerat kendaraanBerat1 = new KendaraanBerat() {
            @Override
            public double hitungBerat() {
                return 5.2;
            }
        };
        
        System.out.println("Berat Kendaraan: " + kendaraanBerat1.hitungBerat() + " ton");
        
        System.out.println();
        
        // Exception dan try-catch
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        System.out.println();
        
        // Try-catch-finally dan error
        try {
            int hasil = bagi(10, 0);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Ini akan selalu dieksekusi.");
        }
    }
    
    // Metode untuk pembagian dengan error
    public static int bagi(int angka1, int angka2) {
        return angka1 / angka2;
    }
}
