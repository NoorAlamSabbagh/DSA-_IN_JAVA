package Basics;

import java.util.Scanner;

/*public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            int count= 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count ==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
 */

//code : prime number in a range
public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int n = low; n <= high; n++) {
            int count = 0;

            //try to divide n and increase count
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            //try to divide n and increase count

            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}