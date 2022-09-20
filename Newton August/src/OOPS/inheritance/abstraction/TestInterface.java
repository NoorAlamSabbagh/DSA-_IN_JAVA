//code 1
/*package OOPS.abstraction;

 abstract class Bike{

    void message(){
        System.out.println("MOVEE......");
    }

     abstract void applyBreaks();
}

class Pulsar extends  Bike{
    void applyBreaks() {
        System.out.println("Disc Breaks Applied.....");
    }
}

class SuperBike extends  Bike{
    void applyBreaks() {
        System.out.println("Hydraulic Breaks Applied.....");
    }
}
public class TestInterface {
}
  */

//code 2
/*package OOPS.abstraction;

interface Vehicle {
    void brakes();

}

interface Car extends Vehicle{
     void accelerate();
    void blowHorn();
}

class Nano implements Car {
    public void accelerate(){
        System.out.println("Nano Speeding.....");
    }
       public void blowHorn(){
            System.out.println("Nano Tring Tring.....");
        }

    @Override
    public void brakes() {

    }
}

     class Verna implements Car {
        public void accelerate() {
            System.out.println("Verna Speeds.....");
        }
        public void blowHorn() {
            System.out.println("Verna Honking.....");
        }
}

public class TestInterface {
    public static void main(String[] args) {
        Nano n = new Nano();
        n.blowHorn();

        Verna v = new Verna();
        v.blowHorn();

    }
}
 */