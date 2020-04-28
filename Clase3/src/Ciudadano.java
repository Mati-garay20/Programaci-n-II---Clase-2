
public class Ciudadano extends Persona{ //Subclase de Persona
	
	//Atributos:
	
	private String provincia;
	private long dni;

	public Ciudadano (String apellido, String nombre, String provincia, long dni) {
		super (apellido, nombre);
		this.provincia = provincia;
		this.dni = dni;
	}
	
	//Métodos
	
	public void setProvincia (String provincia) {
		this.provincia = provincia;
	}
	public void serDni(long dni) {
		this.dni = dni;
	}
	
	
	
	public String getProvincia () {
		return provincia;
	}
	
	public long getDni () {
		return dni;
	}
	
	
}
