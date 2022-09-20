package  DoubtSession;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, "A", "B", "C");
        System.out.println(counter);
    }

    static int counter = 0;
    public static  void toh(int n, String src, String des, String helper){
       //Base Case
        if(n==0){
           return;
       }

       //faith -> I wish toh could move n-1 discs to helper
        toh(n-1, src, helper, des);

       //work  -> I will move nth disc from src to des
        System.out.println("Move disc "+n+" from "+src+" -->" +des);
        counter++;

       //faith -> i wish toh could/would move n-1 disc from helper to des
        toh(n-1, helper, des, src);
        return;//this return does not need here but I write to people to not get confused
    }
}
