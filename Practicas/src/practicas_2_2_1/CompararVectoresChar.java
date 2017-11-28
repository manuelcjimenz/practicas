package practicas_2_2_1;

/**
* Escribe un método que se llame compararVectoresChar() que recibe dos vectores de caracteres. 
* Devuelve 0 si son iguales, 1 si el primero es mayor y -1 si el primero es menor.
* El orden alfabético de vectores de caracteres requiere la comparación uno a uno de sus caracteres, comenzando desde el extremo izquierdo. 
* El orden alfabético corresponde al orden numérico creciente del código del carácter.
* @author dam17-06 - 2017.11.21
*/

public class CompararVectoresChar {
	
	public static int compararVectoresChar(char[] array, char[] array2) {
		
		
		String cadenaUno = String.valueOf(array);		// Transforma el array en String
		String cadenaDos = String.valueOf(array2);		// Transforma el array en String
		
		// Condicion que compara el tamaño de los arrays, si no se cumple la condicion devuelve -2
		if(array.length != array2.length)	System.err.println("error (code -2)"); // Imprime un mensaje de error
		else {
			// Compara los dos array y devuelve un cero sin son iguales
			if(cadenaUno.compareTo(cadenaDos) == 0) {
				return 0;
			}
			// Compara los dos array y devuelve un  1 si el primero es mayor
			else if (cadenaUno.compareTo(cadenaDos) > 0) {
				return 1;
			}
			// Si no se cumple ninguna de las condiciones devuelve -1
			else return -1;
		}
		return -2;
		}
	
	public static void main(String arguments[]) {
		char[] array = new char[] {'a','c','b','n'};	// Declara los elementos del array
		char[] array2 = new char[] {'a','b','c'};		// Declara los elementos del array
		
		System.out.println(compararVectoresChar(array,array2));		// Llama al metodo
	}
}