/*package main.oops.inheritance;
import java.util.Scanner;
import java.util.*;
class Student
{
    private int rollNo;
    private String name;
    private int age;

    // Default constructors-->
    Student(){
        System.out.println("New Student is Registered in the class");
    }

    Student(int rollNo, String name, int age){
        if(rollNo>0)
            this.rollNo = rollNo;
        else
            System.out.println("Error: Roll No cannot be negative!!!");
        this.name = name;
        this.age = age;
    }

//    public void setRollNo(int rollNo){
//        if(rollNo>0)
//            this.rollNo = rollNo;//'this' invoke the object which set like object setRollNo
//        else
//            System.out.println("Error:Roll No cannot be negative!!!");
//
//    }


public void setName(String Name){// setrollno, name,age are setter
        this.name = name;
        }

public void setAge(int age){
        this.age = age;
        }

         public int getRollNo(){return this.rollNo;}
         public String getName(){return this.name;}
         public int getAge(){return this.age;}
        }

public class  L35_Inheritance_10Aug {

    public static void main(String[] args) {

        String str = "Ravi";
        int n = str.length();

        int arr[] = new int[3];
        int n = arr.length;

        Student stud1 = new Student(105, "Ankit", 23);
        stud1.setName("Aniket");

        stud1.setRollNo(20);

        System.out.println("Roll No: " + stud1.getRollNo());
        System.out.println("Name: " + stud1.getName());
        System.out.println("Age: " + stud1.getAge());
    }
}

 */