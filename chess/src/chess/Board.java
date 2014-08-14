package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Pawn;

public class Board {

	private List<Pawn> pawns = new ArrayList<Pawn>();
	
	public int getNumber() {
		
		return pawns.size();
	}

	public void add(Pawn pawn) {
		pawns.add(pawn);
		
	}

}
