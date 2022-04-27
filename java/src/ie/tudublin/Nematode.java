package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode extends PApplet{

    
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private String eyes;

    public Nematode(TableRow row) {
        this(
            row.getString("name"),
            row.getInt("length"),
            row.getInt("limbs"),
            row.getString("gender"),
            row.getString("eyes")
        );
    }

    @Override
    public String toString() {
        return "Nematode Name = " + name + " Length = " + length + " Limbs = " + limbs + " Gender = " + gender + " Eyes = " + eyes + "";
    }


    public Nematode(String name, int length, int limbs, String gender, String eyes) {
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

    public String getEyes(){
        return eyes;
    }
    
    public void setEyes(String eyes){
        this.eyes = eyes;
    }

    
    
}
