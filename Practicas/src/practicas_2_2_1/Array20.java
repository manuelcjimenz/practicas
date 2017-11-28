package practicas_2_2_1;

/**
* Array20.java
* Programa simple que utiliza un array (vector) de 10 elementos de números enteros e inicializa cada elemento con el valor 7 en cada elemento.
* @author dam17-06 - 2017.11.17
*/

public class Array20 {
	
	public static void main(String arguments[]) {
		
		int[] array = new int[20] ; // Array con un indice de 20
		int dato = 5;	// Variable tipo entero
		
		for (int x = 0; x < array.length; x++) {	// Recorre los elementos del array
		System.out.println(array[x] * dato);
		}
	}
}