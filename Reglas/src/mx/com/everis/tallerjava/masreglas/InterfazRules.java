package mx.com.everis.tallerjava.masreglas;

public interface InterfazRules extends InterfazUno, InterfazDos{
	
	// se utiliza la palabra extends para poder heredar de otras interfaces
	
	
	
	
	String name = "Sergio";
	
	String getName(); // Estamos declarando un método abstracto
	
	public String getAge(); // pueden ser publicas (NO pueden ser static)
	
	abstract String getApellido();// pueden ser abstractas
	
	final String getApellidoMa(); // No puede ser final por tanto marca error
	
	native String getNameApe(); // No puede ser native por tanto marca error
	
	/* 
	 Conclusión: Solo pueden ser publicos y abstractos
		Las variables declaras dentro de la interfaz son FINAL por lo tanto se vuelven CONSTANTES (no pueden modificarse)
	 */
}
