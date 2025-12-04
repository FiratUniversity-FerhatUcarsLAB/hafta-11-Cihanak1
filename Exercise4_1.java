Ad soyad: Cihan Akalın
Ogrenci No: 250541107
Odev no: 4_1









package hafta_11;
import java.util.Scanner;
public class odev_4_1 {
// İlk metod American
public static void printAmerican(String day, int date , String month , int year) {
	// Burada çıktının dizaynı ayarlandı	
	System.out.println(day + "," + month + " " + date + "," + year);
	
	}
//ikinci metod European
public static void printEuropean(String day,
			  int date, String month, int year) {
	// Burada çıktının dizaynı ayarlandı
	System.out.println(date + " " + month + " " + year + "," + day);
}
	
	
	
public static void main(String[] args) {
	//Scanner değişkeni main içine tanımlandı input adıyla
		Scanner input = new Scanner(System.in);
		
		//Gün ismi burada istendi
		System.out.println("Lütfen gün ismi giriniz");
		String day = input.nextLine();
		
		//Gün sayısı istendi
		System.out.println("Lütfen gün sayısını giriniz");
		int date = input.nextInt();
		
		
		/*Burada ay girilmesi istendi ancak nextint sonrası nextline geldiği için java bunu okumadan geçiyordu bende tanımlı olmayan
		bir değişken adıyla bunu aştım */
		System.out.println("Lütfen ay giriniz");
        String mont = input.nextLine();// Bu satır boş geçilmesi için oluşturuldu.
        String month = input.nextLine();
        
        
        
        //Burada yıl istendi
        System.out.println("Lütfen yıl giriniz");
        int year = input.nextInt();
        
        
        
        System.out.println("============== Tarih çıktıları =========");
        
        
        //American format çıktısı 
        System.out.print("AmericanFormat: ");
        printAmerican(day, date, month, year);
        
        
        
        //European format çıktısı
        System.out.print("EuropeanFormat: ");
        printEuropean(day, date, month, year);
        
	}

}
