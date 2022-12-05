package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Numeros numero = new Numeros();
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable
		int num1;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		
		//Para averiguar si el numero es primo o capicuo llamamos a las dos funciones de la clase Numeros y mostramos sus resultados
		System.out.println(numero.esPrimo(num1));
		System.out.println(numero.esCapicuo(num1));
		
	}

}
