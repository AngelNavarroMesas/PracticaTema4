package ejercicio3;

public class NumerosAleatorios {
	
	static void numerosAleatorios(int num1) {
		
		double numA=0;
		
		for(int i=0;i<num1;i++) {
			numA=Math.random();
			System.out.println(numA);
		}
	}
	
	static void numerosAleatorios(int num1, int num2) {
		
		int numA=0;
		
		for(int i=0;i<num1;i++) {
			numA=(int) (Math.random()*num2+1);
			System.out.println(numA);
		}
	}
	
	static void numerosAleatorios(int num1, int num2, int num3) {
		
		int numA=0;
		
		for(int i=0;i<num1;i++) {
			do
			numA=(int) (Math.random()*num3+1);
			while(numA<num2);
			System.out.println(numA);
		}
	}
	
	
}
