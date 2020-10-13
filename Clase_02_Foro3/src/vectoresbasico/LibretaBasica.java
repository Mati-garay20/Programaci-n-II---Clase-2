package vectoresbasico;

public class LibretaBasica {

	
		String nombres[] = new String[10];
		
		public boolean estaAlmacenado(String nombre) {
			boolean bandera = false;
				for (int i=0; i<nombres.length; i++){
					if(nombre.equals(nombres[i])){
						bandera = true;
					}
				}
				return bandera;
		}
		
		//Metodo agregar a libreta
		public void agregarAlibreta(String nom, int lugar) {
			if (lugar>0 && lugar<11){
				if(!estaAlmacenado(nom)){
					this.nombres[lugar-1] = nom;
				}
			}
			
			if(libretaLlena()) {
				System.out.println (">> La libreta está completa <<");
			}
			
		}
		
		// Metodo listar en libreta
		public void listarLibreta() {

			for(int i=0;i<10;i++) {
				if (nombres[i]!= null){
					
				System.out.println((i+1)+ ") --> "+nombres[i]);
				
				}
			}
		}
		
		//Eliminar por posición
		public void eliminarPorPosicion(int pos){
			this.nombres[pos-1]=null;
		}
		
		// Metodo Eliminar por Nombre
		public void eliminarPorNombre(String nombre){
			for(int i = 0; i<nombres.length; i++){
				if(nombre.equals(nombres[i])){
					this.nombres[i] = null;
				}
			}
		}
		
		//Libreta Completa..
		public boolean libretaLlena() {
			int contador = 0;
			for (int i = 0; i<nombres.length; i++) {
				if (nombres[i] == null) {
					contador = contador + 1;
				}
			}
			
			return (contador == 0);
			
		}
	
		
		

		
}
