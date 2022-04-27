package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	int Choice = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT){
			Choice--;
		}
		
		if (keyCode == RIGHT){
			Choice++;
		}
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
	}


	public void draw()
	{	
	}
}
