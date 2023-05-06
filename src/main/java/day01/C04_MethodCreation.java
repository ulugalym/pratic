package day01;

public class C04_MethodCreation {
    public static void main(String[] args) {
        //konsola;
       /*
        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
       */
      yazdir();
      yazdir();
      yazdir();
      marketMahsulu();
      bahce();
      gazoz();
    }
    //method olusturulurkan syntax
    //access modifier + static +return type +method ismi (){}
    public static void yazdir (){
        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELlO WORlD");
    }
    public static void marketMahsulu(){
        System.out.println("Makarna ");
        System.out.println("Aycicek yagi");
        System.out.println("Tuz");
        System.out.println("Ekmek");
        System.out.println("TereYagi");
    }
    public static void bahce(){
        System.out.println("Elma");
        System.out.println("Erik");
        System.out.println("Karpuz");
        System.out.println("Armut");
        System.out.println("Enar");
    }
    public static void gazoz(){
        System.out.println("CocaCola");
        System.out.println("Fanta");
        System.out.println("Sprite");
        System.out.println("UluDag");
    }


}
