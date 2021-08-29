package com.javaexamples;

// Creating a Thread - Method 1
// Extending Thread class
// Note : You cannot extend any other class.
class BattingStatisticsThread extends Thread {
	// run method without parameters
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Running * Batting Statistics " + i);
	}
}

// Creating a Thread - Method 2
// Implementing Runnable interface
// Note : You cannot extend any other class.
class BowlingStatisticsThread implements Runnable {
	// run method without parameters
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Running ? Bowling Statistics " + i);
	}
}


public class ThreadExamples {
	
	private static void downloadAndStoreBattingStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Inside downloadAndStoreBattingStatistics");
	}
	
	private static void downloadAndStoreBowlingStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Inside downloadAndStoreBowlingStatistics");
	}

	private static void downloadAndStoreFieldingStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Inside downloadAndStoreFieldingStatistics");
	}
	
	private static void mergeAndAnalyze() {
		// TODO Auto-generated method stub
		System.out.println("Inside mergeAndAnalyze");
	}
	
	
	public static void main(String[] args) {

		// While implementing a Thread class, 
		// Create its object and call start method.
		BattingStatisticsThread battingThread1 = new BattingStatisticsThread();
		battingThread1.start();

		// Whjle implementing a Runnable Interface,
		// Create a new Thread object of the class object and call start method.
		BowlingStatisticsThread bowlingInterfaceImpl = new BowlingStatisticsThread();
		Thread bowlingThread2 = new Thread(bowlingInterfaceImpl);
		bowlingThread2.start();
		
		// Serial execution - move this code above the thread & see
		downloadAndStoreBattingStatistics();
		downloadAndStoreBowlingStatistics();
		downloadAndStoreFieldingStatistics();
		mergeAndAnalyze();

	}
}
