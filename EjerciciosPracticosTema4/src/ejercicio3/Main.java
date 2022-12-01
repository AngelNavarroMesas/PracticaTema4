package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumerosAleatorios NA = new NumerosAleatorios();
		
		int num1, num2, num3;
		
		System.out.println("Introduzca tres numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println(num1+" numeros aleatorios entre 0 y 1");
		NA.numerosAleatorios(num1);
		System.out.println(num1+" numeros comprendidos entre 0 y "+num2);
		NA.numerosAleatorios(num1, num2);
		System.out.println(num1+" numeros comprendidos entre "+num2+" y "+num3);
		NA.numerosAleatorios(num1, num2, num3);
		
		
		
	}

}
