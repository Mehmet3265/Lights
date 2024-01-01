package day6_Operators;

public class Unary_Operators {
    public static void main(String[] args) {

        int a = 10 ;
        System.out.println(a);
        int b = -a;   // b = - 10
        System.out.println("the value of b is = "+b);
        int c = -b;   // (-) * (-10) = 10
        System.out.println("the value of c is = "+c );

        System.out.println(a);
        System.out.println(++a);  // anında değerimiz yükselir ve değer 11 olur
        System.out.println(--a);  // anında değeri bir düşürecek ve değer 10 olacak

        System.out.println(c);
        System.out.println(--c);
        System.out.println(--c);
        System.out.println(--c);

        int ageOf_Spiderman = 17;
        System.out.println(ageOf_Spiderman++); //spideman in yaşını güncelledi ama önceki yaşını çıkardı   17 yaşı çıkacak
        System.out.println(ageOf_Spiderman++); //spiderman ın yaşı 18 olacak sonra çağırdığımda 19 olacak
        System.out.println(ageOf_Spiderman);


    }
}
