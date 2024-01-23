import java.util.Scanner;

public class HesapMakinası {


    /* Java yazılım dili kullanılarak, bir hesap makinesi yapmanı istiyorum. Detayları aşağıda paylaştım:

  1) 4 temel işlem olan toplama, çarpma, çıkartma ve bölme işlemini yapan bir hesap makinası yapmanı istiyorum.
  Bu 4 islemi yapması yeterli.
  2) HesapMakinasi.java adında bir class olsun.
  3) Class içerinde bu dört islemi yapan 4 ayri metot olacak. Metotlarin adları; toplama carpma cikartma ve bolme olsun.
  4) Kullanıcıya ilk basta hangi islemi yapmak istiyorsun seklinde sorulsun, diyelim toplama islemi. Bunu seçecek.
     (Switch yada if ile yapabilirsin). Sonrasinda iki sayı girişi yapmasi istenecek, sayi1 ve sayi2 seklinde.
     Sayilar girildikten sonra sonucu gösterecek.
  5) Kullanıcı toplama carpma cikartma bolme islemi haricinde bir secenek girisinde bulunursa;
     Lutfen uygun islemi seçiniz seklinde mesaj verilmeli.

  6) Eger ki kullanıcı gecersiz islem yaparsa örneğin;
     hicbir sayi 0 a bolunemez matematikte bu gecersiz bir islem, bu durumlar kontrol edilmeli.
     Yani hatali işlem durumlarinda bu durumu yonetebilmelisin. (Try Catch yöntemini arastirip uygulayabilirsin.)*/
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz. ");
        int number1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz. ");
        int number2 = scanner.nextInt();

        System.out.println("1-Toplama işlemi");
        System.out.println("2-Çıkartma işlemi");
        System.out.println("3-Çarpma İşlemi");
        System.out.println("4-Bölme işlemi");
        System.out.println("Yapmak istediğiniz işlemi giriniz");

        int islem = scanner.nextInt();
        int sonuc = 0;

        try {
            if (islem == 1) {
                toplama(number1, number2);
                System.out.println("İşleminizin sonucu :" + sonuc);
            } else if (islem == 2) {
                cikartma(number1, number2);
                System.out.println("İşleminizin sonucu :" + sonuc);
            } else if (islem == 3) {
                carpma(number1, number2);
                System.out.println("İşleminizin sonucu :" + sonuc);
            } else if (islem == 4) {
                bolme(number1, number2);
                System.out.println("İşleminizin sonucu :" + sonuc);

            } else {

                System.out.println("Hatalı bir sayı girdiniz.Lütfen geçerli bir sayı giriniz !!");
            }

        } catch (Exception e) {   //hatayı özelleştirmeden genel isim verilen Exception yazılır
            System.out.println("Bir hata var");
            System.out.println(e); //asıl hatanın ne olduğunu karşımıza getirir,yazdırır

        }

    }

    public static int toplama(int number1, int number2) {
        int sonuc = 0;
        sonuc = number1 + number2;
        System.out.println("İşlem sonucu :" + sonuc);
        return sonuc;

    }

    public static int cikartma(int number1, int number2) {
        int sonuc = 0;
        sonuc = number1 - number2;
        System.out.println("İşlem sonucu :" + sonuc);
        return sonuc;


    }

    public static int carpma(int number1, int number2) {
        int sonuc = 0;
        sonuc = number1 * number2;
        System.out.println("İşlem sonucu :" + sonuc);
        return sonuc;

    }

    public static int bolme(int number1, int number2) {
        int sonuc = 0;
        sonuc = number1 / number2;
        System.out.println("İşlem sonucu :" + sonuc);
        return sonuc;

    }


}





