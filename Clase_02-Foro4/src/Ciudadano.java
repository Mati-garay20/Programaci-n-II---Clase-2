
public class Ciudadano extends Persona {


		//Atributos:
		
		private String provincia;
		private long dni;

		public Ciudadano (String nombre, String apellido, String provincia, long dni) {
			super (nombre, apellido);
			this.provincia = provincia;
			this.dni = dni;
		}
		
		public String toString(){ 
			return super.toString (getNombre(), getApellido())+ "> Provincia: " +provincia+ "> DNI: " +dni;
		}
		
		//Métodos
		
		public String getProvincia () {
			return provincia;
		}
		
		public long getDni () {
			return dni;
		}
		//----------------//
		public void setProvincia (String provincia) {
			this.provincia = provincia;
		} 
		public void setDni(long dni) {
			this.dni = dni;
		}
		
		
		public static void main(String[] args) {
			

			Persona usuario1 = new Persona("Matías", "Garay", "Mendoza", 43417656);
			Persona usuario2 = new Persona("Pedro", "Rosas", "Córdoba", 25613429);
			Persona usuario3 = new Persona("Laila", "Fernandez", "San Luis", 40123987);
			Persona usuario4 = new Persona("María", "López", "Mendoza", 35237890);
			
			//
			
			System.out.println(usuario1);
			System.out.println("____________________");
			System.out.println(usuario2);
			System.out.println("____________________");
			System.out.println(usuario3);
			System.out.println("____________________");
			System.out.println(usuario4);
			System.out.println("____________________");
			
			
		}	
			
		
		
		
	

}
