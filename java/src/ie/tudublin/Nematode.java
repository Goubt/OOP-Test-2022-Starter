package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode extends PApplet{

    public String name;
    public int length;
    public int limbs;
    public String gender;
    public int eyes;

    public Nematode(TableRow row) {
        this(
            row.getString("name"),
            row.getInt("length"),
            row.getInt("limbs"),
            row.getString("gender"),
            row.getInt("eyes")
        );
    }

    @Override
    public String toString() {
        return "Nematode Name = " + name + " Length = " + length + " Limbs = " + limbs + " Gender = " + gender + " Eyes = " + eyes + "\n";
    }


    public Nematode(String name, int length, int limbs, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLimbs(){
        return limbs;
    }

    public void setLimbs(int limbs){
        this.limbs = limbs;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getEyes(){
        return eyes;
    }
    
    public void setEyes(int eyes){
        this.eyes = eyes;
    }

    
    
}
