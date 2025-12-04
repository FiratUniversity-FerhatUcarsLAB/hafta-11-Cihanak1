Ad Soyad: Cihan Akalın
Ogrenci no: 250541107
Odev no: 4_2

Soruların cevapları:
a) bafle metodu ilk çağrıldığında blimp parametresinin değeri quince değişkenine atanan değer olan rattle olacaktır.
b)Verilen çıktılar sırasıyla şöyledir;
"ik
rattle
ping zoop
boo-wa-ha-ha"
c)Birden fazla çalışan metodlar;
Satır 3 ve Satır 4' tür.





--Kod


package hafta_11;

public class odev_4_2 {

    public static void main(String[] args) { // 1. Çalışan satır
        zippo("rattle", 13); // 2
    } // 17

    public static void baffle(String blimp) { // 6
        System.out.println(blimp); // 7
        zippo("ping", -5); // 8
    } // 11

    public static void zippo(String quince, int flag) { // 3, 9
        if (flag < 0) { // 4, 10
            System.out.println(quince + " zoop"); // 11 (flag = -5 olduğu için)
        } else { // 5 (flag = 13 olduğu için)
            System.out.println("ik"); // 6
            baffle(quince); // 7
            System.out.println("boo-wa-ha-ha"); // 14
        }
    } // 15
}

