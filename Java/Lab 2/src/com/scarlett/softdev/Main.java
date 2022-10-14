package com.scarlett.softdev;

import com.scarlett.softdev.Ugg.UggRock;

public class Main{
	
	public static void main(String args[]) {
		
		// anonymous class thread
		Thread a = new Thread(new Runnable() {
			public void run() {
				drawRocks(20);
			}
		});

		Thread b = new Thread(new Runnable() {
			public void run() {
				drawRocks(20);
			}
		});
		
		a.start();
		b.start();
		
		// rock.getSize() for size
		// rock.getType() for type
		// rock.rockValue() for value
		// size.toString() for size as string
		// type.toString() for type as string
		
	}
	
	public static void drawRocks(int x){
		for (int i = 0; i < x; i++) {
			Ugg ugg = new Ugg();
			UggRock rock = ugg.drawRock(); // draws rock
			System.out.println(Thread.currentThread().getName() + ": type - "
							+ rock.getType() + ", size - " + rock.getSize());
		}
	}	
}