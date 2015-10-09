package simpleGame.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

import java.io.Console;

import org.mockito.Mockito;
//Eclipse might not find this one automatically:
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;
import simpleGame.core.Board;
import simpleGame.core.Direction;
import simpleGame.core.Game;
import simpleGame.core.GameForTest;
import simpleGame.core.Pawn;
import simpleGame.exception.OutOfBoardException;

@RunWith(MockitoJUnitRunner.class) // This is required for mocks to work
public class TestSequenceDiagram extends TestCase {
	
	private Board board;
	private Pawn pawn1;
	private Pawn pawn2;
	
	@Before
	public void setUp(){
		board = mock(Board.class);
		pawn1 = mock(Pawn.class);
		pawn2 = mock(Pawn.class);
	}
	
	@Test
	public void isGameOver_correct() {
		GameForTest game = new GameForTest();
		
		when(board.numberOfPawns()).thenReturn(2);
		when(board.maxGold()).thenReturn(3);
		
		game.setBoard(board);
		assertEquals(true, game.isGameOver());
		
		// Asserts
		verify(board).numberOfPawns();
		verify(board).maxGold();

	}
	
	@Test
	public void maxGold_correct() throws OutOfBoardException{
		Board aBoard = new Board(3, 10, 10, 4, 5);
				
		when(pawn1.getGold()).thenReturn(1);
		when(pawn2.getGold()).thenReturn(3);
		
		aBoard.addPawn(pawn1);
		aBoard.addPawn(pawn2);
						
		assertEquals(3, aBoard.maxGold());
		
		// Asserts
		verify(pawn1).getGold();
		verify(pawn2).getGold();
	}

}
