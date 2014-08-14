package chess;

import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	
	public void testCreate() {
		Board board = new Board();
		assertEquals(0, board.getNumber());
		
		
		Pawn whitePawn = new Pawn(Pawn.WHITE);
		board.add(whitePawn);
		assertEquals(1, board.getNumber());
		
		
		Pawn blackPawn = new Pawn(Pawn.BLACK);
		board.add(blackPawn);
		assertEquals(2, board.getNumber());
		
		
	}
}
