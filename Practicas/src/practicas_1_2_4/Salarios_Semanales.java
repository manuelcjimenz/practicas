package practicas_1_2_4;

import java.util.Scanner;

/**
* Salarios_Semanales.java
* Programa que escribe en pantalla los multiplos de 2 por debajo de un TOPE, 16.
* ajs. 2017.10.25
*/


public class Salarios_Semanales {
	
	//Escribe un programa para calcular los salarios semanales de empleados a los que se les
	//paga 15 euros por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
		
		public static void calcularSalario() {

			Scanner teclado = new Scanner(System.in);
			Scanner teclado2 = new Scanner(System.in);
			
			int tope = 35;
			int horas;
			int salario = 0;
			String s;
			
			System.out.println("Numero de horas");
			horas = teclado.nextInt();
			
			if (horas <= tope) {
				salario = horas * 15;
			}
			System.out.println("El salario del trabajo es de " + " " + salario + "euros");
			
			
			
		}
			public static void main(String argumentos[]) {
				calcularSalario();
			}
	}
