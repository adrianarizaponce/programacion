package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		double radiocircunf=3.00; 
	   
		double longitudcircunf=0; 
		double constante=2.00;
		
		
		double radiocirculo=5.20;
		double exp2=2;
		double areacirculo=0;
		
		
		
		longitudcircunf=constante * Math.PI * radiocircunf;
		areacirculo=Math.PI * Math.pow(radiocirculo, exp2);
		
		System.out.printf("\n Para calcular la longitud de una circunferencia es l=2*pi*r= %.2f metros",longitudcircunf);
	
		System.out.printf("\n Para calcular el área de un círculo es a=pi*r2= %.2f metros",areacirculo);
		
		
	
	}

}
