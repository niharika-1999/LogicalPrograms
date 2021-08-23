package com.bridgelabz4;
import java.util.Scanner;
//Reversing a number

public class ReverseNumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Input Number:");//User input
		Scanner in = new Scanner(System.in);
		num = in.nextInt();//Input stored in num
		while(num!=0)
		{
			reversenum = reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reversed num is:" +reversenum);
		
		}

}
