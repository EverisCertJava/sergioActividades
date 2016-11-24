package mx.com.everis.tallerjava.clases;

public class Persona {
	final String nombre = "Sergio";	
	
	public Persona(){
		
		/*	nombre = "Sergio2"; En este ejemplo nos marca un error porque variable es final y su valor no debera volver a asignarse*/
		}
	
	public final void getNombre(String nombre){
		System.out.println("mi nombre es" + nombre);
	}
	
}

class Professor extends Persona{
	/* void getNombre(String nombre){  No lo permite modificar porque el metodo ya fue declarado como final
		System.out.println("mi nombre es" + nombre);
	}*/
}
