package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.CubeImpl_Khan;
import model.CubeNetImpl_Khan;

public class CubeSolver_Khan {

	//pre: 0 <= colors.size()
	//pre: value in colors cannot be null
	public static Set<Cube> getDistinctSolidCubes(Set<Color> colors) {
		assert !colors.contains(null) : "Null is not a color";
		assert colors != null :"Color Set cannot be = to null";
		if(colors.size()==0)
		{
			Set<Cube> emptySet = new HashSet<Cube>();
			return emptySet;
		}
		ArrayList<CubeNet> cubeArrayList = new ArrayList<CubeNet>();

		List<List<Color>> cubeComboList = createAllCombinations(colors);

		System.out.println(cubeComboList.size());
		
		for(int i = 0; i < cubeComboList.size(); i++)
		{

			CubeNet tempcube = new CubeNetImpl_Khan(cubeComboList.get(i).get(0),cubeComboList.get(i).get(1),cubeComboList.get(i).get(2),cubeComboList.get(i).get(3),cubeComboList.get(i).get(4),cubeComboList.get(i).get(5));
			boolean addCube = true; 
			for (int j=0; j<cubeArrayList.size(); j++) 
			{
				CubeNet cubeInList = cubeArrayList.get(j);
				if (tempcube.equals(cubeInList)) {
					addCube = false;
				}
			}
		
			if(addCube) {
			cubeArrayList.add(tempcube);	
			}
		}
		
		//now covert cubeSets to Cube before returning it
		
		Set<Cube> rv = new HashSet<Cube>();
		for (int i=0; i<cubeArrayList.size(); i++) {
			CubeNet cn = cubeArrayList.get(i);
			Cube newCube = new CubeImpl_Khan(cn);
			rv.add(newCube);
		}
		//System.out.println(rv);
		return rv;


	}

	private static List<List<Color>> createAllCombinations(Set<Color> colors) 
	{
		int maxCombos = colors.size() * 6;// 6 for the sides on a cube

		int numOfColors = colors.size();
		int cubeFaces = 6;

		List<List<Color>> cubeColorCombos = new ArrayList<List<Color>>(maxCombos);

		List<Color> colorsAsList = new ArrayList<Color>();
		for(Color c : colors)
		{
			colorsAsList.add(c);
		}

		for(int f1 = 0; f1 < numOfColors; f1++)
		{
			for(int f2 = 0; f2 < numOfColors; f2++)
			{
				for(int f3 = 0; f3 < numOfColors; f3++)
				{
					for(int f4 = 0; f4 < numOfColors; f4++)
					{
						for(int f5 = 0; f5 < numOfColors; f5++)
						{
							for(int f6 = 0; f6 < numOfColors; f6++)
							{
								List<Color> tempList = new ArrayList<Color>(cubeFaces);
								tempList.add(0, colorsAsList.get(f1));
								tempList.add(1, colorsAsList.get(f2));
								tempList.add(2, colorsAsList.get(f3));
								tempList.add(3, colorsAsList.get(f4));
								tempList.add(4, colorsAsList.get(f5));
								tempList.add(5, colorsAsList.get(f6));

								cubeColorCombos.add(tempList);
								//System.out.println(innerTempList);
							}
						}
					}
				} 
			}
		}
		
		return cubeColorCombos;
	}

}
