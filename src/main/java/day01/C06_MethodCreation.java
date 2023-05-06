package day01;

public class C06_MethodCreation {

    public static void main(String[] args) {
        //kare prizmanın hacmini bulan ve donduren bir method yazınız
        //note: kara prizma hacmi => taban alani *yukseklik => a*a*h
        int tabanKenari=3;
        int yukseklik=4;
        System.out.println(tabanKenari+"\n"+yukseklik);
        //tabankenari 3 yukseklik 4 olan prizmanin hacmi => 3*3*4=36
        System.out.println(karePrizmaHacimBul(3, 4));
        int prizma=karePrizmaHacimBul(5,7);
        System.out.println(prizma);
        System.out.println(kupunMeydani(4));
        int son=kupunMeydani(6);
        System.out.println(son);
        int student=okulOgranciSayisi(50,30);
        System.out.println(student);


    }
    //access mod+ static+ return type + isim(){}
    //public, defoult, private, protected
    public static int karePrizmaHacimBul(int tabanKenari, int yukseklik){
       return tabanKenari*tabanKenari*yukseklik;


    }
    public static int kupunMeydani(int a){
        return a*a*a;

    }
    public static int okulOgranciSayisi(int snif,int ogranci){
        return snif*ogranci;

    }

}
