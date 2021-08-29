package com.javaexamples;


class Calculator extends Thread {
	long sum;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				sum += i;//4950
			}
			notify();
		}
	}
}

public class ThreadWaitAndNotify {
	
	public static void main(String[] args) {
		
		Calculator thread = new Calculator();
		thread.start();
		
		synchronized (thread) {
			try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//Try commenting the synchronized block above
		System.out.println(thread.sum);
	}
}
