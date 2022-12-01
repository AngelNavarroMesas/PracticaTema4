package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FuncionesRecursivas fr = new FuncionesRecursivas();
		
		
		int numsum, numpot, numf;
		double a;
		
		System.out.println("introduzca un numero");
		numsum = sc.nextInt();
		
		System.out.println(fr.sumatorio(numsum));
		
		System.out.println();
		
		System.out.println("Introduzca un numero para hacer una potencia");
		numpot = sc.nextInt();
		System.out.println("Introduzca la potencia");
		a = sc.nextDouble();
		
		System.out.println(fr.potencia(a, numpot));
		
		System.out.println();
		
		System.out.println("Introduzca un numero para hacer la serie de Fibonacci");
		numf = sc.nextInt();
		
		System.out.println(fr.serieFibonacci(numf));
		
		
		sc.close();
	}

}
