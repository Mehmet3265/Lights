package day4_Concatenation;

public class Addition_vs_Concatenation {
    public static void main(String[] args) {

        System.out.println( 3 + 5 );   //addition
        System.out.println( 4+3 + "5");  //concatenation
        System.out.println( 1+3 + "2"+5+8+"15");  // 425815
        System.out.println("32"+5+8);


        int age = 35;
        String city = "Ohio ";
        double height = 1.88;

        System.out.println("Stephen Curry " + "was born 1988");  //string + string
        System.out.println( height + " is his height");          //number + string
        System.out.println("He is from "+ city);                 //string + number
        System.out.println("His nickname is "+ "The Golden Boy");
        System.out.println("His age is "+age);

    }
}
