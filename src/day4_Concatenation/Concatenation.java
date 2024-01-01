package day4_Concatenation;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Concatenation {
    public static void main(String[] args) {

        System.out.println("Kerem's grandpa is heigher " + "then Curry");

        String kerem = "Kerem's grandpa is heigher ";
        String curry = "then Curry.";

        System.out.println( kerem + curry );

        System.out.println(5+6); //11

        int age = 35;
        System.out.println("Curry's age is "+age);
    }
}
