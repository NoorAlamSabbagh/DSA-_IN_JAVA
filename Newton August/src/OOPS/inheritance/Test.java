
package OOPS.inheritance;
/*
class Student{
    int rollNo;
    String name;
    int age;
    char gender;

    public void disPlayInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}


public class Test{
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.rollNo = 101;
        stud1.gender = 'M';
        stud1.name = "Ravi";
        stud1.age = 23;
        stud1.disPlayInfo();
    }
}

 */


//code
/*import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    int age;
    char gender;

    public void disPlayInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}


public class Test{
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.rollNo = 101;
        stud1.gender = 'F';
        stud1.name = "Ravi";
        stud1.age = 23;
        stud1.disPlayInfo();

        System.out.println();

        Student stud2 = new Student();
        stud2.rollNo = 102;
        stud2.gender = 'M';
        stud2.name = "NOOR ALAM";
        stud2.age = 23;
        stud2.disPlayInfo();
    }
}
 */

//code 3
/*import java.util.Scanner;
import java.util.*;
class Student{
    int rollNo;
    String name;
    int age;
    char gender;

    public void disPlayInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}


public class Test{
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.rollNo = 101;
        stud1.gender = 'F';
        stud1.name = "Ravi";
        stud1.age = 23;


        Scanner sc = new Scanner(System.in);
        Student stud2 = new Student();
        stud2.rollNo = sc.nextInt();
        sc.nextLine();
        stud2.gender =sc.nextLine().charAt(0);
        stud2.name = sc.nextLine();
        stud2.age = sc.nextInt();

        System.out.println();
        System.out.println();
        stud1.disPlayInfo();
        System.out.println();
        stud2.disPlayInfo();
    }
}

 */


//Code 4
/*import java.util.Scanner;
import java.util.*;
class Student{
    int rollNo;
    String name;
    int age;
    char gender;

    public void disPlayInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    void setName(String newName){
        disPlayInfo();
        name = newName;
    }
}


public class Test{
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.rollNo = 101;
        stud1.gender = 'M';
        stud1.name = "Ravi";
        stud1.age = 23;

//
//        Scanner sc = new Scanner(System.in);
//        Student stud2 = new Student();
//        stud2.rollNo = sc.nextInt();
//        sc.nextLine();
//        stud2.gender =sc.nextLine().charAt(0);
//        stud2.name = sc.nextLine();
//        stud2.age = sc.nextInt();

        System.out.println();
        System.out.println();
        stud1.disPlayInfo();

//        stud1.setName("Ravinder");
        stud1.name = "Mohan";
        System.out.println();
        stud1.disPlayInfo();
    }
}

 */

//code 5
/*
import java.util.Scanner;
import java.util.*;
class Student
{
       private int rollNo;
        String name;
        int age;
        char gender;

public void disPlayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        }

        void setRollNo(int newRollNo){
        rollNo = newRollNo;// I am using setter method to set roll no because I make my role no class private
        }
        void setName(String newName){
        name = newName;
        }

        int getRollNo(){
           return  rollNo;// as i make roll no private so  I am using gutter method to get roll no
        }
        }
public class Test{
    public static void main(String[] args) {

        Student stud1 = new Student();
        //stud1.rollNo = 101;
        stud1.setRollNo(101);
        stud1.gender = 'F';
        stud1.name = "Ravi";
        stud1.age = 23;

        System.out.println(stud1.getRollNo());//gutter method to get roll no as I make roll no private
    }
}


 */


/*
//Code 6
import java.util.Scanner;
import java.util.*;
class Student
{
    private int rollNo;
    private String name;
    private int age;

    public void disPlayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setRollNo(int RollNo){
       this.rollNo = RollNo;// this' invoke the object stud1 roll no which set like object setRollNo
    }
    public void setName(String newName){
        name = newName;
    }


    public void setAge(int newAge){
        age = newAge;
    }
    public int getRollNo(){
        return  rollNo;// as i make roll no private so  I am using gutter method to get roll no
    }
}
public class Test {
    public static void main(String[] args) {


        Student stud1 = new Student();
        //stud1.rollNo = 101;
        stud1.setRollNo(101);
//        stud1.gender = 'F';
//        stud1.name = "Ravi";
//        stud1.age = 23;

        System.out.println(stud1.getRollNo());//gutter method to get roll no as I make roll no private
    }
}

 */



//Code 6
/*
import java.util.Scanner;
import java.util.*;
class Student
{
    private int rollNo;
    private String name;
    private int age;

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

public class Test{

    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.setRollNo(101);
        stud1.setName("Ravi");
        stud1.setAge(23);

        stud1.setName("Ravinder");

        System.out.println("Roll No: " + stud1.getRollNo());
        System.out.println("Name: " + stud1.getName());
        System.out.println("Age: " + stud1.getAge());
    }
}

 */



//code 7
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

    //parameterized Constructor for student
    Student(int rollNo, String name, int age){
        if(rollNo>0)
            this.rollNo = rollNo;
        else
            System.out.println("Error: Roll No cannot be negative!!!");
        this.name = name;
        this.age = age;
    }

    public void setRollNo(int rollNo){
        if(rollNo>0)
            this.rollNo = rollNo;//'this' invoke the object which set like object setRollNo
        else
            System.out.println("Error:Roll No cannot be negative!!!");

    }
    public void setName(String Name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getRollNo(){//getRollNo is gutter
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
public class Test{

    public static void main(String[] args) {


        int x = 20;

        Student stud1 = new Student(105, "Ankit", 23);
        stud1.setName("Aniket");

        stud1.setRollNo(20);

        System.out.println("Roll No: " + stud1.getRollNo());
        System.out.println("Name: " + stud1.getName());
        System.out.println("Age: " + stud1.getAge());
        }
    }



