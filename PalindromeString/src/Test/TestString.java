package Test;

import java.util.Stack;

public class TestString {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Node head = new Node('a');
		Node d1 = new Node('d');
		Node d2 = new Node('a');
		Node d3 = new Node('d');
		Node d4 = new Node('a');
		
		head.next = d1;
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		System.out.println(validPalindrome("agjfca"));
		
	}
	
	public static boolean f4(Node head) {
		Node ref = head;
		Stack<Character> stack = new Stack<>();
		while(ref != null) {
			stack.push(ref.data);
			ref = ref.next;
		}
		ref = head;
		while(ref != null) {
			char c = stack.pop();
			if(c != ref.data) {
				return false;
			}
			ref = ref.next;
		}
		return true;
	}
	
	public static boolean validPalindrome(String s) {
		char[] array = new char[s.length()];
		s.getChars(0, s.length(), array, 0);
		int i = 0;
		for(i = 0; i < s.length() ; i++) {
			StringBuffer sb = new StringBuffer();
			for(int n = 0; n < array.length ; n++) {
				if(n == i ) {
					continue;
				}
				sb.append(array[n]);
			}
			String s1 = sb.toString();
			int preIndex = -1;
			int endIndex = s1.length();
			int z = 0;
			for(  z = 0; z < s1.length()/2 ; z++ )  {
				preIndex++;
				endIndex--;
				if(s1.charAt(preIndex) != s1.charAt(endIndex)) {
					break;
				}
			}
			if(z == s1.length()/2)
			return true;
		}
		return false;
	}
	
	
	
	
		public static boolean f6(Node head) {
		
			//��ָ��:һ��������
			Node q = head;
			//��ָ��,һ����һ��
			Node s = head;
			
			while(q != null && q.next != null) {
				q = q.next.next;
				s = s.next;
			}
			
			q = s;
			
			Node temp = new Node(s.data);
			temp.next = s.next;
			
			while(temp.next != null) {
				Node pre = s;
				s = temp.next;
				temp.data = s.data;
				temp.next = s.next;
				s.next = pre;
			}
			
			q.next = null;
			  
			q = head;
			while(q.next != null) {
				if(q.data != s.data) {
					return false;
				}
				q = q.next;
				s = s.next;
			}
			
			
				return true;
	}
		
		
		
		
	
	private static class Node{
		//����
	public 	char data;
	//����
	public Node next;
	public Node(char data) {
		this.data = data;	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean f1(String target) {
		char[] help = new char[target.length()];//����ַ������������������ַ�
		char[] help2 = new char[target.length()];//����ַ������������������ַ�
		target.getChars(0, target.length(), help, 0);//���Բ�ѯAPI�������getChars();��ע������
		for(int i = 0; i < target.length(); i++) {
			help2[i] = help[target.length() - i - 1];//ע��������������,ע���±�
		}
		for(int i = 0; i < target.length(); i++) {
			if(help[i] != help2[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean f2(String target) {
		//�Ͳ�������дջ��,������������,ֱ�ӵ���
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < target.length(); i++) {
			stack.push(target.charAt(i));
		}
		for(int i = 0;i < target.length(); i++) {
			Character c = stack.pop();	
			if(c != target.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean f3(String target) {
		int preIndex = -1;//��ʼ���Ǹ�ǰָ��
		int endIndex = target.length();//��ָ��
		for(int  i = 0; i < target.length()/2; i++ ) {
			preIndex++;
			endIndex--;
			if(target.charAt(preIndex) != target.charAt(endIndex)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

