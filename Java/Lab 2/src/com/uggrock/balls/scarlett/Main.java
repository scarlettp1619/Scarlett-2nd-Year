package com.uggrock.balls.scarlett;

import com.uggrock.balls.scarlett.Ugg.UggRock;

public class Main{

	public static void main(String args[]) {
		
		// anonymous class thread
		Thread a = new Thread() {
			public void run() {
				drawTwenty();
				this.interrupt();
			}
		};

		Thread b = new Thread() {
			public void run() {
				drawTwenty();
				this.interrupt();
			}
		};
		
		a.start();
		b.start();
		
		// rock.getSize() for size
		// rock.getType() for type
		// rock.rockValue() for value
		// size.toString() for size as string
		// type.toString() for type as string
		
	}
	
	public static void drawTwenty() {
		for (int i = 0; i < 20; i++) {
			Ugg ugg = new Ugg();
			UggRock rock = ugg.drawRock(); // draws rock
			System.out.println(Thread.currentThread().getName() + ": type - "
							+ rock.getType() + ", size - " + rock.getSize());
		}
	}
		
}