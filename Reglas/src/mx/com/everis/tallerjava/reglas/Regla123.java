package mx.com.everis.tallerjava.reglas;
/* puede no tener packege si esta en raíz pero si se encuentra dentro de uno en la primer linea estara el package*/

import mx.com.everis.tallerjava.test.*;


/*Debera estar despues los import*/

@SuppressWarnings("unused")
public class Regla123 /*El nombre de la clase publica se llama igual que el archivo*/{

	
	String nombre; //Debe iniciar con letras
	String $nombre; // Tambien con signo de pesos
	String _nombre; // O guión bajo
	
	String apel$_4; // Puede tener convinación de caracteres posterior a si se respetaron las reglas anteriores.
	String parangaricutirimicuato123456_$$_$_$_$_$_$_$_$_$_$_$_$_$_$_$_$; //Puede ser tan larga como lo queramos
	
	String ejemplo;
	String Ejemplo; // Estas tres variables tienen el mismo nombre pero java es sensible a mayusculas y minusculas por lo que es diferente.
	String ejempLO; 
	
	
	
	public static String getName(){
		//  static final String name = "Sergio"; MODIFICA ESTO ESTA MAL
		String name="sergio";
		return name;
		
	}
}


class reglasabc{
	//Podemos tener más de una clase pero solo una publica y deben tener nombres diferentes
	
}

class reglasdef{
	//podemos tener cuantas queramos
}