package com.Algorithms;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) { //change this condition to perform asc & desc
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
		public static void main(String[] args) {
	        int[] array = {5, 1, 4, 2, 8};
	        bubbleSort(array);
	        System.out.println("Sorted array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	}

