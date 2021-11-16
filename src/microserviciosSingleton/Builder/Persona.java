package microserviciosSingleton.Builder;

public class Persona {

	 String nombre;
	 int edad;
	 Double altura;
	
	public Persona(String nombre, int edad,Double altura )
	{
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		
	}
	
	public Persona( )
	{

		
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Double getAltura() {
		return altura;
	}
	
	
	
}
