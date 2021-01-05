package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CubeNetImpl_Khan implements CubeNet
{
	Color top;
	Color front;
	Color left;
	Color right;
	Color bottom;
	Color back;
	
	public CubeNetImpl_Khan(Color top, Color front, Color left, Color right, Color bottom, Color back)
	{
		this.top = top;
		this.front = front;
		this.left = left;
		this.right = right;
		this.bottom = bottom;
		this.back = back;
	}
	
	@Override
	public Color getTop()
	{
		return top;
	}

	@Override
	public Color getFront()
	{
		return front;
	}

	@Override
	public Color getLeft()
	{
		return left;
	}

	@Override
	public Color getRight()
	{
		return right;
	}

	@Override
	public Color getBottom()
	{
		return bottom;
	}

	public Color getBack()
	{
		return back;
	}
	
	private final static String RED_SQUARE = "\uD83D\uDFE5";
	private final static String GREEN_SQUARE = "\uD83D\uDFE9";
	private final static String BLUE_SQUARE = "\uD83D\uDFE6";
	private final static String YELLOW_SQUARE = "\uD83D\uDFE8";
	private final static String ORANGE_SQUARE = "\uD83D\uDFE7";
	private final static String WHITE_SQUARE = "\u2B1C";
	private final static String BLACK_SQUARE = "\u2B1B";
	private final static String NO_SQUARE = "?";
	
	private static Map<Color, String> colorToSquareMap = new HashMap<Color, String>();
	static
	{
		colorToSquareMap.put(Color.GREEN, GREEN_SQUARE);
		colorToSquareMap.put(Color.RED, RED_SQUARE);
		colorToSquareMap.put(Color.BLUE, BLUE_SQUARE);
		colorToSquareMap.put(Color.YELLOW, YELLOW_SQUARE);
		colorToSquareMap.put(Color.ORANGE, ORANGE_SQUARE);
		colorToSquareMap.put(Color.BLACK, BLACK_SQUARE);
	}
	private static String translateColorToSquare(Color color)
	{
		String squareString = (colorToSquareMap.containsKey(color) ? colorToSquareMap.get(color) : NO_SQUARE);
		return squareString;
	}
	
	public String toString()
	{	
		String translatedTop = translateColorToSquare(getTop());
		String translatedFront = translateColorToSquare(getFront());
		String translatedLeft = translateColorToSquare(getLeft());
		String translatedRight = translateColorToSquare(getRight());
		String translatedBottom = translateColorToSquare(getBottom());
		String translatedBack = translateColorToSquare(getBack());
		
		final String NEW_LINE = "\n";
		String firstRow = 	WHITE_SQUARE 	+ translatedTop 	+ WHITE_SQUARE 		+ NEW_LINE;
		String secondRow = 	translatedLeft 	+ translatedFront 	+ translatedRight 	+ NEW_LINE;
		String thirdRow = 	WHITE_SQUARE 	+ translatedBottom 	+ WHITE_SQUARE 		+ NEW_LINE;
		String fourthRow = 	WHITE_SQUARE 	+ translatedBack 	+ WHITE_SQUARE 		+ NEW_LINE;
		
		return firstRow + secondRow + thirdRow + fourthRow;
	}
	
	
	//rotating the cube right
	public void rotateRight() {
		Color temp = top;
		this.top = getLeft();
		left = getBottom();
		bottom = getRight();
		right = temp;
	}
	public void spinRight()
	{
		Color temp = top;
		top = getLeft();
		left = getBottom();
		bottom = getRight();
		right = temp;
	}

	private boolean possibleEqualCubes(CubeNet cube)
	{
		if( top == cube.getTop() & front == cube.getFront() & left == cube.getLeft() & right == cube.getRight() & bottom == cube.getBottom() & back == cube.getBack())
		{
			return true;
		}
		return false;
	}

	//overwrite equals method
	// 5 rotations and and spin right 4 times for each rotation
	
	public boolean equals(Object obj) {
		assert obj instanceof CubeNet: "Obj must be an instance of CubeNet";
		if(obj == null)
		{
			return false;
		}
		CubeNet cube = (CubeNet) obj;

		if(possibleEqualCubes(cube))
		{
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube))
		{
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();

		rotateRight();
		
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();

		rotateRight();
		
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();

		rotateRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}

		rotateRight();

		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		
		rotateRight();
		rotateRight();

		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}
		spinRight();
		if(possibleEqualCubes(cube)){
			return true;
		}

		return false;

	}
	public int hashCode()
	{
		return 0;
	}
}
