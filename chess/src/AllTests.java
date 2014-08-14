import junit.framework.TestSuite;
import pieces.PawnTest;
import chess.BoardTest;


public class AllTests {

public static TestSuite suite() {
		
		TestSuite suite = new TestSuite();
		
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(PawnTest.class);
		
		return suite;
		
	}

}
