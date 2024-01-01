package day6_Operators;

public class Simple_Assignmet {
    public static void main(String[] args) {

        int age_of_Nihat = 10 ;
        System.out.println(age_of_Nihat);

        age_of_Nihat += 5;
        System.out.println(age_of_Nihat);

        int ageOf_Kerem = 11;
        System.out.println(ageOf_Kerem);

        ageOf_Kerem -= 3 ;

        System.out.println(ageOf_Kerem);
        ageOf_Kerem += 13;
        System.out.println(ageOf_Kerem);

        int ageof_Naruto = 10; //narutoyla yaşıt 3 arkadaş var. Yaşları topamı kaçtır.
        System.out.println(ageof_Naruto);

        ageof_Naruto *= 3;
        System.out.println(ageof_Naruto);

        int agefo_class = 45;  //sınıfta 5 kişi var ve beşide yaşıt
        agefo_class /= 5 ;  //9 yaşına ulaşacağım
        System.out.println(agefo_class);

        int number_of_apples = 13 ; //3 sepete böldüğümde dışarıda kaç tane elma kalır
        System.out.println(number_of_apples);
        number_of_apples %=3 ;
        System.out.println(number_of_apples);



    }
}
