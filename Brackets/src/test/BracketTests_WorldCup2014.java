package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tournament.FIFASoccerTeam.ALGERIA;
import static tournament.FIFASoccerTeam.ARGENTINA;
import static tournament.FIFASoccerTeam.BELGIUM;
import static tournament.FIFASoccerTeam.BRAZIL;
import static tournament.FIFASoccerTeam.CHILE;
import static tournament.FIFASoccerTeam.COLOMBIA;
import static tournament.FIFASoccerTeam.COSTA_RICA;
import static tournament.FIFASoccerTeam.FRANCE;
import static tournament.FIFASoccerTeam.GERMANY;
import static tournament.FIFASoccerTeam.GREECE;
import static tournament.FIFASoccerTeam.MEXICO;
import static tournament.FIFASoccerTeam.NETHERLANDS;
import static tournament.FIFASoccerTeam.NIGERIA;
import static tournament.FIFASoccerTeam.SLOVAKIA;
import static tournament.FIFASoccerTeam.SWITZERLAND;
import static tournament.FIFASoccerTeam.URUGUAY;
import static tournament.FIFASoccerTeam.USA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import tournament.Bracket;
import tournament.BracketImpl_Khan;
import tournament.FIFASoccerTeam;

public class BracketTests_WorldCup2014
{
	protected String TEST_GOAL_MESSAGE;
	
	@Rule public Timeout globalTimeout= new Timeout(300000);
	
	protected static Bracket<FIFASoccerTeam> worldCup2014KnockoutResults;
	protected static Bracket<FIFASoccerTeam> worldCup2014KnockoutResults_ALT;
	protected static Bracket<FIFASoccerTeam> worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD;
	protected static Bracket<FIFASoccerTeam> worldCup_DEGENERATE;
	
	@Before
	public void setUp()
	{
		System.out.println("SUBSET_FOR_STUDENTS.setUp()");
		List<FIFASoccerTeam> worldCup2014KnockoutRoundMatchups = Arrays.asList(BRAZIL, CHILE, COLOMBIA, URUGUAY, FRANCE, NIGERIA, GERMANY, ALGERIA, NETHERLANDS, MEXICO, COSTA_RICA, GREECE, ARGENTINA, SWITZERLAND, BELGIUM, USA);
		
		worldCup2014KnockoutResults = new BracketImpl_Khan<FIFASoccerTeam>(worldCup2014KnockoutRoundMatchups);
		worldCup2014KnockoutResults.setWinCount(GERMANY, 4);
		worldCup2014KnockoutResults.setWinCount(NETHERLANDS, 3);
		worldCup2014KnockoutResults.setWinCount(BRAZIL, 2);
		worldCup2014KnockoutResults.setWinCount(ARGENTINA, 2);
		worldCup2014KnockoutResults.setWinCount(COLOMBIA, 1);
		worldCup2014KnockoutResults.setWinCount(FRANCE, 1);
		worldCup2014KnockoutResults.setWinCount(COSTA_RICA, 1);
		worldCup2014KnockoutResults.setWinCount(BELGIUM, 1);
		
		List<FIFASoccerTeam> worldCup2014KnockoutRoundMatchups_ALT = Arrays.asList(USA, BELGIUM, SWITZERLAND, ARGENTINA, GREECE, COSTA_RICA, MEXICO, NETHERLANDS, ALGERIA, GERMANY, NIGERIA, FRANCE, URUGUAY, COLOMBIA, CHILE, BRAZIL);
		
		worldCup2014KnockoutResults_ALT = new BracketImpl_Khan<FIFASoccerTeam>(worldCup2014KnockoutRoundMatchups_ALT);
		worldCup2014KnockoutResults_ALT.setWinCount(GERMANY, 4);
		worldCup2014KnockoutResults_ALT.setWinCount(NETHERLANDS, 3);
		worldCup2014KnockoutResults_ALT.setWinCount(BRAZIL, 2);
		worldCup2014KnockoutResults_ALT.setWinCount(ARGENTINA, 2);
		worldCup2014KnockoutResults_ALT.setWinCount(COLOMBIA, 1);
		worldCup2014KnockoutResults_ALT.setWinCount(FRANCE, 1);
		worldCup2014KnockoutResults_ALT.setWinCount(COSTA_RICA, 1);
		worldCup2014KnockoutResults_ALT.setWinCount(BELGIUM, 1);
		
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD = new BracketImpl_Khan<FIFASoccerTeam>(worldCup2014KnockoutRoundMatchups_ALT);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(GERMANY, 4);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(NETHERLANDS, 3);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(BRAZIL, 2);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(ARGENTINA, 2);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(COLOMBIA, 1);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(FRANCE, 1);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(COSTA_RICA, 1);
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(BELGIUM, 1);

		//Netherlands wins instead:
		worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD.setWinCount(NETHERLANDS, 4);
		
		List<FIFASoccerTeam> matchups_DEGENERATE = Arrays.asList(USA);

		worldCup_DEGENERATE = new BracketImpl_Khan<FIFASoccerTeam>(matchups_DEGENERATE);
	}

