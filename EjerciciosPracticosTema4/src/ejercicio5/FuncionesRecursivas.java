package ejercicio5;

public class FuncionesRecursivas {
	
	static int sumatorio(int numsum) {
		
		int sum=0;
		
		if(numsum==0) {
			sum+=0;
		}else {
			sum=numsum+sumatorio(numsum-1);
		}
		
		return sum;
	}
	
	static double potencia(double a, int numpot) {
		
		double pot=0;
		
		if(numpot==0) {
			pot=1;
		}else {
			pot+=a*potencia(a, numpot-1);
		}
		
		return pot;
	}
	
	static int serieFibonacci(int numf) {
		
		int fib=numf;
		
		if(fib==0||fib==1) {
			fib=1;
		}else {
			fib=serieFibonacci(numf-1)+serieFibonacci(numf-2);
		}
		
		return fib;
	}
	
	
}
