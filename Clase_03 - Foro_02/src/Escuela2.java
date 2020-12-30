
public class Escuela2 {

	private String nombre;
	private String nivel;
	
	
	public Escuela2(String nombre, String nivel){
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getNivel(){
		return this.nivel;
	} 
	
	public String toString(){
		return ">Nombre: "+nombre+"    >Nivel: "+nivel;
	}
	
	public boolean equals(Object o){
		Escuela2 esc = (Escuela2) o;
		return (esc.nombre == nombre) && (esc.nivel == nivel);
	}
	
	
	
}
