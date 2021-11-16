package microserviciosSingleton;

import microserviciosSingleton.Builder.Director;
import microserviciosSingleton.Builder.PersonaPepeBuilder;
import microserviciosSingleton.Builder.personaJuanBuilder;
import microserviciosSingleton.OtroBuilder.PersonaBuilder;
import microserviciosSingleton.entities.Persona;

public class main {

	public static void main(String[] args) {


		Persona persona = Persona.getInstance("pepe");
		
		System.out.println(persona.getNombre());
		
		Persona persona1 = Persona.getInstance("Juan");
		
		System.out.println(persona1.getNombre());
		
		
		
		PersonaBuilder personaBuilder = new PersonaBuilder();
		
		microserviciosSingleton.Builder.Persona persona2 = personaBuilder.nombre("Jose").altura(180.2).edad(24).build();
		
		System.out.println(persona2.getNombre() + persona2.getEdad());
		
		
		//esto es un builder con la interface
		
		
		Director director = new Director();
		
		personaJuanBuilder juanBuilder = new personaJuanBuilder();
		
		director.ConstructJuan(juanBuilder);
		
		microserviciosSingleton.Builder.Persona personaJuan = juanBuilder.getResult();
		
		System.out.println(personaJuan.getNombre());
		
		PersonaPepeBuilder pepeBuilder = new PersonaPepeBuilder();
		
		director.ConstructPepe(pepeBuilder);
		
		microserviciosSingleton.Builder.Persona personaPepe = pepeBuilder.getResult();
		
		System.out.println(personaPepe.getNombre() + personaPepe.getEdad());
		

		
		

	}

}
