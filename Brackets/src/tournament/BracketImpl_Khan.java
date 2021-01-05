package tournament;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BracketImpl_Khan<P> extends BracketAbstract<P>
{
	public BracketImpl_Khan(List<P> participantMatchups)
	{
		super(participantMatchups);
	}
	
	//pre: true
	//part of post: getGroupings(rv).size() == 1
	public int getMaxLevel()
	{
		// to find the height or h (max level) of a binary tree use h = log base 2 of n, n being the number of total nodes
		int nodes = predictions.size();
		// to find the level of a set of nodes use: log(nodes)/log(2)
		double maxLevel = Math.log10(nodes)/Math.log10(2);
		
		return (int)maxLevel;
	}

	//part of pre: 0 <= level <= getMaxLevel()
	//part of post: rv != null
	//part of post: !rv.contains(null)
	//part of post: rv.contains(s) ==> (s != null)
	//part of post: rv.contains(s) ==> (!s.contains(null))
	//part of post: rv.contains(s) ==> (s.size() == 2^(level))
	//part of post: (rv.contains(s) && rv.contains(t)) ==> (s.equals(t) || (s.removeAll(t).size() == t.removeAll(s).size() == 0))
	//part of post: (rv.contains(s) && level > 0) ==> s.equals(a.addAll(b)) for some a, b in getGroupings(level-1)
	public Set<Set<P>> getGroupings(int level)
	{
		assert level <= getMaxLevel() : "level is out of range " + level;
		assert level >= 0 : "level is out of range " + level;
		
		Set<Set<P>> grouping = new HashSet<Set<P>>();
		// finds the bottom left index of the tree
		int currentMemberIndex = predictions.size()/2;
		// size of each set is equal to the level^2
		int sizeOfSet = (int) Math.pow(2, level);
		
		while(currentMemberIndex < predictions.size())
		{
			//create a new set that will go inside the main set
			Set<P> temp = new HashSet<P>();
			for(int i=0; i<sizeOfSet;i++)
			{
				temp.add(predictions.get(currentMemberIndex));
				currentMemberIndex++;
				
			}
			grouping.add(temp);
		}
		return grouping;
	}

	//part of pre: getGroupings(level).contains(grouping) for some 0 <= level <= getMaxLevel()
	//part of post: rv != null		//part of post: rv.size() > 0
	//part of post: grouping.containsAll(rv)		//part of post: For each participant t:
	//				[(0 < level) 
	//				&& (g in getGroupings(level - 1) ==> !getViableParticipants(g).contains(t))]
	//						==> !rv.contains(t)
	public Set<P> getViableParticipants(Set<P> grouping)
	{
		int groupingLevel = getLevelOfGroup(grouping);
		assert groupingLevel >= 0 && groupingLevel <= getMaxLevel() : "grouping level is out of range";
		assert (getGroupings(groupingLevel).contains(grouping)) : "The grouping is not inside of the bracket level";
		
		//convert the set into an arrayList so I can loop through it to check each particpant and see if they are still valid
		List<P> arrayOfGrouping = new ArrayList<P>(grouping);
		
		for(int i=0;i<arrayOfGrouping.size();i++)
		{
			int currentIndexOfMember = getParticipantIndex(arrayOfGrouping.get(i));
			int parentIndex = getParentIndex(currentIndexOfMember);
			int countLevel = 0;
			boolean isValid = true;
			while(countLevel<groupingLevel && isValid == true)
			{
				//if parentIndex is something other than the Current Member
				if(predictions.get(parentIndex) != null && predictions.get(parentIndex) != arrayOfGrouping.get(i))
				{
					grouping.remove(arrayOfGrouping.get(i));
					isValid = false;
				} 
				else
				{
					parentIndex = getParentIndex(parentIndex);
					countLevel++;
				}
			}
		}
		return grouping;
	}
	
	//part of pre: participant != null
	//part of pre: participant is in getGroupings(getMaxLevel()).iterator().next()
	//part of pre: 0 <= winCount
	//part of pre: winCount <= getMaxLevel()
	//part of post: (0 < level <= winCount())) ==>
	//						getViableParticipants(getGrouping(level)).contains(participant)
	//part of post: (getViableParticipants(getGrouping(exactWinCount)).contains(t) && 
	//					(winCount < level <= getMaxLevel())) ==>
	//						!getViableParticipants(getGrouping(level)).contains(t)
	public void setWinCount(P participant, int winCount)
	{
		//ask Dr.Kart if you can set a winCount over another participant
		assert  participant != null : "participant cannot be null";
		assert predictions.contains(participant) : "participant is not inside of the Bracket";
		assert winCount >= 0; 
		assert winCount <= getMaxLevel();
		
		int currentMemberIndex = getParticipantIndex(participant);

		for(int i=0;i<winCount;i++)
		{
			int nextWinIndex = getParentIndex(currentMemberIndex);
			if(predictions.get(nextWinIndex)== null)
			{
				predictions.set(nextWinIndex,participant);
				currentMemberIndex  = nextWinIndex;
			}
		}
	}
	
	//Find two groupings a and b at a lower level such that a U b = grouping with a INT b = empty
	// takes in a circle and looks at the child circles from it.  
	// rv.size() = 2
	private Set<Set<P>> getSubordinateGroupings(Set<P> grouping)
	{
		assert grouping.size() > 1 : "grouping.size() = " + grouping.size() + " <= 1!: grouping = " + grouping;
		throw new RuntimeException("NOT IMPLEMENTED!");
	}
	
	private int getParticipantIndex(P participant)
	{
		return predictions.lastIndexOf(participant);
	}

	private static int getParentIndex(int childIndex)
	{
		//fix this bc if the grouping is switched for the equals method then im screwed... there is no left or right side for a bracket!
		
		return (childIndex -1)/2;
	}
	
	private int getLevelOfGroup(Set<P> grouping)
	{
		return (int)Math.log(grouping.size()/Math.log(2));
	}
}
