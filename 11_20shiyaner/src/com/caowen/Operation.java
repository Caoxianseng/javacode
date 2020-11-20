package com.caowen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Operation {

    //字符串逆序排序
    public static void stringReverseOrder(String[] array){

        String[] result=new String[array.length];
        for(int i=array.length-1,k=0;i>=0;i--){
            result[k++]=array[i];
        }

        System.out.println("字符串数组的逆序排序：");
        for(Object k:result){
            System.out.print(k+" ");
        }
    }

    //求两个整型数组的交集
    public static void intersection(int[] array1,int[] array2) {

        //对两个整型数组进行升序排序
        Arrays.sort(array1);
        Arrays.sort(array2);
        //max 索引数组的最大长度
        int max=array1[array1.length-1]>array2[array2.length-1]?array1[array1.length-1]:array2[array2.length-1];
        int[] posArray=new int[max+1];//正数索引数组
        int[] negArray=new int[max+1];//负数索引数组
        int count=0;//交集元素的个数

        //将数组array1中元素出现的次数统计到正数索引数组posArray和负数索引数组negArray中
        for(int i=0;i<array1.length;i++){
            int key=array1[i];
            if(key>=0&&posArray[key]==0) posArray[key]++;
            if(key<0){
                if(negArray[-1*key]==0) negArray[-1*key]++;
            }
        }
        //将数组array2中元素出现的次数统计到正数索引数组posArray和负数索引数组negArray中
        for(int i=0;i<array2.length;i++){
            int key=array2[i];
            if(key>=0&&posArray[key]==1){
                posArray[key]++;
                count++;
            }
            if(key<0){
                if(negArray[-1*key]==1){
                    negArray[-1*key]++;
                    count++;
                }
            }
        }

        int i=0;
        int[] result=new int[count];//交集存放在数组result
        //将索引数组次数为2的下标赋给数组result
        for(int k=0;k<=max;k++){
            if(negArray[k]>=2) result[i++]=-1*k;
        }
        for(int k=0;k<=max;k++){
            if(posArray[k]>=2) result[i++]=k;
        }

        System.out.println("两个整型数组的交集：");
        Arrays.sort(result);//数组result升序排序
        for(Object k:result){//范围for打印数组result
            System.out.print(k+" ");
        }
    }

    //求两个浮点型数组的并集
    public static void union(double[] array1,double[] array2){

        int count=0;//并集元素的个数
        double[] result=new double[array1.length+array2.length];//并集存放的数组result
        //将两个浮点型数组array1和array2合并存放到数组result中
        for(int i=0;i<array1.length;i++){
            result[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++){
            result[array1.length+i]=array2[i];
        }

        Arrays.sort(result);//浮点数数组result升序排序
        //将浮点数数组result遍历，如果相邻元素重复，则将重复位置往后的元素依次前移，将重复位置的元素覆盖
        for(int i=1;i<array1.length+array2.length;i++){
            if(result[i]==result[i-1]){
                for(int j=i;j+1<array1.length+array2.length;j++){
                    result[j]=result[j+1];
                    count=j;
                }
            }
        }

        System.out.println("两个浮点型数组的并集：");
        for(int i=0;i<count;i++){//打印浮点数数组result
            System.out.print(result[i]+" ");
        }
    }
}
