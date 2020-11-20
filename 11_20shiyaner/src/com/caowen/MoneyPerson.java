package com.caowen;

import java.util.Arrays;
import java.util.Scanner;
public class MoneyPerson {
	public String name;
	public int age;
	public int money;
	public int num;//抽到的号数
	MoneyPerson(){
		
	}
	MoneyPerson(String name,int age , int money,int num ){
		this.name = name;
		this.age = age;
		this.money = money;
		this.num = num;
	}
	public void print() {
		System.out.println("姓名:"+this.name +" "+"年龄:" + this.age+ " "+"存钱数:" + this.money + " "+"抽到的号数:"+ this.num);
	}
	public static void queuebynumber(MoneyPerson[] arr) {//定义一个函数,用来叫人,这个叫人是按照上面的num来叫
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
		System.out.println("排队的次序和信息如下:");
		for(int i = 0; i < array.length; i++) {
			System.out.print("第"+(i+1)+"位"+":");
			 array[i].print();
		}
	}
	
}
