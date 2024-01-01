package day7_if_statement;

public class If_statement {
    public static void main(String[] args) {

        String season = "fall";
        if (season == "winter"){
            System.out.println("Naruto goes to play snowball");
        }

        if (season == "summer"){
            System.out.println("Naruto goes to pool");
        }

        //by using boolean variable type  and ! operator
        int score =101 ;
        boolean a = score >= 90 && score<=100 ;
        boolean b = score >= 80 && score<90;
        boolean c = score >= 70 && score<80;
        boolean d = score >= 60 && score<70;
        boolean f = score >= 0 && score<60;

        if(a){
            System.out.println("Lakers is excellent");
        }
        if(b){
            System.out.println("Lakers is great");
        }
        if(c){
            System.out.println("Lakers is good");
        }
        if(d){
            System.out.println("Lakers is passed");
        }
        if(f){
            System.out.println("Lakers is failed");
        }

    }
}
