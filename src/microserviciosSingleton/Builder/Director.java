package microserviciosSingleton.Builder;

public class Director {
	
	public void ConstructJuan(Builder builder)
	{
		builder.nombre("Juan");
		builder.edad(18);
		builder.altura(175.2);
	};
	
	public void ConstructPepe(Builder builder)
	{
		builder.nombre("Pepe");
		builder.edad(28);
		builder.altura(165.2);
	};

}
