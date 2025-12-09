Alice had to go to play with his friends. But his brother is not leaving. So, he thought to ask a question so that in the mean time he can go. So , the problem is as follows:
He will be given numbers n,m and k. Calculate T. (T = (nm)/k) His brother has to find the three
 coordinates of the XY plane (2D points) such that the area of the triangle formed by those points should be equal to T. If there is any solution print YES. else NO.
•Written program code by the candidate will be verified against the inputs which are supplied from the system.

Input Format
•The first line represents the n, m and k, each separated by a space.

Constraints
NOTE: 1≤ x1,y1, x2,y2, x3, y3 ≤ 10^9 1 ≤ n,m≤ 10^9 2 ≤ k ≤ 10^9

Output Format
•Print YES if there is any solution else NO
Sample Input 0
4 3 3
Sample Output 0
YES
Explanation 0
One possible way is (1,0), (2,3) and (4,1) are the points where there area is equal to T.

Sample Input 1
4 4 7
Sample Output 1
NO
Sample Input 2
15 8 7
Sample Output 2
NO
_________________________________________________________________________________________________________________________________________________________________________________________________________________

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        if(n==0||m==0||k==0){
            System.out.print("NO");
            return;
        }
        long val = (m*n)%k;
        if ( val == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
