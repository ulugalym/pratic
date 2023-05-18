package day_03;

import java.util.Scanner;

public class C01_Substring {
    /*
    Kullanicidan ad ve soyadini aralarinda bir bosluk olacak sekilde sisteme girmesini isteyiniz
    Note: Yalnizca bir ad bir soyad girilmeli 
    Ad ve Soyadi ilk harfleri buyuk olacak sekilde alt-alta yazdirin 
    Ad: Canan
    Soyad: Can
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfan ad ve soyadinizi aralarinda bir bosluk olacak sekilde girin\n"+
                "Yalnizca bir ad ve bir soyad girilmeli");
        String adSoyad=scan.nextLine();
        System.out.println("adSoyad = " + adSoyad);
        //substring methodunun iki formu var
        //1. substring(index)=> index dahil olmak uzere string'in sonuna kadar olan kismi yeni bir string olarak dondurur
        //2.substring(index1,index2)=>index1 dahil, index2 haric olmak uzere yeni bir string dondurur
        int spaceIndex=adSoyad.trim().indexOf(" ");
        String ad=adSoyad.substring(0,spaceIndex);
        System.out.println("ad = " + ad);
        String soyad=adSoyad.substring(spaceIndex+1).trim();
        System.out.println("soyad = " + soyad);
        //ad isimli variablenin ilk characterini buyuk harf olacak sekilde alalim
        char adIlkHarf=ad.toUpperCase().charAt(0);
        //ad isimli variable'in geri kalan kismini kucuk harf olarak alalim
        String adGeriKalan=ad.substring(1).toLowerCase();
        ad=adIlkHarf+adGeriKalan;
        System.out.println(" ad = " +ad);
        char soyadIlkHarf=soyad.toUpperCase().charAt(0);
        String soyadGeriKalan=soyad.substring(1).toLowerCase();
        soyad=soyadIlkHarf+soyadGeriKalan;
        System.out.println("soyad = "+soyad);

    }
}
