package microserviciosSingleton.Builder;

public class personaJuanBuilder implements Builder {

	String nombre;
	int Edad;
	Double altura;
	
	
	@Override
	public void nombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public void edad(int edad) {
		// TODO Auto-generated method stub
		this.Edad = edad;
	}

	@Override
	public void altura(Double altura) {
		// TODO Auto-generated method stub
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Persona getResult()
	{
		return new Persona(nombre, Edad, altura);
	}
	
}
