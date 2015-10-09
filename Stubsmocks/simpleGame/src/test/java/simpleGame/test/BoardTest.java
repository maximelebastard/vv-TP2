package simpleGame.test;

//It is recommended to import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
//Eclipse might not find this one automatically:
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;
import simpleGame.core.Board;
import simpleGame.core.Pawn;

@RunWith(MockitoJUnitRunner.class) // This is required for mocks to work
public class BoardTest extends TestCase {

	@Test
	public void construct_correct() {
		Pawn pawnMock = Mockito.mock(Pawn.class);
		
		Board board = new Board(3, 5, 5, 2, 2);
		assertEquals(3, board.numberOfPawns());
	}
	
	@Test
	public void addPawn_correct() {
		Pawn pawnMock = Mockito.mock(Pawn.class);
		
		Board board = new Board(1, 5, 5, 2, 2);
		board.addPawn(pawnMock);
	
		assertEquals(2, board.numberOfPawns());
	}
	
	@Test
	public void removePawn_correct() {
		Pawn pawnMock = Mockito.mock(Pawn.class);
		
		Board board = new Board(1, 5, 5, 2, 2);
		board.addPawn(pawnMock);
		board.removePawn(pawnMock);
		assertEquals(1, board.numberOfPawns());
	}
	
	@Test
	public void removeAllPawn_correct() {
		Pawn pawnMock = Mockito.mock(Pawn.class);
		Pawn pawnMock2 = Mockito.mock(Pawn.class);
		Pawn pawnMock3 = Mockito.mock(Pawn.class);

		
		Board board = new Board(1, 5, 5, 2, 2);
		board.addPawn(pawnMock);
		board.addPawn(pawnMock2);
		assertEquals(2, board.numberOfPawns());
		
		board.removeAllPawns();
		
		assertEquals(0, board.numberOfPawns());
	}

}
