package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double cocacola=1.20, numcocas=4, preciococas=0, pipas=0.40, numpipas=1, preciopipas=0, espada=150.00, numespada=1, precioespada=0;
		double	preciototal=0;
		//inicio otra variable para calcular la vuelta en caso de que paga con 200 euros
		
		double dinerodepago=200.00, devolución=0;
		String empleado="John Snow";
		
		preciococas=numcocas * cocacola;
		preciopipas=pipas* numpipas;
		precioespada=espada* numespada;
		preciototal=(numcocas * cocacola)+(numpipas*pipas) + (numespada* espada);
		devolución=dinerodepago-preciototal;
		
		System.out.println("Bienvenido vamos a presentar su ticket de compra");
		System.out.printf("\n Le atiende %s",empleado);
		System.out.printf("\n %.0f cocacolas/ preciounitad:%.2f/ precio total: %.2f€",numcocas,cocacola,preciococas );
		System.out.printf("\n %.0f bolsa de pipas / preciounitad:%.2f/ precio total: %.2f€",numpipas,pipas,preciopipas);
		System.out.printf("\n %.0f espada garra / preciounitad:%.2f/ precio total: %.2f€",numespada,espada,precioespada);
		System.out.printf("\n                                              Precio total= %.2f €",preciototal);
		System.out.printf("\n                                              A cobrar %.2f €",dinerodepago);
		System.out.printf("\n                                              Devolución= %.2f €",devolución);
	}

}
