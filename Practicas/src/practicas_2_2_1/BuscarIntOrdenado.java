package practicas_2_2_1;

/**
 * BuscarIntOrdenado.java
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. 
 * Devuelve true si está ordenado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} devolvería false.
 * Hay que recorrer el vector secuencialmente comprobando por parejas y 
 * si se encuentra un par de elementos desordenados hay que terminar sin llegar al final del recorrido.
 * @author dam17-06
 */

public class BuscarIntOrdenado {

	public static boolean yaOrdenadoInt(int[] array) {
		
		boolean ordenado = true;	// Variable tipo booleana
		int x;		// Variable tipo entera
		
		for (x = 1; x < array.length; x++) {	// Recorre los elementos del array
			if (((array[x])-1) < array[x-1]) {	// Busca los numeros consecutivos
				return !ordenado;	// Devuelve false
			}
		}
		
		return ordenado;	// Devuelve true
	}
	
	
	public static void main(String arguments[]) {
		int[] array = new int[] {1,2,3,4,6,5,9};	// Declara los elementos del array
		System.out.println(yaOrdenadoInt(array));	// Llama al metodo
	}

}