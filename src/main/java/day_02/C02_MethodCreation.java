package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
         /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             System.out.println("Lutfan birinci sayiyi giriniz..");
             int sayi1=scan.nextInt();
             System.out.println("Lutfan ikinci sayiyi giriniz..");
             int sayi2=scan.nextInt();
             System.out.println("sayi1 = " + sayi1);
             System.out.println("sayi2 = " + sayi2);
             swapYap(sayi1,sayi2);

         }
         public static void swapYap(int sayi1,int sayi2){
             int sayi3;
             sayi3=sayi2;
             sayi2=sayi1;
             sayi1=sayi3;
             System.out.println("sayi1 = " + sayi1);
             System.out.println("sayi2 = " + sayi2);
         }
}
