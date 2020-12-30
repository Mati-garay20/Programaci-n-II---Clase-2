
public class Grado2 extends Escuela2{

	private String nom;
	private int cantAlum;
	
	public Grado2 (String nombre, String nivel, String nom, int cantAlum){
		super(nombre, nivel);
		
		this.nom = nom;
		this.cantAlum = cantAlum;
	}
	
	public String getNom(){
		return this.nom;
	}
	public int getCantAlum(){
		return this.cantAlum;
	} 
	
	public String toString(){
		return ">Nombre: "+super.getNombre()+"   >Nivel: "+super.getNivel()+"   >A�o: "+this.nom+"   >Cantidad de alumnos: "+this.cantAlum;
	}

}
