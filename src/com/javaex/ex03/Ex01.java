package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		ArrayList<Person> aList = new ArrayList<Person>();

		
		String Line;
		String[] Array;
		
		
		for (int i=0; i<3; i++) {
			Line = br.readLine();
			Array = Line.split(",");
			System.out.println("이름:"+ Array[0]);
			System.out.println("핸드폰:"+Array[1]);
			System.out.println("회사:"+Array[2]);
			System.out.println("");
		}
	
	}

}
