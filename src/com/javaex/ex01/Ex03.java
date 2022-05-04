package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg"); //불러들이는 경로 메소드
		BufferedInputStream bin = new BufferedInputStream(in);// 한번에 불러들이는 값을 늘려줌
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사시작");
		while(true) {
			int data = bin.read();//in값이 bin값안에 있으므로 bin만 써도 됢
		
			if(data == -1) {
				System.out.println("복사끝"+data);
				break;
			}
			bout.write(data);
		}
		

	}

}
