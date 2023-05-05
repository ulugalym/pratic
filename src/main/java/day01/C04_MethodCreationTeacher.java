package day01;

public class C04_MethodCreationTeacher {
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
        //tekrar yazdır
        yazdir();
        //tekrar yazdır
        yazdir();
    }
    //method olusturuken syntax
    //access modıfıer + static + return type + methodismi (){}
    public static void yazdir() {
        System.out.println("hello world\n" +
                "Hello World\n" +
                "HEllo WOrld\n" +
                "HELlo WORld\n" +
                "HELLo WORLd\n" +
                "HELLO WORLD");
    }

}
