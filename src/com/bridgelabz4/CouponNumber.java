package com.bridgelabz4;

public class CouponNumber {
	public static void main(String[] args) {
		char[] character="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int)(Math.random()*max);
		StringBuffer sb=new StringBuffer();
		while(random>0)
		{
			sb.append(character[random%character.length]);
			random/=character.length;
		}
		String CouponNum = sb.toString();
		System.out.println("Coupon Number : "+CouponNum);
	}

}
