package day5_Ariyhmetic_Operators;

public class Addition {
    public static void main(String[] args) {

        int luffy_bounty = 30000;
        int zoro_bounty = 320000;

        int addition = luffy_bounty + zoro_bounty;  //toplamları 350000$ olacak
        System.out.println("luffy and zoro's total bounty is "+addition);

        int age_Ahmet = 7 ;
        int age_Namık = 13 ;
        int age_Burhan = 26 ;

        int age_additon = age_Ahmet+age_Namık+age_Burhan;
        System.out.println("The total age of  the group is " +age_Ahmet + age_Namık + age_Burhan);
        System.out.println("The total age of  the group is 7" + age_Namık + age_Burhan);
        System.out.println("The total age of  the group is 713" + age_Burhan);
        System.out.println("The total age of  the group is 71326");

        System.out.println("The total age of  the group is " +(age_Ahmet + age_Namık + age_Burhan));


    }
}
