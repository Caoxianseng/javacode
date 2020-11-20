package com.caowen;

import java.util.Arrays;
import java.util.Scanner;
public class MoneyPerson {
	public String name;
	public int age;
	public int money;
	public int num;//�鵽�ĺ���
	MoneyPerson(){
		
	}
	MoneyPerson(String name,int age , int money,int num ){
		this.name = name;
		this.age = age;
		this.money = money;
		this.num = num;
	}
	public void print() {
		System.out.println("����:"+this.name +" "+"����:" + this.age+ " "+"��Ǯ��:" + this.money + " "+"�鵽�ĺ���:"+ this.num);
	}
	public static void queuebynumber(MoneyPerson[] arr) {//����һ������,��������,��������ǰ��������num����
		if(arr == null || arr.length < 2) {
			return ;
		}
		for(int end = arr.length - 1; end > 0; end--) {
			for(int i = 0; i < end; i++) {
				if(arr[i].num > arr[i + 1].num) {
					swap(arr, i ,i + 1);
				}
			}
		}
	}
	public static void swap(MoneyPerson[] arr, int i, int j) {
		MoneyPerson temp = null;
		temp = arr[i];
		arr[i ] = arr[j];
		arr[j] = temp; 
	}
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		MoneyPerson[] array = new MoneyPerson[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = new MoneyPerson(cin.next(),cin.nextInt(),cin.nextInt(),cin.nextInt());
		}
		queuebynumber(array);
		System.out.println();
		System.out.println("�ŶӵĴ������Ϣ����:");
		for(int i = 0; i < array.length; i++) {
			System.out.print("��"+(i+1)+"λ"+":");
			 array[i].print();
		}
	}
	
}
