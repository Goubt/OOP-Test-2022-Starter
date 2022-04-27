package ie.tudublin;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	int Choice = 0;
	int Ammount = 13;

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
		loadNematodes();
	}
	

	ArrayList<Nematode> NematodeArray = new ArrayList<Nematode>();

	public void loadNematodes()
	{
		
		Table table = loadTable("data/nematodes.csv", "header");
		for(TableRow row :table.rows()){
			Nematode nema = new Nematode(row);
			NematodeArray.add(nema);
		}
	}

	
	int grow;

	public void draw()
	{	
		textSize(50);
		textAlign(CENTER);
		text("Bryan", 400, 50);
		
	}
}

