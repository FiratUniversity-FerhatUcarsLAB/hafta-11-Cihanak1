Ad soyad: Cihan Akalın
Ogrenci no: 250541107
odev no: 4_4




    ---Kod ve kod üzerinden yorum satırıyla cevaplar
    
    

package hafta_11;

public class odev_4_4 {

    // Bir int değer döndüren metot.
    public static int getNumber() {
        return 42;
    }

    // Değer döndürmeyen (void) metot.
    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); // Dönüş değeri (42) kullanılmadı. Java derleyicisi bu durumda HATA VERMEZ.
                     // Metot çalışır ancak dönen sonuç (42) göz ardı edilir.
                     // Ancak modern IDE'ler "dönüş değeri kullanılmadı" şeklinde UYARI verebilir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        
        /* * Eğer yukarıdaki satırın yorumunu kaldırırsak, derleyici HATA verir.
         * Hata: "bad operand types for binary operator '+'" (uygunsuz işlenen tipleri).
         * Sebep: sayHello() metodu 'void' tipindedir (değer döndürmez). 
         * Java, 'void' tipini '+' operatörü gibi bir ifade içinde kullanmaya izin vermez,
         * çünkü void bir değer değil, bir eylemi temsil eder.
         */
    }
}
