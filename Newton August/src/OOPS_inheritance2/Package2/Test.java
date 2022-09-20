package OOPS_inheritance2.Package2;

import OOPS_inheritance2.Package1.Vehicle;

class Bike extends Vehicle{
    void messageBike(){
        messageVehicle();
        System.out.println("ZZOOMMMM......!");
    }

}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.messageVehicle();

    }
}
