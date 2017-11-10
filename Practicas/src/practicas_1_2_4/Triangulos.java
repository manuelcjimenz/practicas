package practicas_1_2_4;

/**
 * Triangulos.java
 * Programa que pide el tamaño de los lados de un triangulo y te dice el tipo que es.
 * Incluye configuracion de entrada facil por teclado y la utiliza para dar un mensaje personalizado.
 * @author dam17-06 - 2017.11.08
 */

import java.util.Scanner;
public class Triangulos
{
	public static boolean esTriangulo(int lado, int lado2, int lado3)
	{
	
		
		
	if ((lado <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
		return false;	
		
	}
	else return true;
	
	}
	
	public static void tipoTriangulo(int lado, int lado2, int lado3) {
		
		if (!esTriangulo(lado,lado2,lado3)) {
			System.out.println("ERROR");
		}
		else if (lado == lado2 && lado2 == lado3) {
			System.out.println("Triangulo equilatero"); 
			}
		
		else if ((lado == lado2) || (lado == lado3) || (lado == lado3)) {
			System.out.println("Triangulo isosceles");
			}
		
		else {
			System.out.println("Triangulo escaleno");
		}
}
	
	
		public static void main(String arguments[]) {
			tipoTriangulo(1,1,1);
		}
	}
