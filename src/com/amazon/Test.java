package com.amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		/*String s = "1A 1B,2C 2C";
		int n = 3;

		String ta = "1B";*/

		
		// String s="1A 2A,12A 12A"; int n=12; String ta="12A";
		 		
		 String s="1B 2C,2D 4D"; int n=4; String ta="2B 2D 3D 4D 4A";
		 

		String output = t.solution(n, s, ta);
		System.out.println(output);
	}

	public Test() {

	}

	public String solution(int N, String S, String T) {

		List<BattleShip> battleShipsList = splitBattleShips(S, N * N);
		List<Place> noOfHitsList = splitNoOfHits(T, N * N);

		int touch = 0, sunk = 0;

		Iterator<BattleShip> battleShip = battleShipsList.iterator();

		while (battleShip.hasNext()) {

			BattleShip cur = battleShip.next();

			int touched = cur.getHits(noOfHitsList);

			if (touched > 0) {

				if (touched == cur.getSize()) {

					sunk++;

				} else {

					touch++;

				}

			}

		}

		return "" + sunk + "," + touch;

	}

	public List<Place> splitNoOfHits(String hits, int maximumHits) {

		List<Place> hitList = new ArrayList<Place>(maximumHits);

		String[] coords = hits.split(" ");

		for (String coord : coords) {

			hitList.add(new Place(coord));

		}

		return hitList;

	}

	public List<BattleShip> splitBattleShips(String ships, int maximumShips) {

		List<BattleShip> battleShipsList = new ArrayList<BattleShip>(maximumShips);

		String[] battleShipsCo = ships.split(",");

		for (String shipCo : battleShipsCo) {

			String[] cos = shipCo.split(" ");

			battleShipsList.add(new BattleShip(new Place(cos[0]), new Place(cos[1])));

		}

		return battleShipsList;

	}

	static public class Place {

		int x;

		int y;

		public Place(String cos) {

			x = (cos.toUpperCase().charAt(1)) - ('A');

			y = (cos.charAt(0)) - ('1');

		}

		public int getX() {

			return x;

		}

		public int getY() {

			return y;

		}

		public boolean greaterOrEqual(Place other) {

			return x >= other.x && y >= other.y;

		}

		@Override

		public String toString() {

			return "(" + x + ", " + y + ")";

		}

	}

	static public class BattleShip {

		private Place left;

		private Place right;

		public BattleShip(Place left, Place right) {

			this.left = left;

			this.right = right;

		}

		public Place getLeft() {

			return left;

		}

		public Place getRight() {

			return right;

		}

		public int getSize() {

			return (Math.abs(left.getX() - right.getX()) + 1)

					* (Math.abs(left.getY() - right.getY()) + 1);

		}

		@Override

		public String toString() {

			return "(" + left + ", " + right + ")";

		}

		public int getHits(List<Place> shots) {

			Iterator<Place> shotIt = shots.iterator();

			int hits = 0;

			while (shotIt.hasNext()) {

				Place shot = shotIt.next();

				if (shot.greaterOrEqual(left) && right.greaterOrEqual(shot)) {

					hits++;

				}

			}

			return hits;

		}

	}

}
