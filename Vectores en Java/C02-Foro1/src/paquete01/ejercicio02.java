package paquete01;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dim [] = new int [5];
		
		@SuppressWarnings("resource")
		Scanner Leer = new Scanner(System.in);
		
		//Completar los elementos con valores que ingrese el usuario
		for(int x=0; x<5; x++){
			dim [x]=Leer.nextInt();
		}
			
		
	}

}
