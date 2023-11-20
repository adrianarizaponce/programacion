package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num1=3;
			int num2=5;
			int num3=9;
			int num4= 1;
			int resultado=0;
			int resultado2=0;
			int resultado3=0;
			
			System.out.println("num1=3");
			System.out.println("num2=5");
			System.out.println("num3=9");
			System.out.println("num4=1");
			System.out.println("resultado=0");
			System.out.println("resultado2=0");
			System.out.println("resultado3=0");
			
			resultado= num1 + num2;
			resultado2= resultado + num3;
			resultado3= resultado2 - num4;
			
			System.out.println("3+5="+ resultado);
			System.out.println("8+9="+ resultado2);
			System.out.println("17-1="+ resultado3);
			
	}

}
