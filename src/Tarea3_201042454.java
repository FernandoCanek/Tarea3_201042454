import java.util.Scanner;


public class Tarea3_201042454 {

	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero = 0;
		
		char opcionContinuar = 's';
		
		System.out.println("Bienvenido a una aplicación para determinar si "
				+ "un número es par ó impar...\n ");
		
		
		do{
			System.out.println("Por favor ingrese un número: ");
			
			numero = lector.nextInt();
			
			if(numero % 2 == 0){
				System.out.println("!El número ingresado es PAR! \n");
			}else{
				System.out.println("¡El número ingresado en IMPAR!");
			}
			
			System.out.println("¿Desea Ingresar otro número? s/n");
			
			opcionContinuar = lector.next().charAt(0);
			
		}while(opcionContinuar == 's');
		
		System.out.println("Gracias por utilizar la aplicación,"
				+ " hasta la próxima.");
	}

}
