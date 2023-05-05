package day01;

public class C01_Variables {
    public static void main (String[]args){
        //yorum
        /*
        bir satirdan fazla yorum icin
         */
        //bir variable olusturun
        //syntax: data turu + datanin ismi =(atama operatoru) veriable degeri;
        int yas = 35;
        int sayi =50;
        System.out.println(yas);//ln=> line next yani
        System.out.println(sayi);
        //sayi =50 seklinde yazdirin, yani etiketiylebirlikde yazdir
        System.out.println("sayi = " + sayi);
       //soutv degiskani etiketiyle birlikde yazdirma islemi yapar
        //String bir data olusturun => non-primitive
        String isim="Ali";
        System.out.println("isim = " + isim);


        //Olusturdugumuz variable'ni farkli bir variable'ye kopyala
        int benimYas = yas;
        System.out.println("benimYas = " + benimYas);
        String onunIsim = isim;
        System.out.println("onunIsim = " + onunIsim);
        
        /*
        camelCase 
        PascalCase
        snake_case
        kebab-case 
         */
        //Ayni satira coklu variable deklare et
        int yil=2023 , ay=4 , gun=21;
        System.out.println("yil = " + yil);
        //bir variable degerini guncelle 
        yil=2024;
        System.out.println("yil : " + yil+"."+"Ay : "+ay+"."+"gun : "+gun+".");// java yukaridan asaga ve soldan saga calisir, java run time programing

        yil=2022;
        System.out.println("yil = " + yil);
        //Degiskanleri(variable) yazdirin.


        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y(initialize)
        double y = 12.5;
        System.out.println("y = " + y);
        //Başka bir variable başlat : z
        double z=33;//java bunu 33.0 olarak algilar
        System.out.println("z = " + z);
        //x degişkenini y degişkeni ile başlat
        x= y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Variable y'i guncelle
        y=14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //Degişkenleri yazdır

        int age  = 35;
        System.out.println(age);
        System.out.println("Age = "+ age);
        int myBrother=age;
        myBrother=45;
        System.out.println("Age = "+myBrother);
        System.out.println("Age = "+age);
        System.out.println("Age = "+myBrother);
        int day = 6, month=11, year = 2012;
        System.out.println("Birthday : 0"+day+"."+month+"."+year+".");
        System.out.println("Day   : 0"+day+"."+"\nMonth : "+month+"."+"\nYear  : "+year+".");
        day=2; month=10; year=1992;
        System.out.println("Birthday : 0"+day+"."+month+"."+year+".");
        System.out.println("Day   : 0"+day+"."+"\nMonth : "+month+"."+"\nYear  : "+year+".");
        day=31; month=5; year=1992;
        System.out.println("Birthday : "+day+".0"+month+"."+year+".");
        System.out.println("Day   : "+day+"."+"\nMonth : 0"+month+"."+"\nYear  : "+year+".");
        day=14; month=1; year=2015;
        System.out.println("Birthday : "+day+".0"+month+"."+year+".");
        System.out.println("Day   : "+day+"."+"\nMonth : 0"+month+"."+"\nYear  : "+year+".");
        day=24;month=9;year=2020;
        System.out.println("Birthday : "+day+".0"+month+"."+year+".");
        System.out.println("Day   : "+day+"."+"\nMonth : 0"+month+"."+"\nYear  : "+year+".");
        String name  = "MuhammatSadyk", surname="Alymow", size="175", kilo="80";
        System.out.println("Name     : "+name+"."+"\nSurname  : "+surname+"."+"\nSize     : "+size+"sm."+"\nKilo     : "+kilo+"kg.");
        day=20;month=1;year=1999;
        System.out.println("Birthday : "+day+".0"+month+"."+year+".");



    }
}
