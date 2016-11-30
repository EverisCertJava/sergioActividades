package mx.com.everis.tallerjava.interfaces;

public class Square implements Shape {

	
	public Square(){
		System.out.println("Square");
	}
	@Override
	public void draw() {
		System.out.println("Draw Square");

	}

}
