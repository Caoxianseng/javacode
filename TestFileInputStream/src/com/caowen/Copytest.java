package com.caowen;
import java.io.*;

public class Copytest {

	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		try {
			in = new FileInputStream("F:\\JAVA_GITHUB\\shiyan4\\src\\com\\caowen\\shiyan4_1106\\LotteryHaving.java");
			
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ���ָ���ļ�");
			System.out.println(-1);
		}
		try {
			long num = 0;
			while((b = in.read()) != -1) {
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("����ȡ��" + num +" ���ֽ�");
		}catch(IOException e1) {
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}

	}

}