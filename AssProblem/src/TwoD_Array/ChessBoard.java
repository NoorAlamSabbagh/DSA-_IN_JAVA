package TwoD_Array;

public class ChessBoard {
}
/*
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte zeroes=0;
        byte ones=0;

        for(byte i=1; i<=n; i++)

       {
         for(byte j=1; j<=n; j++)
         {
           byte input = sc.nextByte();
           int t_ind = (i+j)%2;
           if(t_ind == input)
           zeroes++;
           else
           ones++;

         }
       }
       System.out.print(Math.min(ones,zeroes));
    }
}
 */

/*
Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.

Input:
3
0 1 0
1 0 1
0 1 0

Output:
0
It already has a chess board like coloring.
 */