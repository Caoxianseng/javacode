package com.caowen;

import java.util.Scanner;
public class OperationTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int maxsize=cin.nextInt();//maxsize:字符串数组的长度
        String[] array=new String[maxsize];
        for(int i=0;i<maxsize;i++){//对字符串数组进行输入
            array[i]=cin.next();
        }

        Operation.stringReverseOrder(array);//将字符串数组逆序排序
        System.out.println();


        int maxsize1=cin.nextInt();//maxsize1:第一个整型数组的长度
        int[] array1=new int[maxsize1];
        for(int i=0;i<maxsize1;i++){//对第一个整型数组进行元素输入
            array1[i]=cin.nextInt();
        }

        int maxsize2=cin.nextInt();//maxsize2:第二个整型数组的长度
        int[] array2=new int[maxsize2];
        for(int i=0;i<maxsize2;i++){//对第二个整型数组进行元素输入
            array2[i]=cin.nextInt();
        }

        Operation.intersection(array1,array2);//两个整型数组的交集
        System.out.println();


        int maxsize3=cin.nextInt();//maxsize3:第一个浮点型数组的长度
        double[] array3=new double[maxsize3];
        for(int i=0;i<maxsize3;i++){//对第一个浮点数数组进行元素输入
            array3[i]=cin.nextDouble();
        }

        int maxsize4=cin.nextInt();//maxsize4:第二个浮点型数组的长度
        double[] array4=new double[maxsize4];
        for(int i=0;i<maxsize4;i++){//对第一个浮点数数组进行元素输入
            array4[i]=cin.nextDouble();
        }

        Operation.union(array3,array4);//两个浮点型数组的并集
        System.out.println();
    }
}
