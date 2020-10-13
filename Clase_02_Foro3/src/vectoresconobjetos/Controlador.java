package vectoresconobjetos;

import java.util.Scanner;

public class Controlador {

	
	public static void main(String[] args) {
		
		
		/*/miLibreta.agregarAlibreta("Facundo");
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Miguel");
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Gonzalo");
		miLibreta.listarLibreta();/*/
		
		Scanner scanner= new Scanner(System.in);
		Libreta miLibreta = new Libreta(3);
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
			System.out.println("5 - Posiciones Libres");
			System.out.println("6 - Salir");
			
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
			
			if (opt == 5){
				System.out.println("- Posiciones que quedan libres -> " +miLibreta.posicionesLibres());
				System.out.println("");
			}
				
		}while(opt !=6);
			scanner.close();
		
		
	}

}
