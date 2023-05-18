package day_02;

import java.util.Scanner;

import static day_02.C01_MethodCreationTeacher.fahreToCelsi;

public class C01_MethodCreation {
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan bir fahrenhiet deger giriniz..");
        double fahrenhiet= scan.nextDouble();
        double celsius=fahreToCelsi(fahrenhiet);
        System.out.println("celsius = " + celsius);
    }

    public  static double fahreToCelsi(double fahrenhiet) {
        double cel=(fahrenhiet-32)/1.8;
        return cel;
    }

}