package com.caowen.java1030;

import java.util.Scanner;
public class TestBook {
    public static void main(String[] args) {
        Scanner shuru=new Scanner(System.in);
        System.out.println("�������鼮����Ϣ��");
        try{
            Book book=new Book(shuru.next(),shuru.next(),shuru.next(),shuru.next(),shuru.next(),shuru.nextFloat());
        }
        catch(BookException k){
            System.out.println(k.getMessage());
        }
    }
}