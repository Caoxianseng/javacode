package com.caowen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Operation {

    //�ַ�����������
    public static void stringReverseOrder(String[] array){

        String[] result=new String[array.length];
        for(int i=array.length-1,k=0;i>=0;i--){
            result[k++]=array[i];
        }

        System.out.println("�ַ����������������");
        for(Object k:result){
            System.out.print(k+" ");
        }
    }

    //��������������Ľ���
    public static void intersection(int[] array1,int[] array2) {

        //�������������������������
        Arrays.sort(array1);
        Arrays.sort(array2);
        //max �����������󳤶�
        int max=array1[array1.length-1]>array2[array2.length-1]?array1[array1.length-1]:array2[array2.length-1];
        int[] posArray=new int[max+1];//������������
        int[] negArray=new int[max+1];//������������
        int count=0;//����Ԫ�صĸ���

        //������array1��Ԫ�س��ֵĴ���ͳ�Ƶ�������������posArray�͸�����������negArray��
        for(int i=0;i<array1.length;i++){
            int key=array1[i];
            if(key>=0&&posArray[key]==0) posArray[key]++;
            if(key<0){
                if(negArray[-1*key]==0) negArray[-1*key]++;
            }
        }
        //������array2��Ԫ�س��ֵĴ���ͳ�Ƶ�������������posArray�͸�����������negArray��
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
        int[] result=new int[count];//�������������result
        //�������������Ϊ2���±긳������result
        for(int k=0;k<=max;k++){
            if(negArray[k]>=2) result[i++]=-1*k;
        }
        for(int k=0;k<=max;k++){
            if(posArray[k]>=2) result[i++]=k;
        }

        System.out.println("������������Ľ�����");
        Arrays.sort(result);//����result��������
        for(Object k:result){//��Χfor��ӡ����result
            System.out.print(k+" ");
        }
    }

    //����������������Ĳ���
    public static void union(double[] array1,double[] array2){

        int count=0;//����Ԫ�صĸ���
        double[] result=new double[array1.length+array2.length];//������ŵ�����result
        //����������������array1��array2�ϲ���ŵ�����result��
        for(int i=0;i<array1.length;i++){
            result[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++){
            result[array1.length+i]=array2[i];
        }

        Arrays.sort(result);//����������result��������
        //������������result�������������Ԫ���ظ������ظ�λ�������Ԫ������ǰ�ƣ����ظ�λ�õ�Ԫ�ظ���
        for(int i=1;i<array1.length+array2.length;i++){
            if(result[i]==result[i-1]){
                for(int j=i;j+1<array1.length+array2.length;j++){
                    result[j]=result[j+1];
                    count=j;
                }
            }
        }

        System.out.println("��������������Ĳ�����");
        for(int i=0;i<count;i++){//��ӡ����������result
            System.out.print(result[i]+" ");
        }
    }
}
