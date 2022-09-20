package com.company;
import java.util.Scanner;
public class alam_18_elseif {
    public static void main(String[] args) {
        String var = "Saurabh";


         switch (var){
            case "Shubham":
                System.out.println("You are going to become Adult!");
                break;
            case "Saurabh":
                System.out.println("You are going to join a job!");
                break;
            case "Vishaka":
                System.out.println("You are going to retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my Java Course!");
       /*
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age > 46) {
            System.out.println("You are semi-experienced! ");
        }
        else if (age > 36) {
            System.out.println("You are semi-semi-experienced! ");
        }
        else {
            System.out.println("You are not experienced! ");
        }
        */
    }
}
