package Target;

public class PersianaModernaAdapter extends Persiana{
	private PersianaModerna persianaModerna;
	
	public PersianaModernaAdapter() {
		super();
		System.out.println("Persiana moderna Adapter");
		this.persianaModerna = new PersianaModerna();
	}

	@Override
	public void subir() {
		System.out.println("\n Activando persiana Adapter");
		this.persianaModerna.conectar();
		this.persianaModerna.activar();
		
	}

	
	@Override
	public void mantener() {
		System.out.println("\n Ajustando persiana Adapter");
		this.persianaModerna.ajustar();
	}
	
	@Override
	public void bajar() {
		System.out.println("\n Bajando persiana Adapter");
		this.persianaModerna.desactivando();
		this.persianaModerna.desconectar();
	}


}
