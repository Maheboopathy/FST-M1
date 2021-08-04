package Activities;

public class Activity1 {

	public static void main(String[] args) {
	//Object Honda for class Car
		Car Honda = new Car();
		//Adding values to variables
		Honda.imake = 2014;
		Honda.scolor = "Black";
		Honda.stransmission = "Manual";
		Honda.DisplayCharacterstics();
		Honda.accelerate();
		Honda.brake();
	}
}
