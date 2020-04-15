package javalab;

import java.util.*;

public class happyNumber {
	
	int fin1=0;
	int sum=0;

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number to be tested as happy or unhappy : ");
		int num=(int)Math.pow(in.nextInt(), 2);
		System.out.println(num);
		happyNumber p=new happyNumber();
		while(num>9)
		{
			System.out.println(p.callMe(num));
			num=p.callMe(num);
		}
		if(num==1)
			System.out.println("Its a happy number : )");
		else
			System.out.println("Its unhappy :(");		
	}
	int callMe(int sum)
	{
		int fin=0;
		String temp=Integer.toString(sum);
		int len=temp.length();

			for(int i=0;i<len;i++)
			{
				
				System.out.println("1 : " +(int)Math.pow(sum%10,2));
				fin=fin+(int)Math.pow(sum%10,2);
				sum=sum/10;
			}
			sum=fin;
			return sum;

	}

}
