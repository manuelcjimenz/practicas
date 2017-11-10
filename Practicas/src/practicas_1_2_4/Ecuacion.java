package practicas_1_2_4;

/**
 * Ecuacion.java
 * Programa que realiza una ecuacion de segundo grado.
 * @author dam17-06 - 2017.11.07
 */

import java.lang.Math;

public class Ecuacion {

	public static void evaluarDiscriminante(int a, int b, int c) {
		
		
		// Se calcula la variable d, que se usara para realizar las comparaciones
		double d =(Math.pow(b, 2) - (4*a*c));
		
		if ((a == 0) && (b == 0))
			System.out.println("La ecuacion es degenerada");
		
		if ((a == 0) && (b != 0)) 
			System.out.println("Exista una raiz unica con valor -c / b");
		
		// Si se cumple la condicion, se realiza la ecuacion y proporciona las dos soluciones posibles
		if (d > 0){
			double x1 = (-b + Math.sqrt(d)) / (2*a);
			double x2 = (-b - Math.sqrt(d)) / (2*a);

		// Muestra por pantalla el siguiente texto
		System.out.println("Solucion uno =" + " " + x1);
		System.out.println("Solucion dos =" + " " + x2);
		
		}
		
		// Si "d" es menor que 0, muestra por pantalla el siguiente texto
		if (d < 0) System.out.println("Hay dos raíces complejas de la forma: x + yi y x - yi");
		
	}
	
	public static void main(String arguments[]) {
	evaluarDiscriminante(1,1,-1);
	}
}
