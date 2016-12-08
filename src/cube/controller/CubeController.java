package cube.controller;

import java.util.ArrayList;

public class CubeController 
{
	private ArrayList<WhiteState> whiteFace;
	private ArrayList<BlueState> blueFace;
	private ArrayList<RedState> redFace;
	private ArrayList<GreenState> greenFace;
	private ArrayList<OrangeState> orangeFace;
	private ArrayList<YellowState> yellowFace;
	
	public CubeController()
	{
		whiteFace = new ArrayList<WhiteState>();
		buildWhiteFace();
		
		blueFace = new ArrayList<BlueState>();
		buildBlueFace();
		
		redFace = new ArrayList<RedState>();
		buildRedFace();
		
		greenFace = new ArrayList<GreenState>();
		buildGreenFace();
		
		orangeFace = new ArrayList<OrangeState>();
		buildOrangeFace();
		
		yellowFace = new ArrayList<YellowState>();
		buildYellowFace();
	}
	
	public void start()
	{
		
	}

	private void buildWhiteFace()
	{
		//get in order
		whiteFace.add(new WhiteCenter());
		whiteFace.add(new BlueEdge());
		whiteFace.add(new RedEdge());
		whiteFace.add(new GreenEdge());
		whiteFace.add(new OrangeEdge());
		whiteFace.add(new BlueRedCorner());
		whiteFace.add(new RedGreenCorner());
		whiteFace.add(new GreenOrangeCorner());
		whiteFace.add(new OrangeBlueCorner());	
	}
	
	private void buildBlueFace()
	{
		//relative to white face.
		blueFace.add(new BlueRedWhiteCorner());
		blueFace.add(new BlueWhiteEdge());
		blueFace.add(new BlueWhiteOrangeCorner());
		
		blueFace.add(new BlueRedEdge());
		blueFace.add(new BlueCenter());
		blueFace.add(new BlueOrangeEdge());
		
		blueFace.add(new BlueRedYellowCorner());
		blueFace.add(new BlueYellowEdge());
		blueFace.add(new BlueYellowOrangeCorner());
	}
	
	private void buildRedFace()
	{
		//relative to white face.
		redFace.add(new RedGreenWhiteCorner());
		redFace.add(new RedWhiteEdge());
		redFace.add(new RedWhiteBlueCorner());
		
		redFace.add(new RedGreenEdge());
		redFace.add(new RedCenter());
		redFace.add(new RedBlueEdge());
		
		redFace.add(new RedGreenYellowCorner());
		redFace.add(new RedYellowEdge());
		redFace.add(new RedYellowBlueCorner());
	}
	
	private void buildGreenFace()
	{
		
	}
	
	private void buildOrangeFace()
	{
		
	}
	
	private void buildYellowFace()
	{
		
	}
}
