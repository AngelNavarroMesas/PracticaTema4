package ejercicio5;

public class FuncionesRecursivas {
	
	static int sumatorio(int num) {
		
		int sum=0;
		
		if(num==0) {
			sum+=0;
		}else {
			sum=num+sumatorio(num-1);
		}
		
		return sum;
	}
	
	static double potencia(double a, int num) {
		
		double pot=a;
		
		if(num==0) {
			pot+=0;
		}else {
			pot+=a*potencia(a, num-1);
		}
		
		return pot;
	}
	
	static int serieFibonacci(int num) {
		
		
		
		return num;
		
	}
	
	
}
