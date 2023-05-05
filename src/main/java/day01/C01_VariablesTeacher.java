package day01;

public class C01_VariablesTeacher {
    public static void main(String[] args) {
        //yorum
        /*
        yorum
        yorum
        yorum
         */
        //Bir variable olustur, yazdır
        //syntax: data turu + datanın ismi =(atama operatoru) variable degeri
        int yas = 35;
        int sayi= 50;
        System.out.println(yas);//ln -> line next yani işlemi yap ve alt satıra gec
        System.out.println(sayi);
        //sayi = 50 seklinde yazdır, yani etiketiyle birlikte yazdır
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + sayi);//soutv degıskenı etiketiyle birlikte yazdırma işlemi yapar
        //String bir data olusturalım -> non primitive
        String isim="Ali";//etiketiyle birlikte yazdır (isim = Ali seklınde)
        System.out.println("isim = " + isim);
        //Olusturdugun variable'ı farkli bir variable'a kopyala
        int benimYasim = yas;  //benimYasim olarak degıstır
        System.out.println("benimYasim = " + benimYasim);
        String onunIsmi= isim; //onunIsmi
        System.out.println("onunIsmi = " + onunIsmi);
        /*
        camelCase
        PascalCase
        snake_case
        kebab-case
         */
        //Aynı satırda coklu variable deklare et
        int yil= 2023 , ay= 4, gun=21;
        System.out.println("yil = " + yil);
        //Bir variable degerini guncelle
        yil=2024;
        System.out.println("yil = " + yil);//java yukarıdan asagı ve soldan saga calısır, java run time programming
        //Degişkenleri(variable) yazdır

    }

}
