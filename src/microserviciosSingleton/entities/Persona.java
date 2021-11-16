package microserviciosSingleton.entities;

public class Persona {
	
	
	static Persona persona = null;
	
	
	String nombre;

	
	public static Persona getInstance(String nombre)
	{
		if (persona==null) {
			
			persona = new Persona(nombre);
			
		}
		
		return persona;
	};
	
	private Persona(String nombre){
		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	};
	
	
	
}
