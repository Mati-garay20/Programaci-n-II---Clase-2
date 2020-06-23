package paquete01;

import java.util.Scanner;

public class ejercicio05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dim [] = new int [5];
		
		@SuppressWarnings("resource")
		Scanner Leer = new Scanner(System.in);
		
		//No almacenar los multiplos de 7
		for (int x=0; x<5; x++){
			int mul = Leer.nextInt();
			if (mul%7 != 0) {
				dim [x]= mul;
			}	
		}
		
		//Modificar para que imprima los valores ordenados de menor a mayor
			for (int x=0; x<5-1; x++) {
				if ( dim[x]>dim[x+1]) { 
					
					int mul;
					mul=dim[x];
					dim[x]=dim[x+1];
					dim[x+1]=mul;
				}
			}
		
		//Imprime por pantalla
		for (int v=0; v<5; v++) {
			System.out.println("Lugar "+dim[v]);
		}
		
		
		
	}
	
}
