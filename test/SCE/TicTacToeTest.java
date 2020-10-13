package SCE;
import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testHasWon() {
		TicTacToe.board[1][0]=TicTacToe.CROSS;
		TicTacToe.board[1][1]=TicTacToe.CROSS;
		TicTacToe.board[1][2]=TicTacToe.CROSS;
		assertTrue("You won",TicTacToe.hasWon(TicTacToe.CROSS, 1, 1));
	}

	@Test
	public void testValidate3inDiagonal() {
		for(int i=0;i<3;i++) {
			TicTacToe.board[i][i]=TicTacToe.CROSS;
		}
		assertTrue("3 in diaognal",TicTacToe.validate3inDiagonal(1, 1, 1));
	}

	@Test
	public void testBackwardDiagonal() {
		TicTacToe.board[0][2]=TicTacToe.CROSS;
		TicTacToe.board[1][1]=TicTacToe.CROSS;
		TicTacToe.board[2][0]=TicTacToe.CROSS;
		assertEquals(true,TicTacToe.backwardDiagonal(2, 0, TicTacToe.CROSS));
	}

	@Test
	public void testForwardDiagonal() {
		TicTacToe.board[0][0]=TicTacToe.CROSS;
		TicTacToe.board[1][1]=TicTacToe.CROSS;
		TicTacToe.board[2][2]=TicTacToe.CROSS;
		assertEquals(true,TicTacToe.forwardDiagonal(2, 2, TicTacToe.CROSS));
	}

	@Test
	public void testValidate3inColumn() {
		TicTacToe.board[0][0]=TicTacToe.CROSS;
		TicTacToe.board[1][0]=TicTacToe.CROSS;
		TicTacToe.board[2][0]=TicTacToe.CROSS;
		assertTrue("3 in col", TicTacToe.validate3inColumn(0, 1));
	}

}
