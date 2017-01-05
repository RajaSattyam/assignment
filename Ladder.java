/*
//Another method

public static int countWays(int n) {
    if (n == 1 || n == 2) return n;
    return countWays(n - 1) + countWays(n - 2);
}

*/


package com.jspiders.assignment;

import java.util.Scanner;

public class Ladder
{
	// A recursive function used by countWays
    static int solution(int A, int B)
    {
        if (A <= 1)
            return A;
        int res = 0;
        for (int i = 1; i<=B && i<=A; i++)
            res += solution(A-i, B);
		
        return res;
    }
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int B)
    {
        return solution(s+1, B);
    }
 
    /* Driver program to test above function */
    public static void main (String args[])
    {  Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of Stairs in the ladder : ");
       int s = sc.nextInt();
        int B = 2; int A = 1;
          System.out.println("Number of ways = "+ countWays(s,B));
    } 

}
