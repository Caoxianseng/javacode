package com.caowen.test;
import java.util.Arrays;
public class TestLogarithm {
	public static void rightSort(int[] arr) {
		Arrays.sort(arr);
	}
	public static void bubbleSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return ;
		}
		for(int end = arr.length - 1; end > 0; end--) {
			for(int i = 0; i < end; i++) {
				if(arr[i] > arr[i + 1]) {
					swap(arr, i ,i + 1);
				}
			}
		}
	}
	public static void swap(int[ ] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i ] = arr[j];
		arr[j] = temp; 
	}
	
	public static int[] getRandomArray(int size, int value) {
		int[] arr = new int[(int)((size + 1)*(Math.random()))];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = (int)((value + 1) * Math.random()) - (int)((value)*Math.random()); 
		}
		return arr;
	}
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if((arr1 == null && arr1 != null)||(arr1 != null && arr2 == null)){
			return false;
		}
		if((arr1 == null) && (arr2 == null)){
			return true; 
		}
		if(arr1.length != arr2.length) {
			return false;
		}	
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] copyArray(int[] arr) {
		if(arr == null) {
			return null ;
		}
		int[] arr2 = new int[arr.length] ;
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i]; 
		}
		return arr2;
	}
	public static void printArray(int[] arr) {
		if(arr == null) {
			return ;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int testTime = 100000;
		int size = 100;
		int value = 100;
		boolean result = true;
		for(int i = 0; i < testTime; i++) {
			int[] arr1 = getRandomArray(size, value);
			int[] arr2 = copyArray(arr1);
			bubbleSort(arr1);
			rightSort(arr2) ;
			result =  isEqual(arr1, arr2);
			if(result == true) {
				result = true;
			}else {
				System.out.println("Fuck!");
				printArray(arr2) ;
				break;
			}
		}
		if(result == true) {
			System.out.println("succeed");
		}
	}
}
