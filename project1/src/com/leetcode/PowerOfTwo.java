package com.leetcode;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n)
	{
		if(n<=0) {
			return false;
		}
		return (n&(n-1))==0;                  //1000-->8
		                                     // 0111-->7
	}                                        //0000-->0
	public static void main(String[] args) {
		boolean result=isPowerOfTwo(5);
		System.out.println(result);
	}

}
