A group of friends are playing cards. Only numeric cards are in consideration along with the joker card (equivalent to 0) 12 the symbols in the cards are not
taken into account. Each player will receive a set of cards. The rule of game is to rearrange the set of cards to the possible number sequence. Player with the set of cards forming 
the smallest number wins the game. The sequence of cards should not start with a joker card. Task is to write a program for developing the logic of the game considering the set of cards as a number.
Input Format
A single integer N representing the card set.
  
Constraints
0 ≤ N ≤ 12 Digits only from 0–9 No leading zeros allowed in the final number

Output Format
A single integer representing the smallest valid rearranged number.

Sample Input 0
3421
Sample Output 0
1234
Sample Input 
9001
Sample Output 1
1009
Sample Input 2
0012
Sample Output 2
1002

___________________________________________________________________________________________________________________________________________________________________________________________________________________

import java.io.*;
import java.util.*;
public class Solution {
    public static int small(String n){
        char[] ch = n.toCharArray();
        Arrays.sort(ch);
        if(ch[0] == '0'){
            for(int i = 1; i < ch.length; i++){
                if(ch[i] != '0'){
                    char temp = ch[0];
                    ch[0] = ch[i];
                    ch[i] = temp;
                    break;
                }
            }
        }
        return Integer.parseInt(new String(ch));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); 
        System.out.print(small(n));
    }
}
