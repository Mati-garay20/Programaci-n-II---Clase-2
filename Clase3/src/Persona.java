
public class Persona {

	
	//Atributos:
		private String apellido;
		private String nombre;
		
		public Persona (String apellido, String nombre) {
			this.apellido = apellido;
			this.nombre = nombre;
		}

		
		//M�todos:
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public void setNombre (String nombre) {
			this.nombre =nombre;
		}
		
		public String getApellido () {
			return apellido;
		}
		public String getNombre () {
			return nombre;
		}
		
}
