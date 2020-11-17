package com.caowen.sort;

public class Sort {
	//√∞≈›≈≈–Ú
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
//—°‘Ò≈≈–Ú
public static void changeSort(int[] arr) {
	if(arr == null || arr.length < 2) {
		return ;
	}
	for(int end = arr.length - 1; end > 0; end-- ) {
		int maxdest = end;
		for(int i = 0; i < end; i++) {
			if(arr[i] > arr[end]) {
				swap(arr,i,end);
			}
		}
	}
}

//≤Â»Î≈≈–Ú
public static void insertSort(int[] arr) {
	if(arr == null || arr.length < 2) {
		return ;
	}
	for(int i = 1; i< arr.length ; i++) {
		for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
			swap(arr,j,j + 1);
		}
	}
}

//πÈ≤¢≈≈–Ú
public static void sortProcess(int[] arr,int L, int R) {
	if( L == R ) {
		return ;
	}
int mid= (R + L)/2;
sortProcess(arr, L, mid );
sortProcess(arr, mid + 1, R);
merge(arr, L, mid, R);
}
public static void merge(int[] arr, int L, int mid, int R) {
	int[] help =new int[R- L + 1];
	int i = 0;
	int p1 = L;
	int p2 = mid + 1;
	while( p1 <= mid && p2 <= R ) {
		help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
	}
	while(p1 <= mid) {
		help[i++] = arr[p1++];
	}
	while(p2 <= R) {
		help[i++]= arr[p2++];
	}
	for(i = 0;i < help.length;i++) {
		arr[ L + i] = help[i];
	}
}
public static void swap(int[ ] arr, int i, int j) {
	int temp = 0;
	temp = arr[i];
	arr[i ] = arr[j];
	arr[j] = temp; 
}
}
