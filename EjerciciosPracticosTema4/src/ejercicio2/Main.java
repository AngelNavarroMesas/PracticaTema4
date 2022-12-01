package ejercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Esfera esf = new Esfera();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la esfera");
		Esfera.radio = sc.nextInt();
		
		System.out.println("La superfifie de la esfera es: "+esf.superficie());
		System.out.println("El volumen de la esfera es: "+esf.volumen());
		
	}

}
