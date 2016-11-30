package mx.com.everis.tallerjava.test;

import java.util.Scanner;

import mx.com.everis.tallerjava.enums.TamanioCafe;


public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("==Enums==");
		System.out.println(TamanioCafe.CHICO.getValue());
		System.out.println(TamanioCafe.MEDIANO.getValue());
		System.out.println(TamanioCafe.GRANDE.getValue());
		*/
		
		/*
		 * con un switch o if decidir que tamanio es el cafe */
		
		
		//String Tamanio = "CHICO";
		int mili = 500;
		
		/*Aquí pide el tamaño en LETRAS
		
		if(Tamanio.equals(TamanioCafe.CHICO)){		
			System.out.println(TamanioCafe.CHICO.getValue());
		}
		else if(Tamanio.equals(TamanioCafe.MEDIANO)){
			System.out.println(TamanioCafe.MEDIANO.getValue());
		}
		else if(Tamanio.equals(TamanioCafe.GRANDE)){
			System.out.println(TamanioCafe.GRANDE.getValue());
		}
		else {
			System.out.println(TamanioCafe.NO_TENGO.getValue());
		}*/
		
		/* Aquí pide el tamaño en mililitros*/
		
		if( mili <= 300 && mili >= 250){
			System.out.println(TamanioCafe.CHICO.getValue());
		}
		else if( mili <= 500 && mili > 300){
			System.out.println(TamanioCafe.MEDIANO.getValue());
		}
		else if (mili <= 1000 && mili > 500){
			System.out.println(TamanioCafe.GRANDE.getValue());
		}
		else{
			System.out.println(TamanioCafe.NO_TENGO.getValue());
		}
	}
}
