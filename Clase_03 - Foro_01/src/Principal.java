
public class Principal {

	public static void main(String[] args){
		
		Escuela miEscuela = new Escuela ("José Morón", "Primaria");
		System.out.println (miEscuela);
		
		Grado miGrado = new Grado ("Marcos Rojo", "Primaria", "Septimo", 20);
		System.out.println (miGrado);
		
		//----------------------------
		
		//Casting hacia la clase Escuela
		Escuela otraEscuela = (Escuela) miGrado;
		System.out.println (otraEscuela);
		
		//Casting hacia la clase grado
		Grado otroGrado = (Grado) miEscuela;
		System.out.println (otroGrado);
		
	}
	
	
}
