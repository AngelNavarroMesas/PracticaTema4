package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Numeros numero = new Numeros();
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		
		System.out.println(numero.esPrimo(num1));
		System.out.println(numero.esCapicuo(num1));
		
	}

}
