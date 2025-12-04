Ad Soyad: Cihan Akalın 
Ogrenci No: 250541107 
Odev No: 4_3

Soruların Cevapları:
1. ping metodu ilk kez çağrıldığında programın durumunu gösteren Stack Diyagramı
Programın akışı main metodu ile başlar, zoop'u çağırır, zoop ise ilk kez baffle'ı çağırır. baffle içinde ping çağrıldığında yığın şu şekildedir:

Konum	                    Metot Adı	             Parametreler	           Geri Dönüş Adresi (Sonraki Satır)
En Üst	                      ping	                    Yok	                          Satır 22
2.	                          baffle	                Yok	                          Satır 18
3.	                          zoop	                    Yok	                          Satır 5
En Alt	                      main	                    args (String[])	              Satır 12


    Programın ürettiği tam çıktısı;
Sırasıya bu şekildedir. : "No, I wug.
                           You wugga wug.
                           I wug."



    ----Kod
    public class Exercise4_3 {

    public static void zoop() {
        baffle(); // (1. baffle çağrısı)
        System.out.print("You wugga ");
        baffle(); // (2. baffle çağrısı)
    }

    public static void main(String[] args) {
        System.out.print("No, I "); // Çıktı: No, I 
        zoop();
        System.out.print("I "); // Çıktı: I 
        baffle(); // (3. baffle çağrısı)
    }

    public static void baffle() {
        System.out.print("wug"); // Çıktı: wug
        ping();
    }

    public static void ping() {
        System.out.println("."); // Çıktı: .\n (Satır sonu ekler)
    }
}
