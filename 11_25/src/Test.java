
public class Test {

	public static void swap(int[ ] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i ] = arr[j];
		arr[j] = temp; 
	}
	//想要了解堆排序就要先调整称为大根堆
	public static void heapSort(int[] array) {
		if(array == null || array.length < 2) {
			return ;
		}
		for(int i = 0; i < array.length; i++) {//这个for循环就是和下面的结合来建堆
			heapInsert(array,i);
		}//建立完以后,无序,接下来,就开始排序
		
		int heapSize = array.length;
		swap(array, 0 , --heapSize);
		while(heapSize > 0) {
			heapify(array,0,heapSize);
			swap(array,0,--heapSize);
		}
	}
	public static void heapInsert(int[] array, int index) {//创建大根堆,找到最大值
		while(array[index] > array[(index - 1)/2]) {
			 swap(array,index,(index - 1)/2);
			 index = (index - 1)/2;
		}
	}
	
	public static void heapify(int [] array, int index, int size) {
		int left = index * 2 + 1;
		while(left < size) {
			int largest = (left + 1) <size && array[left + 1] > array[left]?(left + 1): left;
			largest = array[largest] > array[index]?largest:index;
			if(largest == index) {
				break;
			}
			swap(array,largest,index);
			index = largest;
			left = index * 2 + 1;
		}
	}
	
	//系统中的排序,调用就是综合排序,size<60,就会用插入排序,如果>60可能merge,可能quick排序
		
	public static void main(String[] args) {
		int[] array = {4,8,3,5,4,1,6,9,5,8,7,4,2,5};
		 heapSort(array);
		 for(int i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
		 }
		 System.out.println();
		 
	}
	
}
