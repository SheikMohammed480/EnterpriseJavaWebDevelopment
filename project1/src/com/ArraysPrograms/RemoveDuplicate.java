package com.ArraysPrograms;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,9,3,4,9,3,2};
		Set<Integer> set=new HashSet<>();//remove duplicate elements & sorted
		//either string or int
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set);
		
		
	}

}
