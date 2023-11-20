package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 
		// identificar olimpica
		
		double largo=50.00;
		double ancho=21.00;
		double profund1=2.50;
		double volumen1=0;
		
		
	// identificar redonda
	double radio=12.00;
	double profund2=1.80;
	double volumen2=0;
	double exp=2;
	
								
	//identificar precio
	
	double preciom3=1.80;
	double preolimp=0;
	double preredonda=0;

		volumen1= largo * ancho * profund1;
		
						
							volumen2= Math.PI * Math.pow(radio, exp) * profund2;
							
							
														preolimp= preciom3 * volumen1;
														preredonda=preciom3 * volumen2;
														
		System.out.println("para calcular el volumen de la piscina olimpica se multiplica, largo por ancho por profundidad");
		System.out.println("V=L*A*prof=" + volumen1 + "metros cubicos");
		
							
							System.out.println("Para calcular volumen piscina redonda es pi por radio al cuadrado por profundidad");
							System.out.printf("V=pi*r2*prof= %.2f  metros cubicos", volumen2);
							
		
														System.out.println("\n precio piscina olimpica=preciom3*volumen= " + preolimp + "€");
														System.out.printf(" precio de la piscina redonda= preciom3*volumen= %.2f €", preredonda  );
		
														
	}

}
