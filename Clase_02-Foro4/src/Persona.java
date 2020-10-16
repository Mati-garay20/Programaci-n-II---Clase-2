
public class Persona {

	
		//Atributos:
		private String nombre;	
		private String apellido;
		
		public Persona (String nom, String ape){
			this.nombre = nom;
			this.apellido = ape;
			
		}
		
		
		//Métodos:
		
		public String getNombre () {
			return nombre;
		}
		public String getApellido () {
			return apellido;
		}
		//---------------//	
		public void setNombre (String nombre) {
			this.nombre =nombre;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		
		
		public String toString(){
			return "Nombre: "+this.nombre+"Apellido: "+this.apellido;
		}


		public String toString(String nombre2, String apellido2) {
			
			return null;
		}
		
		public Persona(String string, String string2, String string3, int i) {
		
		}
		
		

}
