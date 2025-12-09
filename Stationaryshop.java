A boy enters a stationery shop. There are N number of pencils and M number of erasers available in the shop. But the boy's mother insists that he can buy only P number
of pencils and E number of erasers. The task here is to find the number of ways the boy can choose 'P' pencils and 'E' erasers from the 
available N and M pencils & erasers respectively.
Note: The boy can choose in any order. N-number of pencils available in the shop M-number of erasers available in the shop P-number of
pencils he can choose to buy from N E-number of erasers he can choose to buy from M
  
Input Format
The candidate has to write the code to accept 4 input(s). First Input - Accept value for N(Positive integer number) Second Input-Accept value for M(Positive integer number) Third input Accept value for P(Positive integer number) Fourth input Accept value for E(Positive integer number)
Constraints
0

Output Format
The output should be a positive integer number or print the message (if any) given in the problem statement (Check the output in Example 1, Example 2)

Sample Input 0
3
1
2
1
  
Sample Output 0
3
  
Explanation 0
From the input given above 1st way of selecting: Select 1st and 2nd pencils, 1 eraser 2nd way of selecting: Select 2nd and 3rd pencils, 1 eraser 1st way of selecting: 
Select 1st and 3rd pencils, 1 eraser The Possible number of ways selecting 2 pencils and 1 eraser is 3
Hence the output is 3.

Sample Input 1
5
3
5
3
Sample Output 1
1
  
Explanation 1
From the input given above: 1st way of selecting: Select 1,2,3,4,5 Pencils and 1,2,3 erasers There is only one possible way of selecting 5 pencils and 3
Hence, the output is 1.

Sample Input 2
6
4
2
2
Sample Output 2
90
Explanation 2
C(6,2) = 15
C(4,2) = 6
Total = 90

Sample Input 3
4
4
5
2
Sample Output 3
0
Explanation 3
Invalid because P > N (5 > 4)

________________________________________________________________________________________________________________________________________________________________________________________________________________

import java.io.*;
import java.util.*;
public class Solution {
    static int nCr(int n, int r) {
    int ans = 1;
    for (int i = 1; i <= r; i++) {
        ans = ans * (n - i + 1) / i;
    }
    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();
        if(p>n || e>m){
            System.out.print(0);
            return;
        }
        System.out.print(nCr(n,p)*nCr(m,e));
    }
}
