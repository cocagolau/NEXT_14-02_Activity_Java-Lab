
import java.util.ArrayList;
import java.util.HashMap;


public class Board {
	
	private int size;
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	private HashMap<Pawn, Point> pointMap = new HashMap<Pawn, Point>();
	
	public Board(int size) {
		this.size = size;
	}

	public void put(Pawn pawn, int x, int y) {
		this.pawns.add(pawn);
	
		Point point = new Point(x, y);
		pointMap.put(pawn, point);
	}

	public void print() {
		
		for (int i=0; i<this.size; ++i) {
			for (int j=0; j<this.size; ++j) {
				// i == x
				// j == y
				
				for (int p=0; p<this.pawns.size(); ++p) {
					Pawn tempPawn = this.pawns.get(p);
					Point tempPoint = this.pointMap.get(tempPawn);
					
					if (tempPoint.getX() == i && tempPoint.getY() == j) {
						System.out.print(tempPawn);
						
					} else {
						System.out.print(".");
						
					}
				}
			}
			System.out.println();
		}
		
		/*
		.....
		.w...
		..b..
		.....
		.....
		 */
	}

}
