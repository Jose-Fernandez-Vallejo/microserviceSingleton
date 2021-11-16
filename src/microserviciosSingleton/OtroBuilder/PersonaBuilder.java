package microserviciosSingleton.OtroBuilder;

import microserviciosSingleton.Builder.Persona;

public class PersonaBuilder {
	
	Persona persona = new Persona();
	
	public PersonaBuilder()
	{};
	
	public PersonaBuilder nombre(String nombre)
	{
		persona.setNombre(nombre);
		
		return this;
	}
	
	public PersonaBuilder altura(Double altura)
	{
		persona.setAltura(altura);
		
		return this;
	}
	
	public PersonaBuilder edad(int edad)
	{
		persona.setEdad(edad);
		
		return this;
	}
	
	public Persona build()
	{
		return persona;
	}
	
			

}
