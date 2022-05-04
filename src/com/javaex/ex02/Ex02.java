package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");//읽어올 파일 경로
		BufferedReader br = new BufferedReader(fr);//읽어올때 쓰는 값
		
		while(true){
			String str = br.readLine(); //한줄씩 읽어온다 줄바꿈 기호는 제외
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		

	}

}
