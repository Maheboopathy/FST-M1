package Activities;

abstract class Book {
	String title;
	//abstract method
	abstract void setTitle(String s);
	//concrete method
	String getTitle() {
		return title;
	}
}
class MyBook extends Book {
	//Define abstract method
	public void setTitle(String s) {
		title = s;
	}
}

public class Activity5 {

	public static void main(String[] args) {
		//Initialize title of the book
		String title = "Hover of the car";
		//Create object
		Book newNovel = new MyBook();
		//set title
		newNovel.setTitle(title);
		//print result
		System.out.println("Title of book: "+newNovel.getTitle());
	}

}