	@Test(expected=AssertionError.class)
	public void testSetPredictedWinCountNullParticipant()
	{
		TEST_GOAL_MESSAGE = "Test setPredictedWinCount() precondition violation (null)";
		worldCup2014KnockoutResults.setWinCount(null, 0);
	}

	
	@Test(expected=AssertionError.class)
	public void testSetPredictedWinCountParticipantNotInTournament()
	{
		TEST_GOAL_MESSAGE = "Test setPredictedWinCount() precondition violation (" + SLOVAKIA + ")";
		worldCup2014KnockoutResults.setWinCount(SLOVAKIA, 0);
	}


	@Test
	public void testMaxLevel()
	{
		TEST_GOAL_MESSAGE = "Test getMaxLevel()";
		assertEquals(4, worldCup2014KnockoutResults.getMaxLevel());
	}


	@Test
	public void testGetGroupings1()
	{
		TEST_GOAL_MESSAGE = "Test getGroupings Level 1";
		Set<Set<FIFASoccerTeam>> groupingsLevel1 = worldCup2014KnockoutResults.getGroupings(1);
		System.out.println("groupingsLevel1 = " + groupingsLevel1);
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(BRAZIL, CHILE))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(COLOMBIA, URUGUAY))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(FRANCE, NIGERIA))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(GERMANY, ALGERIA))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(NETHERLANDS, MEXICO))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(COSTA_RICA, GREECE))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(ARGENTINA, SWITZERLAND))));
		assertTrue(groupingsLevel1.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(BELGIUM, USA))));
	}

	@Test
	public void testGetGroupings3()
	{
		TEST_GOAL_MESSAGE = "Test getGroupings Level 3";
		Set<Set<FIFASoccerTeam>> groupingsLevel3 = worldCup2014KnockoutResults.getGroupings(3);
		System.out.println("groupingsLevel3 = " + groupingsLevel3);
		assertTrue(groupingsLevel3.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(BRAZIL, CHILE, COLOMBIA, URUGUAY, FRANCE, NIGERIA, GERMANY, ALGERIA))));
		assertTrue(groupingsLevel3.contains(new HashSet<FIFASoccerTeam>(Arrays.asList(NETHERLANDS, MEXICO, COSTA_RICA, GREECE, ARGENTINA, SWITZERLAND, BELGIUM, USA))));
	}
	
	protected <P> Set<P> getSet(P[] participants)
	{
		Set<P> set = new HashSet<P>();
		for(int i = 0; i < participants.length; i++)
		{
			set.add(participants[i]);
		}
		return set;
	}

	@Test
	public void testGetViableParticpantsLevel1()
	{
		TEST_GOAL_MESSAGE = "Test getViableParticipants Level 1";
		assertEquals(getSet(new FIFASoccerTeam[]{BRAZIL}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {BRAZIL, CHILE}))));
		assertEquals(getSet(new FIFASoccerTeam[]{COLOMBIA}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {COLOMBIA, URUGUAY}))));
		assertEquals(getSet(new FIFASoccerTeam[]{FRANCE}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {FRANCE, NIGERIA}))));
		assertEquals(getSet(new FIFASoccerTeam[]{GERMANY}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {GERMANY, ALGERIA}))));
		assertEquals(getSet(new FIFASoccerTeam[]{NETHERLANDS}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {NETHERLANDS, MEXICO}))));
		assertEquals(getSet(new FIFASoccerTeam[]{COSTA_RICA}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {COSTA_RICA, GREECE}))));
		assertEquals(getSet(new FIFASoccerTeam[]{ARGENTINA}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {ARGENTINA, SWITZERLAND}))));
		assertEquals(getSet(new FIFASoccerTeam[]{BELGIUM}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {BELGIUM, USA}))));
	}

	@Test
	public void testGetViableParticpantsLevel3()
	{
		TEST_GOAL_MESSAGE = "Test getViableParticipants Level 3";
		assertEquals(getSet(new FIFASoccerTeam[]{GERMANY}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {BRAZIL, CHILE, COLOMBIA, URUGUAY, FRANCE, NIGERIA, GERMANY, ALGERIA}))));
		assertEquals(getSet(new FIFASoccerTeam[]{NETHERLANDS}), worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {NETHERLANDS, MEXICO, COSTA_RICA, GREECE, ARGENTINA, SWITZERLAND, BELGIUM, USA}))));
	}

	@Test(expected=AssertionError.class)
	public void testGetViableParticpantsBadGrouping()
	{
		TEST_GOAL_MESSAGE = "Test bad grouping";
		worldCup2014KnockoutResults.getViableParticipants(new HashSet<FIFASoccerTeam>(getSet(new FIFASoccerTeam[] {BRAZIL, COLOMBIA, FRANCE, GERMANY, NETHERLANDS, COSTA_RICA, CHILE, URUGUAY})));
	}

	@Test
	public void testEquals()
	{
		TEST_GOAL_MESSAGE = "Test equals";
		assert worldCup2014KnockoutResults != null : "worldCup2014KnockoutResults is null!";
		assert worldCup2014KnockoutResults_ALT != null : "worldCup2014KnockoutResults_ALT is null!";
		assertTrue(worldCup2014KnockoutResults.equals(worldCup2014KnockoutResults));
		assertTrue(worldCup2014KnockoutResults_ALT.equals(worldCup2014KnockoutResults_ALT));
	}

	@Test
	public void testEquals2()
	{
		TEST_GOAL_MESSAGE = "Test equals";


		assertTrue(worldCup2014KnockoutResults.equals(worldCup2014KnockoutResults_ALT));
		assertTrue(worldCup2014KnockoutResults_ALT.equals(worldCup2014KnockoutResults));
	

	}

	@Test
	public void testEquals3()
	{
		TEST_GOAL_MESSAGE = "Test equals";
		assertTrue(!worldCup2014KnockoutResults.equals(worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD));
		assertTrue(!worldCup2014KnockoutResults_ALT.equals(worldCup2014KnockoutResults_NETHERLANDS_WINS_INSTEAD));
	}

	@Test
	public void testEquals4()
	{
		TEST_GOAL_MESSAGE = "Test equals against null";
		assertTrue(!worldCup2014KnockoutResults.equals(null));
	}

	@Test
	public void testEquals5()
	{
		TEST_GOAL_MESSAGE = "Test equals against null";
		assertTrue(!worldCup2014KnockoutResults.equals(worldCup_DEGENERATE));
		assertTrue(!worldCup_DEGENERATE.equals(worldCup2014KnockoutResults));
	}
}
