package mx.com.everis.certjava.building;
import mx.com.everis.certjava.library.Book;

public class House extends Book{
	public House(){
		Book b = new Book(); /* Instancia erronea porque viene de un package diferente */
		b.author="ABC";
		b.modifyTemplate();
	}
}
