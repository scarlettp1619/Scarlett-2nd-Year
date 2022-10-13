package com.scarlett.softdev;

public class InterruptionExample implements Runnable {
public void run () {
	while (!Thread.currentThread().isInterrupted()) {
		System.out.println(Thread.currentThread().getName() + "dum diddly dum...");
		try {
			Thread.sleep(10);
			System.out.println(Thread.currentThread().getName() + " : finished sleeping");
		} catch (InterruptedException e) {
			return;
		}
	}
}
}
