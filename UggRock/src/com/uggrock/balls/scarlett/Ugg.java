package com.uggrock.balls.scarlett;

import java.util.Random;

public class Ugg {

	public enum UggRockSize {

		BIGUN((short) 5),
		QUITE_BIGUN((short) 3),
		NOT_SO_BIGUN((short) 1);

		private short multiplierValue;

		UggRockSize(short multiplierValue) {
			this.multiplierValue = multiplierValue;
		}

		public String toString() {
			UggRockSize[] sizeVals = UggRockSize.values();
			for (UggRockSize size : sizeVals) {
				switch (size) {
				case BIGUN:
					return "Bigun";
				case QUITE_BIGUN:
					return "Quite-Bigun";
				case NOT_SO_BIGUN:
					return "Not-So-Bigun";
				}
			}
			return null;
		}

		public short getMultiplier() {
			return multiplierValue;
		}
	}

	public enum UggRockType {

		SPECKILY((short) 7),
		OUCHY_BLACK((short) 20),
		FLOATY((short) 2),
		HOT_HOT_HOT((short) 15);

		private short multiplierValue;

		UggRockType(short multiplierValue) {
			this.multiplierValue = multiplierValue;
		}

		public String toString() {
			UggRockType[] typeVals = UggRockType.values();
			for (UggRockType type : typeVals) {
				switch (type) {
				case SPECKILY:
					return "Speckily";
				case OUCHY_BLACK:
					return "Ouchy-Black";
				case FLOATY:
					return "Floaty";
				case HOT_HOT_HOT:
					return "Hot-Hot-Hot";
				}
			}
			return null;
		}

		public short getMultiplier() {
			return multiplierValue;
		}
	}

	public static class UggRock {

		private UggRockSize size;
		private UggRockType type;

		public UggRock(UggRockSize size, UggRockType type) {
			this.size = size;
			this.type = type;
		}

		public UggRockSize getSize() {
			return size;
		}

		public UggRockType getType() {
			return type;
		}

		public short rockValue() {
			short sizeValue = size.getMultiplier();
			short typeValue = type.getMultiplier();

			short rockValue = (short) (sizeValue * typeValue);
			return rockValue;
		}

	}

	public static UggRock drawRock() {

		/*
		 * not-so-biguns 3x more than quite-biguns (6x more than biguns) quite-biguns 2x
		 * more than biguns
		 * 
		 * any rock type equal
		 */

		UggRockSize size;
		UggRockType type;

		Random r = new Random();
		double rockSize = r.nextDouble();
		double rockType = r.nextDouble();

		if (rockSize < (double) 1 / 6) {
			size = UggRockSize.BIGUN;
		} else if (rockSize < (double) 1 / 3 && rockSize >= (double) 1 / 6) {
			size = UggRockSize.QUITE_BIGUN;
		} else {
			size = UggRockSize.NOT_SO_BIGUN;
		}

		if (rockType < (double) 1 / 4) {
			type = UggRockType.FLOATY;
		} else if (rockType < (double) 1 / 2 && rockType >= (double) 1 / 4) {
			type = UggRockType.HOT_HOT_HOT;
		} else if (rockType < (double) 3 / 4 && rockType >= (double) 1 / 2) {
			type = UggRockType.OUCHY_BLACK;
		} else {
			type = UggRockType.SPECKILY;
		}

		UggRock rock = new UggRock(size, type);

		return rock;
	}
}
