//code 1
/*
class pen{
    String color;
    String type; //ballpoint;gel

    public void write(){
        System.out.println("writing something");
    }

}

public class OOPS {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

    }
}
 */

//code 2
/*class pen{
    String color;
    String type; //ballpoint;gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}


public class OOPS {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

    }
}
 */


//code3

/*class pen{
    String color;
    String type; //ballpoint;gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){//parameterizied constructor
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Noor Alam",24);
        s1.printInfo();


    }
}
 */

//code 4
class pen{
    String color;
    String type; //ballpoint;gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){//copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Noor Alam";
        s1.age = 24;

        Student s2 = new Student(s1);
        s1.printInfo();


    }
}
