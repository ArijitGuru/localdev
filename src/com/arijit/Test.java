package com.arijit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("Enter number ...: ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String inputStr;
		try {
			int value = Integer.parseInt(inputStr = br.readLine());
			System.out.println("Input is ...: " + value);
			System.out.println("Sum is ...: " + a+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
