package ejercicio1;

public class Numeros {
	
	//Esta funcion se encarga de averiguar si el numero introducido es primo
	boolean esPrimo(int num1) {
		//Declaramos la variable que vamos a usar en la funcion
		boolean primo = true;
		
		//Este bucle no parara hasta que el valor de i sea igual que el del numero introducido
		//i es igual a 2 asi podremos usarla para averiguar si el numero es primo
		for(int i=2;i<num1;i++) {
			//Si el valor de i es un divisor del numero introducido significa que el numero introducido no es primo pues un numero primo solo puede ser dividido entre 1 o el mismo
			if(num1%i==0) {
				primo=false;
			}
		}
		
		//Devolvemos el resultado
		return primo;
		
	}
	
	//Esta funcion se encarga de averiguar si el numero es capicuo
	boolean esCapicuo(int num1) {
		
		//Declaramos las variables que vamos a usar en la funcion
		boolean capicuo = false;
		int aux=num1, mun=0, dig;
		
		//No se acabara este bucle hasta que el numero auxiliar sea igual a 0
		while(aux!=0) {
			
			//Esta operacion saca el ultimo digito del numero auxiliar
			dig=aux%10;
			//Esta operacion le pone la cifra a mun haciendo que se forme el numero al reves
			mun=mun*10+dig;
			//Aqui vamos dividiendo el numero auxiliar entre diez hasta llegar a 0
			aux/=10;
			
		}
		
		//Si el numero invertido es igual que el original el numero es capicuo
		if(num1==mun) {
			capicuo=true;
		}
		
		//Devolvemos el resultado
		return capicuo;
		
	}
	
	
	
}
