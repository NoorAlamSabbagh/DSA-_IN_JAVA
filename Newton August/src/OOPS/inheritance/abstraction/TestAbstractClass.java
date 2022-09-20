package OOPS.inheritance.abstraction;

abstract class Bike{

    void message(){
        System.out.println("MOVEE......");
    }

    abstract void applyBrakes();
}

class Pulsar extends Bike{
    void applyBrakes() {
        System.out.println("Disc Breaks Applied.....");
    }
}

class SuperBike extends  Bike {
    void applyBrakes() {
        System.out.println("Hydraulic Breaks Applied.....");
    }
}

public class TestAbstractClass {
    public static void main(String[] args) {

        Pulsar p = new Pulsar();
        p.applyBrakes();

        Bike b = new Bike(){
            @Override
            void applyBrakes() {
                System.out.println("Applying Breaks Through Object");
            }
        };
        b.applyBrakes();
    }
    }



