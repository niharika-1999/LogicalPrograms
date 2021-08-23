package com.bridgelabz4;
import java.util.concurrent.TimeUnit;
//To calculate Elapsed time

public class StopWatch {
	public static void main(String[] args) throws InterruptedException {
		long StartTime = System.nanoTime();
		TimeUnit.SECONDS.sleep(1);//sleep for 1 sec
		long EndTime = System.nanoTime();
		long ElapsedTime = EndTime - StartTime;//Difference between two time values
		System.out.println("Elapsed time in nanoseconds : " +ElapsedTime);
		
		
		}
	}

		