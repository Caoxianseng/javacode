
public class Test {

	public static void swap(int[ ] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i ] = arr[j];
		arr[j] = temp; 
	}
	//��Ҫ�˽�������Ҫ�ȵ�����Ϊ�����
	public static void heapSort(int[] array) {
		if(array == null || array.length < 2) {
			return ;
		}
		for(int i = 0; i < array.length; i++) {//���forѭ�����Ǻ�����Ľ��������
			heapInsert(array,i);
		}//�������Ժ�,����,������,�Ϳ�ʼ����
		
		int heapSize = array.length;
		swap(array, 0 , --heapSize);
		while(heapSize > 0) {
			heapify(array,0,heapSize);
			swap(array,0,--heapSize);
		}
	}
	public static void heapInsert(int[] array, int index) {//���������,�ҵ����ֵ
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
	
	//ϵͳ�е�����,���þ����ۺ�����,size<60,�ͻ��ò�������,���>60����merge,����quick����
		
	public static void main(String[] args) {
		int[] array = {4,8,3,5,4,1,6,9,5,8,7,4,2,5};
		 heapSort(array);
		 for(int i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
		 }
		 System.out.println();
		 
	}
	
}
