package day_03;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {
          /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfan bir sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi<0){
            System.out.println("Negatif Sayi");
        }else {
            if (sayi<10){
                System.out.println(" Rakam");
            }else{
                System.out.println("Pozitif Sayi");
            }
        }
    }
}
