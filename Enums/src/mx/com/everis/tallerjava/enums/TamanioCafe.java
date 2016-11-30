package mx.com.everis.tallerjava.enums;

public enum TamanioCafe {
	
	
	
	/* */ 
	CHICO("Chiquirris"),
	
	/* */ 
	MEDIANO("Normalon"), 
	
	/* */
	GRANDE("Grandote"),
	
	NO_TENGO("No se lo venimos manejando");
	
	private String mensaje;
	
	private TamanioCafe(String tamanio){
		this.mensaje= tamanio;
	}
	
	public String getValue(){
		return this.mensaje;
	}
	
}
