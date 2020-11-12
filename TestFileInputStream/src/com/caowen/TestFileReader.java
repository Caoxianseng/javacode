package com.caowen;
import java.io.*;
public class TestFileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		int c = 0;
		try {
			fr = new FileReader("F:\\JAVA_GITHUB\\shiyan4\\src\\com\\caowen\\shiyan4_1106\\LotteryHaving.java");
			int in = 0;
			while((c = fr.read()) != -1) {
				//char ch = (char) fr.read();
				System.out.print((char)c);
				//if(++in >= 100){ System.out.println(); in = 0;}
				
			}
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println("找不到指定文件");
			System.out.println(-1);
	    }catch(IOException e1) {
			System.out.println("文件读取错误");
			System.exit(-1);
		}
	}
}
