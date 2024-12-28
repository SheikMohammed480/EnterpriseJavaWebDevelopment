package com.leetcode;

public class ZerosToFront {
	public int[] Lastarray(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				a[count++]=a[i];
			
			}
			
		
		for(int i=count;i<a.length;i++)
		{
			a[count++]=0;
		}
		
		return a;
	}
	
//	public int[] Firstarray(int a[]) {
//		int Zerocount=0;
//		int nonZeroCount=0;
//
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==0)
//				{
//					Zerocount++;
//					nonZeroCount++;
//				}
//			else {
//			a[nonZeroCount++]=a[i];
//		}
//		}
//		for(int i=0;i<Zerocount;i++)
//		{
//			a[i]=0;
//			
//		}
//		return a;
//	}
	public static void main(String[] args) {
		int array[]= {1,2,3,4,0,5,0,0};
		ZerosToFront z=new ZerosToFront();
		int array1[]=z.Lastarray(array);
		//int array2[]=z.Firstarray(array);
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
	}

}
