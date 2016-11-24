package mx.com.everis.tallerjava.classinterface;
import mx.com.everis.tallerjava.masreglas.InterfazRules;


public class ClaseInter implements InterfazRules{
	
	public String getName(){
		name = "Israel"; // Las variables declaradas en las interfaces son FINAL (constantes) y marca un error porque
						 // intentamos cambiar su valor original proveniente de InterfazRules
		return null;
	}

	public String getAge() {
		return null;
	}


	public String getApellido() {
		return null;
	}
	
}
