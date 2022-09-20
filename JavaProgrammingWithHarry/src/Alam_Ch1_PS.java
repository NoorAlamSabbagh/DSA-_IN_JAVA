package com.company;

import java.util.Scanner;

public class Alam_Ch1_PS {
    public static void main(String[] args) {
//     Question 1
//        int a = 78;
//        int b = 87;
//        int c =  98;
//        int sum = a + b + c;
//        System.out.println(sum);

//       Question 2
//        float subject1 = 45;
//        float subject2 = 95;
//        float subject3 = 98;
//        float cgpa = (subject1 + subject2 + subject3)/30;
//        System.out.println(cgpa);

//        Question 3

//        System.out.println("What is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

//        Question 5
//        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

//       Question 4


        double kilometers;

        System.out.println("Please enter kilometers:");

        Scanner in = new Scanner(System.in);
        kilometers = in.nextDouble();

        double miles = kilometers / 1.6;

        System.out.println(miles + " Miles");


    }
}
