package com.java.unit.Project1;

public class Maximum {
	int max=0;
	int maximum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
