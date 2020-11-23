
public class TestSort {

	public static void swap(int[ ] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i ] = arr[j];
		arr[j] = temp; 
	}
	//简单的快排
	public static int prisiyion(int[] arr,int l, int r) {
		int p = arr[r];
		int less = l - 1;
		for(int i = l; i <= r; i++) {
			if(arr[i] <= p) {
				swap(arr,++less,i);
			}
		}
		return less;
	}
	
	//利用荷兰国旗问题继续改进快排
	public static void quickSort(int[] arr,int L, int R) {
		if(L < R) {
			swap(arr,L + (int)(Math.random()*(R - L + 1)),R);
			int[] p = partition(arr, L, R);
			quickSort(arr,L,p[0] - 1);
			quickSort(arr,p[1] + 1,R);
		}
	}
	
	
	//荷兰国旗问题
		public static int[] partition(int[] arr,int L, int R) {
			int less = L - 1;
			int more = R;
			while(L < more) {
				if(arr[L] < arr[R]) {
					swap(arr, ++less,L++);
				}else if(arr[L] > arr[R]) {
					swap(arr,--more,L);
				}else {
					L++;
				}
			}
			swap(arr,more,R);
			return  new int[]{less + 1,more}; 
		}

		
		
	public static void main(String[] args) {
		int[] array = {4,8,3,5,4,1,6,9,5,8,7,4,2,5};
		quickSort(array,0,array.length-1);
		 for(int i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
		 }
		 System.out.println();
		 
	}
	
	
	
	
	
	
}
