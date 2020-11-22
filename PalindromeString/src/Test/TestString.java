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
		
			//快指针:一次走两次
			Node q = head;
			//慢指针,一次走一次
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
		//数据
	public 	char data;
	//引用
	public Node next;
	public Node(char data) {
		this.data = data;	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean f1(String target) {
		char[] help = new char[target.length()];//这个字符串数组用来正序存放字符
		char[] help2 = new char[target.length()];//这个字符串数组用来逆序存放字符
		target.getChars(0, target.length(), help, 0);//可以查询API里面对于getChars();的注意事项
		for(int i = 0; i < target.length(); i++) {
			help2[i] = help[target.length() - i - 1];//注意这里的逆序分配,注意下标
		}
		for(int i = 0; i < target.length(); i++) {
			if(help[i] != help2[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean f2(String target) {
		//就不在这里写栈了,采用拿来主义,直接调用
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
		int preIndex = -1;//开始的那个前指针
		int endIndex = target.length();//后指针
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

