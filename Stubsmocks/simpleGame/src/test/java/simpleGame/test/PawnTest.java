package simpleGame.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
//Eclipse might not find this one automatically:
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;
import simpleGame.core.Board;
import simpleGame.core.Direction;
import simpleGame.core.Pawn;
import simpleGame.exception.OutOfBoardException;

@RunWith(MockitoJUnitRunner.class) // This is required for mocks to work
public class PawnTest extends TestCase {

	/**
	 * Tests the constructor in a correct context
	 */
	@Test
	public void construct_correct() {
		Board boardMock = Mockito.mock(Board.class);
		Pawn pawn = new Pawn('a',1,2,boardMock);

        assertEquals('a', pawn.getLetter());
        assertEquals(1, pawn.getX());
        assertEquals(2, pawn.getY());
		assertEquals(0, pawn.getGold());
	}
	
	/**
	 * Tests the move method in a correct context
	 */
	@Test
	public void move_correct() throws OutOfBoardException {
		Board boardMock = Mockito.mock(Board.class);
		when(boardMock.getXSize()).thenReturn(5);
		when(boardMock.getYSize()).thenReturn(5);
		
		Pawn pawn = new Pawn('a',1,2,boardMock);
		pawn.move(Direction.Right);
		
		assertEquals(2, pawn.getX());
	}
	
	/**
	 * Tests the move method in a out of range case
	 */
	@Test(expected = OutOfBoardException.class)
	public void move_out() throws OutOfBoardException {
		Board boardMock = Mockito.mock(Board.class);
		when(boardMock.getXSize()).thenReturn(5);
		when(boardMock.getYSize()).thenReturn(5);
		
		Pawn pawn = new Pawn('a',1,2,boardMock);
		pawn.move(Direction.Left);
	}

}
