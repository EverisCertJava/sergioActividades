package mx.com.everis.tallerjava.interfaces;

public class Rectangle implements Shape {
	
	public Rectangle(){
		System.out.println("Rectangle");
	}
	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

}