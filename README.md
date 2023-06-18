1. Class Kendaraan adalah class induk (superclass) yang memiliki dua atribut private yaitu merek dan warna. Class ini memiliki constructor untuk menginisialisasi nilai atribut, serta getter dan setter untuk mengakses dan mengubah nilai atribut. Class ini juga memiliki metode infoKendaraan() untuk mencetak informasi tentang kendaraan.

2. Class Mobil merupakan subclass dari Kendaraan yang memiliki tambahan atribut jumlahPintu. Class ini juga memiliki constructor untuk menginisialisasi nilai atribut dengan menggunakan kata kunci super untuk memanggil constructor dari superclass. Class ini juga mengimplementasikan metode infoKendaraan() yang di-override dari superclass, sehingga mencetak informasi mobil beserta jumlah pintunya.

3. Interface KendaraanBerat adalah sebuah interface yang mendefinisikan metode hitungBerat() yang mengembalikan nilai bertipe double.

4. Class Truk merupakan subclass dari Kendaraan yang juga mengimplementasikan interface KendaraanBerat. Class ini memiliki atribut bebanMaksimal dan mengimplementasikan metode hitungBerat() dari interface. Class ini juga meng-override metode infoKendaraan() dari superclass untuk mencetak informasi truk beserta beban maksimalnya.

5. Class Main adalah class utama yang berisi metode main(). Di dalam metode ini, terdapat contoh-contoh penggunaan class dan interface yang telah didefinisikan sebelumnya. Dalam contoh ini, objek kendaraan1 diinisialisasi menggunakan constructor dari class Kendaraan, objek mobil1 diinisialisasi menggunakan constructor dari class Mobil, objek truk1 diinisialisasi menggunakan constructor dari class Truk. Kemudian, objek-objek tersebut digunakan untuk memanggil metode infoKendaraan() dan metode lainnya.

6. Pada contoh ini juga terdapat contoh penggunaan anonymous class dalam variabel kendaraanBerat1 yang mengimplementasikan interface KendaraanBerat secara langsung.

7. Terdapat juga contoh penggunaan exception handling dengan menggunakan blok try-catch. Pada contoh ini, terdapat blok try yang berpotensi memunculkan ArrayIndexOutOfBoundsException, dan jika terjadi exception tersebut, akan ditangkap oleh blok catch yang kemudian mencetak pesan kesalahan.

8. Pada contoh yang terakhir, terdapat metode bagi() yang melakukan pembagian. Pada contoh ini, terdapat blok try-catch-finally, di mana blok try mencoba melakukan pembagian, dan jika terjadi ArithmeticException (pembagian dengan nol), akan ditangkap oleh blok catch dan mencetak pesan kesalahan. Blok finally akan selalu dieksekusi, baik terjadi exception maupun tidak.
