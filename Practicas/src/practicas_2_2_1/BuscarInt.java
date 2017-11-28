package practicas_2_2_1;

/**
 * BuscarInt.java
 * Escribe un método que se llame buscarInt() que recibe un vector de enteros y un valor a buscar dentro del vector. 
 * Devuelve el índice de la primera ocurrencia dentro del vector proporcionado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} si se busca 4 devolvería 3.
 * @author dam17-06
 */


public class BuscarInt {

	public static int buscarInt(int[] array, int num) {
		
		int x;	// Variable tipo entero
		
		for (x = 0; x < array.length; x++) { // Recorre los elementos del array
			if (array[x] == num) {		// Si los valores del array es igual a la variable num
				return x;	// Devuelve x
			}
	 
		}
		
		return -1;	// Si no se cumple la condicion devuelve -1
	}
	
	public static void main(String arguments[]) {
		int[] array = new int[] {4,8,0,1,5};	// Declara los elementos del array
		System.out.println(buscarInt(array,8)); // Llama al metodo
	}
}