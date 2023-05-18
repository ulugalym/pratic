package day_03;

import java.util.Scanner;

public class C06_Ternary {
    //kullanıcıdan bir sayı alınız
    //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan 3 veya daha cok basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int sayi1=Math.abs(sayi);
        kacBasamakli(sayi1);
        //main method icinden method olusturma
        //method ismi + (argument)
        //kendimiz belirliyoruz  + method parantezi


    }
    public static void kacBasamakli(int sayi1){
        //bir sayi 99'dan buyukse 3 veya daha cok basamaklidir
        System.out.println(sayi1 > 99 ? "sayi 3 veya daha cok basamakli" : "sayi 3ten az basamakli");
    }
}
