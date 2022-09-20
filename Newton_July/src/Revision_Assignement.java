//code 1
/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] str1 = sc.nextLine().toCharArray();
    char[] str2 = sc.nextLine().toCharArray();

    int n = str1.length;
    int m = str2.length;

    String[] flames = {"Siblings", "Friends","Love","Affection", "Marriage", "Enemy"};

    int hashCount = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(str1[i] == str2[j])
            {
                str1[i] = '#';
                str2[j] = '#';
                hashCount += 2;
                break;
            }
        }
    }

    int ans = (n + m - hashCount)%6;
    System.out.println(flames[ans]);
    }
}
 */

//code 2
/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        for(int i=0; i<n; i++)
        str[i] = sc.nextLine();

        int min = n;

        for(int i=0; i<n; i++){

            int zeros = 0, ones = 0;
            for(int j=0; j<n; j++){

                if(str[j].charAt(i) == '0')
                   zeros++;
                else
                   ones++;
          }

          int ans = Math.max(zeros, ones);
            min = Math.min(ans,min);
        }
        System.out.println(min);

    }
}
 */


//code 3
/*
static int Knight(int X, int Y){
//Ener your code here
int[] xvalues = {-2, -2, -1, +1, +2, +2, -1, +1};
int[] yvalues = {+1, -1, +2, +2, +1,-1, -2, -2};

int count = 0;

for(int i=0; i<8; i++){
    int xPos= X + xvalues[i];
    int yPos= Y + yvalues[i];

    if(xPos >=1 && xPos <=8 && yPos >=1 && yPos <=8)
    count++;
}
    return count;
}
 */