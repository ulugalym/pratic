package day_03;

import java.util.Scanner;

public class C03IfElse {
    //kullanıcıdan iki sayı isteyin
    //sayıların ikisi de pozitifse sayıların toplamını yazdırın
    //ikisi de negatifse sayıların çarpımını yazdırın
    //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
    //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfan birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfan ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        //sayıların ikisinin de + olması  -> sayi1>0 && sayi2>0
        //sayıların ikisinin de - olması  ->sayi1<0  && sayi2<0
        //sayıların farklı işarette olması -> (sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)
        if (sayi1>0&&sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0&&sayi2<0) {
            System.out.println(sayi1*sayi2);
        } else if ((sayi1<0&&sayi2>0)||(sayi1>0&&sayi2<0)) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else{
            System.out.println("Sifir carpmaya gore yutan elamandir ");
        }
    }
}
