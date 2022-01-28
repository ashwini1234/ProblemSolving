package com.practice;

import java.util.Arrays;

public class MaxDistanceSolution {
	public static void main(String [] args) {
		int arr[] = {7,2,3,1,8,9,4,5,6};
		findMaximumDistance(arr);
	}
	
	public static int findMaximumDistance(int arr[]) {
		int ans= 0;
		int size = arr.length;
		// Step 1: Create Left min Prefix array
		int[] Lmin= new int[size];
		int minValue = Lmin[0] = arr[0];
		for(int i=1; i<size;i++) {
			Lmin[i]= Math.min(minValue, arr[i]);
			minValue = Lmin[i];
		}
		System.out.println(Arrays.toString(Lmin));
		
		//Step 2: Create Right Max Prefix array
		int[] Rmax= new int[size];
		int maxValue = Rmax[size-1] = arr[size-1];
		for(int j=size-2; j>=0;j--) {
			Rmax[j]= Math.max(maxValue, arr[j]);
			maxValue = Rmax[j];
		}
		System.out.println(Arrays.toString(Rmax));
		
		//Step 3: Find Maximum Distance
		int i = 0;
		int j = 0;
		while( i<size && j<size) {
			if(Lmin[i]<= Rmax[j]) {
				ans = Math.max(ans, j-i);
				j++;
			}else {
				i++;
			}
		}
		return ans;
		
	}
}
