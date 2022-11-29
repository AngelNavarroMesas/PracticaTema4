package ejercicio1;

public class Numeros {
	
	boolean esPrimo(int num1) {
		
		boolean primo = true;
		
		for(int i=2;i<num1;i++) {
			if(num1%i==0) {
				primo=false;
			}
		}
		
		return primo;
		
	}
	
	boolean esCapicuo(int num1) {
		
		boolean capicuo = false;
		int aux=num1, mun=0, dig;
		
		while(aux!=0) {
			
			//Esta operacion saca el ultimo digito del numero auxiliar
			dig=aux%10;
			//Esta operacion le pone la cifra a mun haciendo que se forme el numero al reves
			mun=mun*10+dig;
			//Aqui vamos dividiendo el numero auxiliar entre diez hasta llegar a 0
			aux/=10;
			
		}
		
		if(num1==mun) {
			capicuo=true;
		}
		
		return capicuo;
		
	}
	
	
	
}
