package mx.com.everis.tallerjava.general;
import mx.com.everis.tallerjava.clasepadre.Liquido;
import mx.com.everis.tallerjava.clasehijo.*;
import mx.com.everis.tallerjava.cosas.*;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liquido liquidoGeneral = new Liquido();
		Cafe liquidoCafe = new Cafe();
		
		Taza miTaza = new Taza();
		miTaza.agregarLiquido('liquidoGeneral');
	}

}
