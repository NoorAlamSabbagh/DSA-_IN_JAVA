package polymorpism;

class Animal{
    void makeSound(){
        System.out.println("Animal.....!");
    }
    void eat(){
        System.out.println("Eating.....!");
    }
}
class Lion extends Animal{
    void makeSound(){

        System.out.println("ROARR.....!");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("BARK.....!");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.makeSound();
//
//        Lion l = new Lion();
//        l.eat();
//        l.makeSound();

        Animal a = new Animal();
        Animal l = new Lion();
        Animal d = new Dog();

        a.makeSound();
        l.makeSound();
        d.makeSound();

        l.eat();
    }
}
