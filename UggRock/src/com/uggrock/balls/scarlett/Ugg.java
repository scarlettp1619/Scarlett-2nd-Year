package com.uggrock.balls.scarlett;

import java.util.Random;

public class Ugg {
	
	public enum UggRockSize {

		BIGUN((short) 5) {
			public String toString() {
				return "Bigun";
			}
		},
		QUITE_BIGUN((short) 3) {
			public String toString() {
				return "Quite-Bigun";
			}
		},
		NOT_SO_BIGUN((short) 1) {
			public String toString() {
				return "Not-So-Bigun";
			}
		};

		private short multiplierValue;

		UggRockSize(short multiplierValue) {
			this.multiplierValue = multiplierValue;
		}

		public short getMultiplier() {
			return multiplierValue;
		}
	}

	public enum UggRockType {

		SPECKILY((short) 7) {
			public String toString() {
				return "Speckily";
			}
		},
		OUCHY_BLACK((short) 20) {
			public String toString() {
				return "Ouchy-Black";
			}
		},
		FLOATY((short) 2) {
			public String toString() {
				return "Floaty";
			}
		},
		HOT_HOT_HOT((short) 15) {
			public String toString() {
				return "Hot-Hot-Hot";
			}
		};

		private short multiplierValue;

		UggRockType(short multiplierValue) {
			this.multiplierValue = multiplierValue;
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
		
		/*not-so-biguns 3x more than quite-biguns (6x more than biguns)
		quite-biguns 2x more than biguns

		any rock type equal*/
		
		UggRockSize size;
		UggRockType type;
		
		Random r = new Random();
		double rockSize = r.nextDouble();
		double rockType = r.nextDouble();
		
		if (rockSize < (double)1/6) {
			size = UggRockSize.BIGUN;
		} else if (rockSize < (double)1/3 && rockSize >= (double)1/6) {
			size = UggRockSize.QUITE_BIGUN;
		} else {
			size = UggRockSize.NOT_SO_BIGUN;
		}
		
		if (rockType < (double)1/4) {
			type = UggRockType.FLOATY;
		} else if (rockType < (double)1/2 && rockType >= (double)1/4) {
			type = UggRockType.HOT_HOT_HOT;
		} else if (rockType < (double)3/4 && rockType >= (double)1/2){
			type = UggRockType.OUCHY_BLACK;
		} else {
			type = UggRockType.SPECKILY;
		}
		
		UggRock rock = new UggRock(size, type);
		
		return rock;
	}
}
