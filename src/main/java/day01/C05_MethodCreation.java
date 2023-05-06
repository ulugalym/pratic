package day01;

public class C05_MethodCreation {
    public static void main(String[] args) {
        //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
        //3ve 5 =>34 yazdiracak
        //methodum sadece yazdirma islemi yapacak bu yuzden return type void olabilir

        kareTopla(3, 5);//argument
        kareTopla(10,100);
        kareTopla(4,9);
        int sayi1=5,sayi2=6;kareTopla(sayi1,sayi2);
        kareTopla(34,23);
        kupleriAyir(5,3);
        int kup1=6,kup2=7;kupleriAyir(kup1,kup2);
        kupleriAyir(7,8);
        kupleritopla(6,7);
        int kup3=7,kup4=4;kupleritopla(kup3,kup4);
        kupleriAyir(5,9);



    }

    public static void kareTopla(int sayi1, int sayi2){//parametre diyoruz ve burada deklere ettigimiz variable'ler
                                                      //method body kisminda kullanilabilir
       int sonuc =sayi1*sayi1+sayi2*sayi2;
        System.out.println(sonuc);
    }
    public static void kupleriAyir(int kup1,int kup2){
        System.out.println(kup1*kup1*kup1-kup2*kup2*kup2);

    }
    public static void kupleritopla(int kup3,int kup4){
        int toplam=kup3*kup3*kup3+kup4*kup4*kup4;
        System.out.println(toplam);
    }

}
