package com.caowen;

import java.util.Scanner;
public class OperationTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int maxsize=cin.nextInt();//maxsize:�ַ�������ĳ���
        String[] array=new String[maxsize];
        for(int i=0;i<maxsize;i++){//���ַ��������������
            array[i]=cin.next();
        }

        Operation.stringReverseOrder(array);//���ַ���������������
        System.out.println();


        int maxsize1=cin.nextInt();//maxsize1:��һ����������ĳ���
        int[] array1=new int[maxsize1];
        for(int i=0;i<maxsize1;i++){//�Ե�һ�������������Ԫ������
            array1[i]=cin.nextInt();
        }

        int maxsize2=cin.nextInt();//maxsize2:�ڶ�����������ĳ���
        int[] array2=new int[maxsize2];
        for(int i=0;i<maxsize2;i++){//�Եڶ��������������Ԫ������
            array2[i]=cin.nextInt();
        }

        Operation.intersection(array1,array2);//������������Ľ���
        System.out.println();


        int maxsize3=cin.nextInt();//maxsize3:��һ������������ĳ���
        double[] array3=new double[maxsize3];
        for(int i=0;i<maxsize3;i++){//�Ե�һ���������������Ԫ������
            array3[i]=cin.nextDouble();
        }

        int maxsize4=cin.nextInt();//maxsize4:�ڶ�������������ĳ���
        double[] array4=new double[maxsize4];
        for(int i=0;i<maxsize4;i++){//�Ե�һ���������������Ԫ������
            array4[i]=cin.nextDouble();
        }

        Operation.union(array3,array4);//��������������Ĳ���
        System.out.println();
    }
}
