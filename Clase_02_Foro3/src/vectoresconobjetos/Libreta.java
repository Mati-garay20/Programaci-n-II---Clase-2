package vectoresconobjetos;

public class Libreta {

		int cantidadRegistros;
		String nombres[];
	
	

	public Libreta(int cantidadRegistros) {
			
			this.cantidadRegistros = cantidadRegistros;
			nombres = new String[cantidadRegistros];
	}
	
		//Metodo queda lugar
	public boolean quedaLugar(){
			
			boolean respuesta = false;
			
			for (int i=0; i<this.cantidadRegistros; i++){
				if(this.nombres[i] == null){
					respuesta = true;
				}
			}
			return respuesta;
			
	}
		
	//Se agrega a libreta
	public boolean agregarAlibreta(String nom) {
		
		boolean lugar = this.quedaLugar();
		
		if(lugar) {   //Una forma de recorrer el vector para encontrar el primer null
			int i = -1; //Inicializamos un contador
			do{
				i++;
			}while(nombres[i] != null); //recoremos el vector (nombres) en busca del primer (null)
			this.nombres[i] = nom;
		}
		
		if(libretaCompleta()) {
			System.out.println (">> La libreta está completa <<");
			System.out.println("");
		}
		return lugar;
		
		
	}
	
		//Mostrar libreta
	public void listarLibreta() {
		System.out.println("_________________");
		System.out.println("");
		for(int i=0; i<cantidadRegistros; i++) {
			System.out.println("--" +nombres[i]);
		}
		System.out.println("_________________");
		
	}
		
	//Eliminar por posición
	public void eliminarPosicion (int lugar){
		if (lugar>0 && lugar<cantidadRegistros){
			nombres[lugar] = null;
		}
	}
	
	//Eliminar por nombre
		public void eliminarNombre (String nombre){
			for(int i=0; i<cantidadRegistros; i++){
				if (nombre.equals (nombres[i])){
					nombres[i]=null;
				}
			}
		}
		
	//Mostrar posiciones libres	
		public int posicionesLibres(){
			int poslibre = 0;
			for (int i = 0; i<nombres.length; i++){
				if(nombres[i] == null && nombres[i] == " - "){
					poslibre ++;
				}
			}
			return (poslibre);
		}

		
	//Libreta Completa	
		
		public boolean libretaCompleta(){
			int contador = 0;
			for ( int i = 0; i<nombres.length; i++){
				if(nombres[i] == null){
					contador = contador + 1;
				}
			} return (contador == 0);
		}
		
		
		
		
	//Finish..	
		
		
}
