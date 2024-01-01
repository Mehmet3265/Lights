package day6_Operators;

public class Logical_operators {
    public static void main(String[] args) {
        String name1= "Darth Vader";
        String name2= "Venom";

        boolean resultAnd = name1 == name2 && name1 == "Darth Vader";   //false && true  = false
        System.out.println(resultAnd);

        boolean istTrue = name1 != name2 && name2  == "Venom";   // true && true = true
        System.out.println(istTrue);

        String Char1 = "Ironman";
        String Char2 = "Batman";
        String Char3 = "Spiderman";
        boolean resultOr = Char1 == Char2 || Char2 == "Batman";  // false or true  == true
        System.out.println(resultOr);

        boolean resultOr2 = (Char3 != "Spiderman" || Char1 == Char3)  ; // false or false = false
        System.out.println(resultOr2);

        String isIronman = "Ironman";
        boolean result = isIronman == "Ironman";
        System.out.println(result);

    }
}
