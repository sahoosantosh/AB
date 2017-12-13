package pack1;

import java.util.Scanner;

public class DivBy5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int num=Integer.parseInt(sc.nextLine());
		int temp=num%10;
		if(temp==5 | temp==0)
		{
			System.out.println(num+" : is divisible by 5");
		}
		else
		{
			System.out.println(num+" :not divisible by 5");
		}
	}

}
