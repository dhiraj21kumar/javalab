//Part A 3.Design an algorithm to accept 5 strings from the user and print them in lexicographical order.

package javalab;

import java.util.*;

public class lexico {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String[] ls=new String[5];
		System.out.println("Enter five strings : ");
		System.out.print("First : ");
		ls[0]=in.next();
		System.out.print("Second : ");
		ls[1]=in.next();
		System.out.print("Third : ");
		ls[2]=in.next();
		System.out.print("Fourth : ");
		ls[3]=in.next();
		System.out.print("Fifth : ");
		ls[4]=in.next();
		Arrays.sort(ls);
		for(int i=0;i<5;i++)
		{
			System.out.println(ls[i]);
		}

	}

}
