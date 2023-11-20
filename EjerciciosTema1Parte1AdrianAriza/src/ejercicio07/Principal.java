package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float preciogasolina=1.789f;  
		float viajeKM=300f;
		float dinerogastado=0;
		float litros=7.50f;
		float litrosgastados=0f;
		float cien=100f;
		litrosgastados=viajeKM*litros/cien;
		dinerogastado=litrosgastados * preciogasolina;
		
		System.out.println("/////////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido vamos a calcular el precio de la gasolina por km que se ha recorrido");
		System.out.println("/////////////////////////////////////////////////////////////////////");
		
		System.out.printf("\nLos litros gastados del viaje son %.2f L",litrosgastados);
		System.out.printf("\nEl costo del viaje  es %.2f euros",dinerogastado);
		
	}

}
