package tictactoe;

import static org.junit.jupiter.api.Assertions.*;
import tictactoe.Mark;
import tictactoe.TicTacToeBoard;
import tictactoe.TicTacToeBoardImpl_Khan;
import org.junit.jupiter.api.Test;


class TicTacToeTest {

	@Test
	void testSet_testGet() {
		
		System.out.println("NOW TESTING SET AND GET MARK");
		
		Mark xMark = Mark.valueOf("X");
		Mark oMark = Mark.valueOf("O");
		TicTacToeBoard tic1 = new TicTacToeBoardImpl_Khan();
		Mark assertMark = tic1.getMark(0,0);
		assertEquals(null, assertMark);
		
		tic1.setMark(0,1);				//middle side
		assertMark = tic1.getMark(0,1);
		assertEquals(xMark, assertMark);
		
		tic1.setMark(0,0);
		assertMark = tic1.getMark(0,0); //left side
		assertEquals(oMark, assertMark);
		
		tic1.setMark(1,1);
		assertMark = tic1.getMark(1,1);
		assertEquals(xMark, assertMark);
		
		tic1.setMark(1,0);
		assertMark = tic1.getMark(1,0);
		assertEquals(oMark, assertMark);
		
		tic1.setMark(1,2);				
		assertMark = tic1.getMark(1,2);
		assertEquals(xMark, assertMark);
		
		tic1.setMark(0,2);
		assertMark = tic1.getMark(0,2);
		assertEquals(oMark, assertMark);
		
		tic1.setMark(2,2);				
		assertMark = tic1.getMark(2,2);
		assertEquals(xMark, assertMark);
		
		tic1.setMark(2,0);				
		assertMark = tic1.getMark(2,0);
		assertEquals(oMark, assertMark);
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	@Test
	void test_getTurn() 
	{
		System.out.println("NOW TESTING GET TURN");

		Mark xMark = Mark.valueOf("X");
		Mark oMark = Mark.valueOf("O");
		TicTacToeBoard tic1 = new TicTacToeBoardImpl_Khan();
		
		Mark assertMark = tic1.getTurn();
		assertEquals(xMark, assertMark);
		
		tic1.setMark(0,1);				//middle side
		
		assertMark = tic1.getTurn();
		assertEquals(oMark, assertMark);
		
		tic1.setMark(0,2);
		tic1.setMark(1,0);
		tic1.setMark(2,1);
		
		assertMark = tic1.getTurn();
		assertEquals(xMark, assertMark);
		
		tic1.setMark(2,2);
		assertMark = tic1.getTurn();
		assertEquals(oMark, assertMark);
		
		tic1.setMark(2,0);
		tic1.setMark(1,1);
		tic1.setMark(0,0);
		
		assertMark = tic1.getTurn();
		assertEquals(xMark, assertMark);
		
		tic1.setMark(1,2);
		
		assertMark = tic1.getTurn();
		assertEquals(null, assertMark);
		
		System.out.println(tic1.toString());
		
		TicTacToeBoard tic2 = new TicTacToeBoardImpl_Khan();
		tic2.setMark(0,0);
		tic2.setMark(0,1);
		tic2.setMark(0,2);
		
		assertMark = tic2.getTurn();
		assertEquals(oMark, assertMark);
		
		tic2.setMark(1,1);
		tic2.setMark(1,0);
		assertMark = tic2.getTurn();
		assertEquals(oMark, assertMark);
		
		tic2.setMark(2,1);
		
		assertMark = tic2.getTurn();
		assertEquals(null, assertMark);
		
		System.out.println(tic2.toString());
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}
	@Test
	void test_IsGameOver_getWinner()
	{
		System.out.println("NOW TESTING ISGAMEOVER AND GETWINNER");
		boolean assertGameOver = false;
		Mark xMark = Mark.valueOf("X");
		Mark oMark = Mark.valueOf("O");
		TicTacToeBoard tic1 = new TicTacToeBoardImpl_Khan();
		tic1.setMark(0,0);
		tic1.setMark(0,1);
		tic1.setMark(0,2);
		tic1.setMark(1,1);
		tic1.setMark(1,0);
		tic1.setMark(2,1);
		
		assertGameOver = tic1.isGameOver();
		assertEquals(true, assertGameOver);
		Mark assertIsWinner = tic1.getWinner();
		assertEquals(oMark,assertIsWinner);
		
		System.out.println(tic1.toString());
		
		TicTacToeBoard tic2 = new TicTacToeBoardImpl_Khan();
		tic2.setMark(0,0);
		tic2.setMark(0,1);
		tic2.setMark(0,2);
		tic2.setMark(1,1);
		tic2.setMark(1,0);
		tic2.setMark(1,2);
		
		assertGameOver = tic2.isGameOver();
		assertEquals(false, assertGameOver);
		
		tic2.setMark(2,0);
		
		assertGameOver = tic2.isGameOver();
		assertEquals(true, assertGameOver);
		
		assertIsWinner = tic2.getWinner();
		assertEquals(xMark,assertIsWinner);
		System.out.println(tic2.toString());

		TicTacToeBoard tic3 = new TicTacToeBoardImpl_Khan();
		tic3.setMark(0,0);
		tic3.setMark(0,1);
		tic3.setMark(0,2);
		tic3.setMark(1,1);
		tic3.setMark(1,0);
		tic3.setMark(1,2);
		tic3.setMark(2,2);
		tic3.setMark(2,0);
		
		assertGameOver = tic3.isGameOver();
		assertEquals(false, assertGameOver);
		
		tic3.setMark(2,1);
		
		assertIsWinner = tic3.getWinner();
		assertEquals(null,assertIsWinner);
		
		assertGameOver = tic3.isGameOver();
		assertEquals(true, assertGameOver);
		
		System.out.println(tic3.toString());
		
		System.out.println("TEST SUCCESFULLY COMPLETED");
	}

}
