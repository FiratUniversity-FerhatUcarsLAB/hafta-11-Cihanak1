Ad soyad: Cihan Akalın
Ogrenci no: 250541107
Odev no: 4_6







package hafta_11;

public class odev_4_6 {

    /**
     * Verilen a, b ve c parametreleri için a * b + c işlemini hesaplar.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * x * e^(-x) + (1 - e^(-x)) ifadesini hesaplar.
     */
    public static double expSum(double x) {
        // e^(-x) ifadesini hesaplamak için Math.exp() kullanılır.
        double e_to_neg_x = Math.exp(-x);

        // multadd metodunu kullanarak istenen ifadeyi hesaplar.
        return multadd(x, e_to_neg_x, 1 - e_to_neg_x);
    }

    public static void main(String[] args) {
        
        // --- 1. multadd Metodunun Basit Testi ---
        System.out.println("--- 1. multadd Metot Testi ---");
        System.out.println("multadd(1.0, 2.0, 3.0) sonucu: " + multadd(1.0, 2.0, 3.0));
        
        System.out.println("-------------------------------------");

        // --- 2. Matematiksel İfadelerin multadd ile Hesaplanması ---
        System.out.println("--- 2. Matematiksel İfadeler ---");
        
        // İfade 1: sin(π/4) + cos(π/4)/2
        double pi_over_4 = Math.PI / 4.0;
        // İfade multadd(cos(π/4), 0.5, sin(π/4)) olarak hesaplandı.
        double result_1 = multadd(Math.cos(pi_over_4), 0.5, Math.sin(pi_over_4));
        System.out.println("sin(π/4) + cos(π/4)/2 sonucu: " + result_1);
        
        
        // İfade 2: log10 + log20
        // İfade multadd(1, log10, log20) olarak hesaplandı. Math.log10() kullanılır.
        double log10_result = Math.log10(10.0);
        double log20_result = Math.log10(20.0);
        double result_2 = multadd(1.0, log10_result, log20_result);
        System.out.println("log10 + log20 sonucu: " + result_2);
        
        System.out.println("-------------------------------------");

        // --- 3. expSum Metot Testi ---
        System.out.println("--- 3. expSum Metot Testi ---");
        double x_value = 5.0; 
        double expsum_result = expSum(x_value);
        System.out.println("expSum(" + x_value + ") sonucu: " + expsum_result);
        System.out.println("-------------------------------------");
    }
}
