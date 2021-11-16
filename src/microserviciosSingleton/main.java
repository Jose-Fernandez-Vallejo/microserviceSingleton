package microserviciosSingleton;

import microserviciosSingleton.entities.Persona;

public class main {

	public static void main(String[] args) {


		Persona persona = Persona.getInstance("pepe");
		
		System.out.println(persona.getNombre());
		
		Persona persona1 = Persona.getInstance("Juan");
		
		System.out.println(persona1.getNombre());

	}

}
