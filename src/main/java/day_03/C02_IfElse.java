package day_03;

import java.util.Scanner;

public class C02_IfElse {
    //Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz
    //ilk sayinin ikinci sayidan buyuk olup olmadigini yazdiriniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfan birinji sayiyi giriniz..");
        int sayi1=scan.nextInt();
        System.out.println("Lutfan ikinci sayiyi giriniz..");
        int sayi2=scan.nextInt();
        if (sayi1>sayi2){
            System.out.println("Birinci sayi ikinci sayidan buyukdir.");

        }else{
            System.out.println("Birinci sayi ikinci sayidan kucukdir.");
        }
    }
}
