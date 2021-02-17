package vectoresconobjetos;

import java.util.ArrayList;

public class LibretaNueva {


	ArrayList<String>miLibreta;


	public LibretaNueva() {
			
		miLibreta = new ArrayList<>();
		
	}
	
		
	//Se agrega a libreta
	public void agregarAlibreta(String nom) {
		
		if (! miLibreta.contains(nom)) {
			miLibreta.add(nom);
		}	
	}
	
	
		//Mostrar libreta
	public void listarLibreta() {
		System.out.println("_________________");
		System.out.println("");
		
		for(int i=0; i<miLibreta.size(); i++) {
			System.out.println((i+1)+" - "+miLibreta.get(i));
		}
		System.out.println("_________________");
		
	}
		
	//Eliminar por posición
	public void eliminarPosicion (int lugar){
		lugar = lugar-1;
		
		if ((lugar>=0) && (lugar<miLibreta.size() )) {
			miLibreta.remove(lugar);
		}	
	}
	
		
	//Eliminar por nombre
		public void eliminarNombre (String nombre){
			miLibreta.remove (nombre);
		}
		
	
		
	//Finish..	
		
		
	
	
}
