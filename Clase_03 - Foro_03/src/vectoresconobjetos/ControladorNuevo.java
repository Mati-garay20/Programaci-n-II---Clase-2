package vectoresconobjetos;

import java.util.Scanner;

public class ControladorNuevo {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		LibretaNueva miLibreta = new LibretaNueva();
		int opt;
		
		do{
			System.out.println("  BIENVENIDO/A");
			System.out.println("---------------");
			System.out.println("LIBRETA");
			System.out.println("");
			System.out.println("1 - Agregar contacto");
			System.out.println("2 - Listar Libreta");
			System.out.println("3 - Eliminar por Posición");
			System.out.println("4 - Eliminar por Nombre");
			System.out.println("5 - Salir");
			
			opt= scanner.nextInt();
			
			if (opt == 1){
				System.out.println("- Ingrese el contacto");
				String nombre = scanner.next();
				miLibreta.agregarAlibreta(nombre);
			}
			
			if (opt == 2){
				miLibreta.listarLibreta();
			}
			
			if (opt == 3){
				System.out.println("- Ingrese la Posición que quiere eliminar");
				int pos = scanner.nextInt();
				miLibreta.eliminarPosicion(pos-1);
			}
			
			if (opt == 4){
				System.out.println("- Ingrese el Nombre que quiere eliminar");
				String nom = scanner.next();
				miLibreta.eliminarNombre(nom);
			}
			
				
		}while(opt !=5);
			scanner.close();
		
		
	}

}

	
	
	
	

