package day01;

public class C03_Ortalama {
    public static void main(String[] args) {
           /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
        double num1=23.4;
        double num2=24;
        double num3=12;
        double num4=450.3;
        double num5=100;
        // ortalama nasil hesaplanir => tum sayilari topla, sayi adedine bol
        double toplam= num1+num2+num3+num4+num5;
        //ifadenin onunde string varsa + isareti yan yana yazdirma islemi yapar
        //+ isaretini onunda string yoksa ve numeric datalar varsa + isareti matematiksal toplama islemi yapar
        System.out.println("toplam = " + toplam);
        
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);
        System.out.println((num1+num2+num3+num4+num5)/5);
        int test1=70,test2=85,test3=95,test4=50;
        int total=test1+test2+test3+test4;
        int average=total/4;
        System.out.println("Total : "+total+"."+"\nAverage : "+average+".");
        test1=85; test2=50; test3=45; test4=47; total=test1+test2+test3+test4; average=total/4;
        System.out.println("Total : "+total+"."+"\nAverage : "+average+".");
        test1=38;test2=54;test3=48;test4=26;total=test1+test2+test3+test4;average=total/4;
        System.out.println("Total : "+total+"."+"\nAverage : "+average+"." );
        num1=36;num2=47;num3=54;num4=67;num5=85;toplam=num1+num2+num3+num4+num5;ortalama=toplam/5;
        System.out.println("Toplam : "+toplam+"."+"\nOrtalama : "+ortalama+".");
        num1=55;num2=45;num3=35;num4=25;num5=65;toplam=num1+num2+num3+num4+num5;ortalama=toplam/5;
        System.out.println("Toplam : "+toplam+"."+"\nOrtalama : "+ortalama+".");
        }
}
