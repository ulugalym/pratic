package day_02;

import java.util.Scanner;

public class C01_MethodCreation {
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
    public static void main(String[] args) {

        //kullanicidan bir fahrenheit bir deger alalim
        //scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);
        //kullaniciya bir mesaj verelim
        System.out.println("Lutfan fahrenheit cinsinden bir sicaklik giriniz");
        double fahrenheit = scan.nextDouble();//kullanicinin girmis oldugu veriyi fahrenhiet variable'ina koydum
        double celsius = fahreToCelsi(fahrenheit);
        System.out.println("fahrenHeit = " + fahrenheit);
        System.out.println("celsius = " + celsius);


    }



    public static double fahreToCelsi(double fahrenheit) {
        double celsi = (fahrenheit - 32) / 1.8;
        return celsi;
    }

}