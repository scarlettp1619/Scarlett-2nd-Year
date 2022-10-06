package com.uggrock.balls.scarlett;

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
	
	public UggRock drawRock(UggRockSize size, UggRockType type) {
		
		/*not-so-biguns 3x more than quite-biguns
		quite-biguns 2x more than biguns

		any rock type equal*/
		
		
		
		UggRock rock = new UggRock(size, type);
		
		return rock;
	}
}
