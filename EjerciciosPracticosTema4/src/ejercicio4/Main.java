package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operaciones op = new Operaciones();
		
		int opcion;
		
		System.out.println("Elija una de estas opciones");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicacion");
		System.out.println("4 Dividir");
		opcion = sc.nextInt();
		
		System.out.println("Introduzca los numeros para hacer la operacion");
		op.num1 = sc.nextInt();
		op.num2 = sc.nextInt();
		
		
		switch(opcion) {
			case 1:
				op.suma();
			break;
			case 2:
				op.resta();
			break;
			case 3:
				op.multiplicacion();
			break;
			case 4:
				op.division();
			break;
				
		}
		
	}

}
