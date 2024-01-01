package day6_Operators;

public class Comparison_Operators {
    public static void main(String[] args) {

        int pointOf_Labron = 32;
        int pointOf_Kobe = 38;

        boolean isEquals = (pointOf_Kobe == pointOf_Labron); //false
        System.out.println(isEquals);

        boolean isNotEqual = (pointOf_Kobe != pointOf_Labron); // eşit olmadığı için şartımı sağlamış olacak ve dolayısıyla  true dönecek
        System.out.println(isNotEqual);
        System.out.println(!isNotEqual);  //başına değildir işareti koyduğum için false döndü

        int fanOf_manchester= 40650;
        int fanOf_PSG = 35970;

        boolean isGreater = fanOf_PSG > fanOf_manchester ; //false
        System.out.println(isGreater);

        boolean isLess = fanOf_PSG < fanOf_manchester ;    //true
        System.out.println(isLess);

        int scoreManc= 5;
        int scorePSG = 5;

        boolean isGreatEquals = scoreManc >= scorePSG;
        System.out.println("great equals = "+isGreatEquals);

        boolean isLessEquals = scoreManc <= scorePSG;
        System.out.println(isLessEquals);

        int v = 5;

        for (int i = 5; i >1; i--) {
            System.out.println(v);
        }


    }
}
