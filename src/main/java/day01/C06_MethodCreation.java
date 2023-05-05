package day01;

public class C06_MethodCreation {

    public static void main(String[] args) {
        //kare prizmanın hacmini bulan ve donduren bir method yazınız
        //note: kara prizma hacmi => taban alani *yukseklik => a*a*h
        int tabanKenari=3;
        int yukseklik=4;
        //tabankenari 3 yukseklik 4 olan prizmanin hacmi => 3*3*4=36
        System.out.println(karePrizmaHacimBul(3, 4));


    }
    //access mod+ static+ return type + isim(){}
    //public, defoult, private, protected
    public static int karePrizmaHacimBul(int tabanKenari, int yukseklik){
        int hacim= tabanKenari*tabanKenari*yukseklik;
        return hacim;

    }
}
