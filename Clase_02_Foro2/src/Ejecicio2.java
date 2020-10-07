import java.util.Scanner;


public class Ejecicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] user = new String[4];
		int [] pass = new int[4];
		
		user[0]="Daiana";    
		user[1]="Facundo";   
		user[2]="Osvaldo";   
		user[3]="Melina";    
		
		pass[0]=1234;
		pass[1]=4321;
		pass[2]=1122;
		pass[3]=3344;
		
		Scanner Leer = new Scanner(System.in);
		
		System.out.println("Ingrese usuario");
		String usuario = Leer.next();
		
		System.out.println("Ingrese contraseña");
		int contrasena = Leer.nextInt();
		
		boolean bandera = false;
		
		for(int i=0; i<user.length; i++){
			boolean coincidenciaUser = user[i].equals(usuario);
			boolean coincidenciaPass = (pass[i] == contrasena);
			if (coincidenciaUser && coincidenciaPass){
				bandera = true;
			}
		}
		
		if (bandera){
			System.out.println("Bienvenido!");
			System.out.println("> Ingresó correctamente");
		}else {
				System.out.println("Eror del Usuiario o Contraseña");	
		}
       
		
	}

}
