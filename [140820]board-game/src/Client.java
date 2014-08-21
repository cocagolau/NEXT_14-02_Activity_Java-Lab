
public class Client {

	public static void main(String[] args) {
		
		// Board
		Board chess = new Board(5);
		
		Pawn wPawn = new Pawn("w");
		Pawn bPawn = new Pawn("b");
		
		// input
		// input type(Pawn, int x, int y)
		chess.put(wPawn, 1, 1);
		chess.put(bPawn, 2, 2);
		
		// print
		chess.print();
		
	}

}
