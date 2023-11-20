package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioviaje=0.82, numviaje=1, salto=0.35, numsalto=1, preciosalto=0, personas=2, preciototal=0;
		String empresa="Metro de Sevilla";
		
		preciosalto=salto*numsalto*personas;
		preciototal=(precioviaje + preciosalto)* personas;
		
		System.out.printf("\n Bienvenido a su ticket %s",empresa);
		System.out.printf("\n Cantidad viaje: %.0f",numviaje);
		System.out.printf("\n Cantidad personas: %.0f",personas);
		System.out.printf("\n Precio 1viaje: %.2f € / Precio salto %.2f €/",precioviaje,salto);
		System.out.printf("\n Preciototal %.2f €", preciototal);
	}
	}
		