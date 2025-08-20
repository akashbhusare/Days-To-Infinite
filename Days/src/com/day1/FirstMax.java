package com.day1;

public class FirstMax {

	public static void main(String[] args) {
		
		int[] arr= {12,33,4,33,5,66};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
