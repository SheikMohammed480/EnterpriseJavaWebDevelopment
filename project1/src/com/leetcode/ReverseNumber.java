package com.leetcode;

public class ReverseNumber {
	public int reverse(int x) {
		int sum=0,rem=0;
		while(x!=0) {
			rem=x%10;
			if(sum>Integer.MAX_VALUE/10||(sum==Integer.MAX_VALUE && rem>7))
				return 0;
			if(sum<Integer.MIN_VALUE/10||(sum==Integer.MIN_VALUE && rem<-8))
				return 0;
			sum=sum*10+rem;
			x=x/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		ReverseNumber r=new ReverseNumber();
		int result=r.reverse(153);
		System.out.println(result);

	}

}
