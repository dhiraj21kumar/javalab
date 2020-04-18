//Part A 
// 1.a Design an algorithm to accept a value for ‘n’ and calculate the total number of all possible squares in a square matrix.

package javalab;

import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the value of n for n-Square Matrix : ");
			int n=in.nextInt();
			if(n<=0)
				System.out.println("invalid input");
			else
			{
				int sum=0;
				while(n!=0)
				{
					sum=sum+n*n;
					n--;
				}
				System.out.println("The number square matrices are : " +sum);
			}
		}

	}

}
