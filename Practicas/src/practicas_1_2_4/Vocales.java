package practicas_1_2_4;

import java.util.List;
import java.util.ArrayList;

/**
 * Vocales.java
 * Programa que recibe una cadena de texto como parametro y devuelve la lista de palabras con al menos cuatro vocales diferentes.
 * @author dam17-06 2017.11.07
 */

public class Vocales {
	
		public static void palabrasCuatroVocales(String texto) {

			String[] palabra = texto.split(" ");
			List<String> lista = new ArrayList<String>();	// Crea una lista de Array

			for(int i=0; i<palabra.length; i++)
			{
				// Si la palabra contiene todas las vocales, se añade a una lista
			    if(palabra[i].contains("a") && palabra[i].contains("e") && palabra[i].contains("i") && palabra[i].contains("o"))
			        lista.add(palabra[i]);
			    else if(palabra[i].contains("a") && palabra[i].contains("e") && palabra[i].contains("i") && palabra[i].contains("u"))
			        lista.add(palabra[i]);
			    else if(palabra[i].contains("a") && palabra[i].contains("i") && palabra[i].contains("o") && palabra[i].contains("u"))
			        lista.add(palabra[i]);
			    else if(palabra[i].contains("e") && palabra[i].contains("i") && palabra[i].contains("o") && palabra[i].contains("u"))
			        lista.add(palabra[i]);
			    
			   System.out.println(lista);	// Imprime la lista por pantalla
			}
		}
		
		public static void main(String arguments[]) {
			palabrasCuatroVocales("hola murcielago aeiou aeiou");	// Llama al metodo
		}
}