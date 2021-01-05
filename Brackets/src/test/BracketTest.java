package test;
import tournament.Bracket;
import tournament.BracketImpl_Khan;
import tournament.FIFASoccerTeam;
import tournament.letters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static tournament.FIFASoccerTeam.BRAZIL;
import static tournament.FIFASoccerTeam.CHILE;

import org.junit.jupiter.api.Test;


class BracketTest {
	@Test
	void testGrouping() {
		List<letters> list1 = Arrays.asList(a,b,c,d,e,f,g,h);
		Bracket<letters> group1 = new BracketImpl_Khan<letters>(list1);
		
		Set<Set<Integer>> groupinglevel0 = group1.getGroupings(1);
		
	}

}
