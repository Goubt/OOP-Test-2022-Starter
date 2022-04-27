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

	public void draw()
	{	
		int offset = 80;
		int Ammount = NematodeArray.size();
		int NemaChoice = Choice % Ammount;
		clear();
		textSize(50);
		textAlign(CENTER);
		String Name = NematodeArray.get(NemaChoice).name;
		text(Name, 400, 50);
		int length = NematodeArray.get(NemaChoice).length;
		int Bounce = height/2 - (length/2*80);
		for (int i = 0; i < length; i++) {
			noFill();
			strokeWeight(10);
			stroke(255);
			circle(400, Bounce + (offset*i), 80);
				if (NematodeArray.get(NemaChoice).limbs == 1){
					line(360, Bounce + (offset*i), 300, Bounce + (offset*i));
					line(440, Bounce + (offset*i), 500, Bounce + (offset*i));
				}
			
		}
		String Penis = "m";
		String Vagina = "f";
		String Hema = "h";
		
		String Gender = NematodeArray.get(NemaChoice).gender;
		
		
		if (Gender.compareTo(Penis) == 0){
			
			line(400,Bounce + (offset*(length-1) + 40),400,Bounce + (offset*(length-1) + 60));
			circle(400, Bounce + (offset*(length-1) + 70), 20);
		}

		if (Gender.compareTo(Vagina) == 0){
			circle(400, Bounce + (offset*(length-1)), 20);
		}

		if (Gender.compareTo(Hema) == 0){
			line(400,Bounce + (offset*(length-1) + 40),400,Bounce + (offset*(length-1) + 60));
			circle(400, Bounce + (offset*(length-1) + 70), 20);
		
			circle(400, Bounce + (offset*(length-1)), 20);
		}
		
	
		if (NematodeArray.get(NemaChoice).eyes == 1){
			circle(350, Bounce - (offset), 30);
			circle(450, Bounce - (offset), 30);
			line(365, Bounce - (offset - 15), 380, Bounce - (offset - 40));
			line(435, Bounce - (offset - 15), 420, Bounce - (offset - 40));
			}
		
	}
}

