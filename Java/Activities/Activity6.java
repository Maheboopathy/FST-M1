package Activities;
import java.util.*;
class Plane {
	private List<String> passengers;
	private int maxpassengers;
	private Date lasttimetookof;
	private Date lasttimelanded;
	
	public Plane (int maxpassengers) {
		this.maxpassengers = maxpassengers;
		this.passengers= new ArrayList<>();
	}
	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}
    public Date takeoff() {
    	this.lasttimetookof = new Date();
    	return lasttimetookof;
    }
    public void land() {
    	this.lasttimelanded = new Date();
    	this.passengers.clear();
    }
    public Date getlasttimelanded() {
    	return lasttimelanded;
    }
    public List<String> getpassengers() {
    	return passengers;
    }
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		//create object
		Plane plane = new Plane(10);
		//Add passengers
		plane.onboard("John");
		plane.onboard("Steve");
		plane.onboard("Anne");
		//takeoff time
		System.out.println("Take off time: " + plane.takeoff());
		System.out.println("Passengers Travelling: " + plane.getpassengers());
		//Thread of 5000
		Thread.sleep(5000);
		//Plane landing time
		plane.land();
		System.out.println("Plane landed at: " + plane.getlasttimelanded());
	    //passenger list
		System.out.println("Passengers on the plane after Landing: " + plane.getpassengers());
	}
}
