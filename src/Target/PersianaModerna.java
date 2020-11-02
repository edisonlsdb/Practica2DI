package Target;

public class PersianaModerna {

	private boolean conectarLuz = false;
	
	public PersianaModerna () {
		System.out.println("Conectandose a la luz...");
		this.conectarLuz = false;
		
	}
	
	public void conectar () {
		System.out.println("Persiana Conectada");
		this.conectarLuz= true;
	}
	
	public void activar() {
		if(!this.conectarLuz) {
			System.out.println("No se ha conectado a la luz");
		}else {
			System.out.println("Persiana Conectada, subiendo...");
		}
		
	}
	
	public void ajustar () {
		if(!this.conectarLuz) {
			System.out.println("No se ha conectado a la luz");
		}else {
			System.out.println("Ajustando la posicion");
		}
	}
	
	public void desactivando() {
		if(!this.conectarLuz) {
			System.out.println("No se ha conectado a la luz");
		}else {
			System.out.println("Persiana Conectada, bajando...");
		}
		
	}
	
	public void desconectar () {
		System.out.println("Persiana desconectada");
		this.conectarLuz= false;
	}
	
	

}
