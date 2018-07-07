package com.arijit.thread;

import java.text.SimpleDateFormat;

public class ThreadLocalTest implements Runnable{
	private static ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal <SimpleDateFormat>() {
		@Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
	};
	
	private static SimpleDateFormat formatter2 = new SimpleDateFormat("ddMMyyyy HHmm");
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread (new ThreadLocalTest(), "Thread1");
		Thread t2 = new Thread (new ThreadLocalTest(), "Thread2");
		Thread t3 = new Thread (new ThreadLocalTest(), "Thread3");
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		System.out.println("Thread Name = " + Thread.currentThread().getName() + " ******* " + " Formatter Pattern = " + formatter.get().toPattern());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		formatter.set(new SimpleDateFormat());
		System.out.println("Thread Name = " + Thread.currentThread().getName() + " ******* " + " Formatter Pattern = " + formatter.get().toPattern());
		
		System.out.println("Thread Name = " + Thread.currentThread().getName() + " ******* " + " Formatter2 Pattern = " + formatter2.toPattern());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		formatter2.applyPattern("yyMMdd");
		System.out.println("Thread Name = " + Thread.currentThread().getName() + " ******* " + " Formatter2 Pattern = " + formatter2.toPattern());
		
	}

}
