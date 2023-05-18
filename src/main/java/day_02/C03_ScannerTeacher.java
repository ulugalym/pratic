package day_02;

import java.util.Scanner;

public class C03_ScannerTeacher {
    //ctrl alt L duzenleme
    //ctrl z -> işlemi geri alma

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//scanner objesı olusturdum ismine input verdim
        System.out.println("Lutfen birinci sayıyı giriniz");
        int x = input.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz");
        int y = input.nextInt();

        boolean sonuc= karelerEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);
        boolean sonuc1=hangisiBuyuk(x,y);
        System.out.println("sonuc1 = " + sonuc1);
        int sonuc2=toplam(x,y);
        System.out.println("sonuc2 = " + sonuc2);

    }

    private static boolean karelerEsitMi(int x, int y) {
        //javada = isaret assignment(atama) isaretidir
        //matematiksel anlamdaki esıt için == kullanırız
        boolean sonuc= x*x==y*y;

        return sonuc;

    }
    public static boolean hangisiBuyuk(int x,int y){
        return x*5>y*8;
    }
    public static int toplam(int x, int y){
        return x*x+y*y;
    }
}
