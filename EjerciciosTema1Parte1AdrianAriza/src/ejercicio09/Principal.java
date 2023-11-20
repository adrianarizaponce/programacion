package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double navasHabit=1500;
		double  campnou=99354;
		double estadiolimpic=65000;
		double colegio=600;
		double habitposiblescn=0;
		double habitposibleseo=0;
		double habitposiblesco=0;
		
		
		
		habitposiblescn=campnou/navasHabit;
		
		habitposibleseo=estadiolimpic/navasHabit;
		habitposiblesco=colegio/navasHabit;
		
		
		System.out.printf("El número de Navas que entrarían en el Camp Nou serían %.0f ", habitposiblescn);
		System.out.printf("\nEl número de Navas que entrarían en el Estadio olimpico serían %.0f ", habitposibleseo);
		System.out.printf("\nEl número de Navas que entrarían en el Colegio  serían %.0f ", habitposiblesco);
	}

}
