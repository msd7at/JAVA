package com.codingblocks.week1.day1;


public class Factorial {

	public static double factorial(int n) {
		
		if (n==0) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
	
	public static void factoriall(int n,int ans) {
		// TODO Auto-generated method stub
		System.out.println(ans);
		if (n==0) {
			System.out.println(ans) ;
			return ;
		}
		 

		factoriall(n-1,ans*n);
		System.out.println(ans+"xsss");
		
	}
	
	public static void printPattern(int n) {
		
		if (n==0) {
			return;
		}
		System.out.println(n);
		printPattern(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		factoriall(5,1);
		printPattern(5);
		
	}

}
