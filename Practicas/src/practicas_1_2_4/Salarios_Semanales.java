 package practicas_1_2_4;

import java.util.Scanner;

/**
* Salarios_Semanales.java
* Escribe un programa para calcular los salarios semanales de empleados.
* @author dam17-06 2017.10.25
*/


public class Salarios_Semanales {
	
	//Escribe un programa para calcular los salarios semanales de empleados a los que se les
	//paga 15 euros por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
		
		public static void calcularSalario(int horas) {

			// Declaracion de variables
			final int TOPE = 35;
			int salario = 15;
			int salarioextra = 22;
			int salariototal = salario * horas;
			int horasextra = horas - TOPE;
			
			// Si el numero de horas es menor que 34, se cumple la condicion, si no, se hace el else
			if (horas <= 35) {
				System.out.println("El salario es" + " " + salariototal);
			}
			
				else {System.out.println("El salarios es" + " " + ((TOPE * salario) + (horasextra * salarioextra)) + " " + "euros");
				
			}
			
		}
			public static void main(String argumentos[]) {
				calcularSalario(40);	// Llama al metodo
			}
	}
