
public class Principal {


	public static void main(String[] args){
		
		boolean E;
		
		Escuela2 miEscuela = new Escuela2 ("José Morón", "Primaria");
		System.out.println (miEscuela);
		
		Grado2 miGrado = new Grado2 ("Marcos Rojo", "Primaria", "Septimo", 20);
		System.out.println (miGrado);
		
		//----------------------------
		
		//Casting hacia la clase Escuela
		Escuela2 otraEscuela = (Escuela2) miGrado;
		System.out.println (otraEscuela);
		
		//----------------------------
		
		Escuela2 escOne = new Escuela2 ("Mestro Paulo Freire", "Secundaria");
		Escuela2 escTwo = new Escuela2 ("Godoy Cruz", "Secundaria");
		
		E = escOne.equals (escTwo);
		System.out.println (E);
		
		
	}
	
	
	
}
