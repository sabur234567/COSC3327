package model;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;


public class CubeImpl_Khan implements Cube{
	Color top;
	Color front;
	Color left;
	Color right;
	Color bottom;
	Color back;
	
	public CubeImpl_Khan(CubeNet cube) {
		this.top = cube.getTop();
		this.front = cube.getFront();
		this.left = cube.getLeft();
		this.right = cube.getRight();
		this.bottom = cube.getBottom();
		this.back = cube.getBack();
		}

	@Override
	public CubeNet getSnapShot() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
