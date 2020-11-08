package com.caowe.test;

public class TestSuper {
	public static void main(String[] args) {
		B b = new B();
		b.f();
		
		Person p1 = new Person("A");
		Person p2 = new Person("B","shanghai");
		Student s1 = new Student("C","S1");
		Student s2 = new Student("C","shanghai","S2");
		Teacher t1 = new Teacher("D","xian","xiaozhang");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(t1.info());
		
		
	}
}

class A{
	protected void print(String s) {
		System.out.println(s);
	}
	A(){
		print("A()");
	}
	public void f() {
		print("A:f()");
	}
}
class B extends A{
	B(){
		print("B()");
	}
	public void f() {
		print("B:f()");
	}
}

class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		location = "beijing";
	}
	Person(String name, String location){
		this.name = name;
		this.location = location;	}

public String info() {
	return "name: "+name+" location "+ location;
}
}
class Student extends Person{
	
	private String school;
	Student(String name,String school){
		this(name,school,"beijing");
	}
	Student(String n,String l,String school){
		super(n,l);
		this.school = school;
	}
	public String info() {
		return super.info()+"school: "+school;
	}
}

class Teacher extends Person{
	private String work;
	Teacher(String name,String school){
		this(name,school,"zhuren");
	}
	Teacher(String n,String l,String work){
		super(n,l);
		this.work = work;
	}
	public String info() {
		return super.info()+"work: "+work;
	}
}



















