package com.arijit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Enter number ...: ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try {
				int value = Integer.parseInt(br.readLine());
				System.out.println("Input is ...: " + value);
				System.out.println("Sum is ...: " + c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
