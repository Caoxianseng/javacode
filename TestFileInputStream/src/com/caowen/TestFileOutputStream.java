package com.caowen;
import java.io.*;
public class TestFileOutputStream {
	
	public static void main(String[] args) {
	int b = 0;
	FileInputStream in = null;
	FileOutputStream out = null;
	try {
		in = new FileInputStream("F:\\JAVA_GITHUB\\TestFileInputStream\\src\\com\\caowen\\TestFileInputStream.java");
		out = new FileOutputStream("F:\\JAVA_GITHUB\\TestFileInputStream\\src\\com\\caowen\\Copytest.java");
		while((b = in.read()) != -1) {
			out.write(b);
		}
		in.close();
		out.close();
	}catch(FileNotFoundException e2){
		System.out.println("找不到指定文件");
		System.out.println(-1);
	}catch(IOException e1) {
		System.out.println("文件复制错误");
		System.exit(-1);
	}
	System.out.println("文件复制成功");
	}

}
