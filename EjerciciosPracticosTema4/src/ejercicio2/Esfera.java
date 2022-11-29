package ejercicio2;

public class Esfera {
	
	static double radio;
	
	static double Superficie() {
		
		double superficie;
		
		superficie = (4*Math.PI)*(radio*radio);
		
		return superficie;
	}
	
	static double Volumen() {
		
		double volumen;
		
		volumen = (4*Math.PI)*Math.pow(radio, 3)/3;
		
		return volumen;
	}
	
}
