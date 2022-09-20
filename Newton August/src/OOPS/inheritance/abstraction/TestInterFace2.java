package OOPS.inheritance.abstraction;

class GrandFather{

}
interface Father{
    void eat();
    void driveCar();
}

interface Mother{
    void eat();
    void painting();
}

class Child extends GrandFather implements Father, Mother  {
    public void eat(){
        System.out.println("Baby is eating fine....D");
    }

    @Override
    public void driveCar() {
        System.out.println("I inherited driving skills from my dad");
    }

    @Override
    public void painting() {
        System.out.println("I inherited painting skills from my mother");
    }
}

public class TestInterFace2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.eat();
        c.driveCar();
        c.painting();
    }
}
