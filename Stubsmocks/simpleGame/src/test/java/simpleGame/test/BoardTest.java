package simpleGame.test;

//It is recommended to import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
//Eclipse might not find this one automatically:
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;
import simpleGame.core.Board;
import simpleGame.core.Pawn;

@RunWith(MockitoJUnitRunner.class) // This is required for mocks to work
public class BoardTest extends TestCase {

	@Test
	public void maxGold() {
		Board board = new Board(1, 5, 5, 3, 3);
		
		Pawn mockPawn = mock(Pawn.class);
		when(mockPawn.getGold()).thenReturn(3);
	
		board.addPawn(mockPawn);
		
		assertEquals((int) 3, board.maxGold());
	}

}
