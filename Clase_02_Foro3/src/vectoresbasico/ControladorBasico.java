package vectoresbasico;

import java.util.Scanner;

public class ControladorBasico {

	
	public static void main(String[] args) {
		Scanner Leer=new Scanner (System.in);
		LibretaBasica miLibreta = new LibretaBasica();
		
		int option;
		do {
			
			System.out.println ("  BIENVENIDO/A..");
			System.out.println ("-_______________________________-");
			System.out.println (" Funciones: ");
			System.out.println ("1 - Agregar Nombre y Posición");
			System.out.println ("2 - Eliminar registro por nombre");
			System.out.println ("3 - Eliminar registro por Posición");
			System.out.println ("4 - Listar Libreta");
			System.out.println ("5 - Salir");
			option = Leer.nextInt();
			
			if(option == 1){
				System.out.println ("Ingrese el nombre que desea agregar: ");
				String nom = Leer.next();
				System.out.println("Ingrese la Posición: ");
				int pos = Leer.nextInt();
				
				miLibreta.agregarAlibreta(nom, pos);
				
			}
			
			if(option == 2){
				System.out.println("Ingrese el nombre que desea eliminar: ");
				String nom = Leer.next();
				
				miLibreta.eliminarPorNombre(nom);
			}
			
			if(option == 3){
				System.out.println("Ingrese la posición que desea eliminar: ");
				int posicion = Leer.nextInt();
				
				miLibreta.eliminarPorPosicion(posicion);
				
			}
			
			if(option == 4){
				miLibreta.listarLibreta();
			}	
			
		}while(option !=5);
			Leer.close();
	
		
		
		
		
	}

}
