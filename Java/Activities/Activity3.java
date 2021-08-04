package Activities;

public class Activity3 {

	public static void main(String[] args) {
    //initialize variables
		double seconds = 1000000000;
		double Earthseconds = 31557600;
		double Mercuryseconds = 0.2408467;
		double Venusseconds = 0.61519726;
		double Marsseconds = 1.8808158;
	    double Jupiterseconds = 11.862615;
	    double Saturnseconds = 29.447498;
	    double Uranusseconds = 84.016846;
	    double Neptuneseconds = 164.79132;
	    
	System.out.println("Age on Mercury:" +seconds/Earthseconds/Mercuryseconds);
	System.out.println("Age on Venus:" +seconds/Earthseconds/Venusseconds);
	System.out.println("Age on Earth:" +seconds/Earthseconds);
	System.out.println("Age on Mars:" +seconds/Earthseconds/Marsseconds);
	System.out.println("Age on Jupiter:" +seconds/Earthseconds/Jupiterseconds);
	System.out.println("Age on Saturn:" +seconds/Earthseconds/Saturnseconds);
	System.out.println("Age on Uranus:" +seconds/Earthseconds/Uranusseconds);
	System.out.println("Age on Neptune:" +seconds/Earthseconds/Neptuneseconds);
	}

}
