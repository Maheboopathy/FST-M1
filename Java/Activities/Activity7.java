package Activities;
//import java.util.*;

interface BicycleParts {
	public int gears = 0;
	public int currentspeed = 0;
}

interface BicycleOperations {
	public void applyBrake (int decrement);
	public void speedUp (int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
      public int gears;
      public int currentspeed;
      
      //constructor
      public Bicycle (int gears, int currentspeed) {
    	  this.gears = gears;
    	  this.currentspeed = currentspeed;
      }
      public void applyBrake (int decrement) {
    	  currentspeed -= decrement;
    	  System.out.println("Current Speed is: " + currentspeed);
      }
      public void speedUp (int increment) {
    	  currentspeed += increment;
    	  System.out.println("Current Speed is: " + currentspeed);
      }
      public String bicycleDesc () {
    	  return ("No.of gears: " + gears + "\nSpeed is:" + currentspeed);
      }
}

class MountainBike extends Bicycle {
	//add one more field
	public int seatheight;
	
	public MountainBike (int gears, int currentspeed, int startheight) {
		//invoking constructor
		super(gears, currentspeed);
		seatheight = startheight;
	}
	public void setHeight(int newvalue) {
		seatheight = newvalue;
	}
	public String bicycleDesc () {
  	  return ("No.of gears: " + gears + "\nSpeed is:" + currentspeed + "\nHeight is:" + seatheight);
    }
}

public class Activity7 {

	public static void main(String[] args) {
		//create object mb
		MountainBike mb = new MountainBike(3, 0, 25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);
	}

}
