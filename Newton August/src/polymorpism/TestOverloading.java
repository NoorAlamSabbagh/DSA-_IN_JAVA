package polymorpism;

class Area{

    Area(){

    }

    Area(int x){

    }

    Area(int x , float abc){

    }

    //Square
    int calcArea(int side){
        return side * side;
    }

    //Rectangle
    float calcArea(int length, float breadth){
        return length * breadth;
    }

    //Rectangle
//    float calcArea(float length, int breadth){
//        return length * breadth;
//    }

    //Circle
    float calcArea(float radius){
        return (float)(Math.PI) * radius * radius;
    }

}

public class TestOverloading {
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println(a.calcArea(4));
        System.out.println(a.calcArea(2,6));
        System.out.println(a.calcArea(5.4f));

    }
}
