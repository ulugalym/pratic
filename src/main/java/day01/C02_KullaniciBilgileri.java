package day01;

public class C02_KullaniciBilgileri {
    /*
     isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
        Isim: ...
        Soyisim: ...
        Yas: ...
        Boy: ...
        Kilo: ...
Not: Sadece bir adet "System.out.println(); kullanınız.
*/
    public static void main(String[] args) {
        String isim="Ali", soyIsim="Can";
        int yas=25;
        double boy=1.85;
        double kilo=79.5;

        //Isim: Ali
        System.out.println("Isim: "+isim + "\nSoyIsim: "+soyIsim+"\nYas: "+yas+"\nBoy: "+boy+"\nKilo: "+kilo);

    }
}
