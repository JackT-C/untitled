package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is students score? ");
        int score = input.nextInt();
        System.out.println("what is the paper out of? ");
        int total = input.nextInt();
        float grade = (float) score/total * 100;
        if (grade >= 80) {
            System.out.println("grade = A");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("grade = B");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("grade = C");
        }
        else if (grade >= 50 && grade <= 59) {
            System.out.println("grade = D");
        }
        else if (grade >= 40 && grade <= 49) {
            System.out.println("grade = E");
        }
        else {
            System.out.println("grade = U");
        }
    }
}
