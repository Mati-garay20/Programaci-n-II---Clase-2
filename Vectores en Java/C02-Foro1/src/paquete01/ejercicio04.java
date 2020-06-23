package paquete01;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dim [] = new int [5];
		
		@SuppressWarnings("resource")
		Scanner Leer = new Scanner(System.in);
		
		//Modificar para que no almacene multiplos de 7
		for (int x=0; x<5; x++){
			int mul = Leer.nextInt();
			if (mul%7 != 0) {
				dim [x]= mul;
			}	
		}
		
		//Imprimir los valores por pantalla
		for (int v=0; v<5; v++) {
			System.out.println("Lugar "+dim[v]);
		}
		
			
	}

}
