//code 1
/*package main.oops.inheritance;

class Animal{
    int legs;
    void eat(){
        System.out.println("Eating.....!");
    }
}

class Dog extends Animal{
    void bark(){

        System.out.println("Barking......!");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.legs = 2;
//        a.eat();

        Dog d = new Dog();
        d.bark();

        d.legs = 4;
        d.eat();
        System.out.println(d.legs);
    }
}


 */

//code 2 Single Level class
/*package main.oops.inheritance;

class Animal{
    private int legs;
    public void eat(){
        System.out.println("Eating.....!");
    }
    public Animal() {//default constructor
        this.legs = 0;
    }
    public Animal(int legs) {//generate constructor manually
        this.legs = legs;
    }
    public int getLegs() {// here I generate manually gutter and setter
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}

class Dog extends Animal{

    private int tail;
    public void bark(){

        System.out.println("Barking......!");
    }

    public Dog(){
        this.tail = 1;
    }

    public Dog(int tail, int legs){
        super(legs);
        this.tail = tail;

    }

    public int getTail() {//generate gutter and setter for animal
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;

    }
}

public class TestInheritance {
    public static void main(String[] args) {
//        Animal a = new Animal(2);
//        a.setLegs(2); //legs set as private properties So we can manually generate gutter and setter
//        a.eat();

        Dog d = new Dog(1,4);
        d.bark();
        d.eat();

//        d.setTail(1);
//        d.setLegs(4);

        System.out.println(d.getLegs());
        System.out.println(d.getTail());
    }
}

 */
 //code 3 Multilevel Class
/*package main.oops.inheritance;

class Animal{
    private int legs;
    public void eat(){
        System.out.println("Eating.....!");
    }
    public Animal() {//default constructor
        this.legs = 0;
    }
    public Animal(int legs) {//generate constructor manually
        this.legs = legs;
    }
    public int getLegs() {// here I generate manually gutter and setter
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}

class Dog extends Animal{

    private int tail;
    public void bark(){

        System.out.println("Barking......!");
    }

    public Dog(){
        this.tail = 1;
    }

    public Dog(int tail, int legs){
        super(legs);
        this.tail = tail;

    }

    public int getTail() {//generate gutter and setter for animal
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;

    }
}

class Puppy extends Dog{
    public void Sleep(){
        System.out.println("Sleeping.......!");
    }
}

public class TestInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.Sleep();
    }
}
 */

//code 4 Hierarichal Class
/*package main.oops.inheritance;

class Animal{
    private int legs;
    public void eat(){
        System.out.println("Eating.....!");
    }
    public Animal() {//default constructor
        this.legs = 0;
    }
    public Animal(int legs) {//generate constructor manually
        this.legs = legs;
    }
    public int getLegs() {// here I generate manually gutter and setter
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}

class Dog extends Animal{

    private int tail;
    public void bark(){

        System.out.println("Barking......!");
    }

    public Dog(){
        this.tail = 1;
    }

    public Dog(int tail, int legs){
        super(legs);
        this.tail = tail;

    }

    public int getTail() {//generate gutter and setter for animal
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;

    }
}

class Puppy extends Dog{
    public void sleep(){
        System.out.println("Sleeping.......!");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Meow.......!");
    }
}

public class TestInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}

 */

//code 5
/*package main.oops.inheritance;

class Animal{
    private int legs;
    public void eat(){
        System.out.println("Eating.....!");
    }
    public void messageAnimal(){
        System.out.println("Animal......");
    }
    public Animal() {//default constructor
        messageAnimal();
        this.legs = 0;
    }
    public Animal(int legs) {//generate constructor manually
        this.legs = legs;
    }

    public int getLegs() {// here I generate manually gutter and setter
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}

class Dog extends Animal {

    private int tail;

    public void bark() {

        System.out.println("Barking......!");
    }

    public Dog() {

        messageAnimal();

        this.tail = 1;
    }

    public Dog(int tail, int legs) {
        super(legs);
        this.tail = tail;

    }

    public int getTail() {//generate gutter and setter for animal
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;

    }


    class Puppy extends Dog {
        public void sleep() {
            System.out.println("Sleeping.......!");
        }
    }

    class Cat extends Animal {
        public void meow() {
            System.out.println("Meow.......!");
        }
    }

    public class TestInheritance {
        public static void main(String[] args) {

            Animal a = new Animal();
            a.messageAnimal();
        }
    }
}


 */