package App;



import java.util.Scanner;

import Target.Persiana;
import Target.PersianaComun;
import Target.PersianaModerna;
import Target.PersianaModernaAdapter;

public class Aplicacion {
	
	private static Persiana persiana;
	private static Scanner S = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		  System.out.println("");
		  
	        int opcion;
	        
	        do{
	        	
	            opcion = preguntaOpcion();
	            switch(opcion) {
	                case 1:
	                    persiana = new PersianaComun();
	                    usarPersiana();
	                    break;
	                
	                case 2:
	                	 persiana  = new PersianaModernaAdapter();
	                	 usarPersiana();
	                    break;
	                case 3:
	                    System.out.println("¡Cerrando programa!");
	                    break;
	                default:
	                    System.out.println("La opción no es valida.");
	            }
	            System.out.print("\n\n");
	        }while(opcion!=3);
	    }

	    private static int preguntaOpcion() {
	        System.out.print(
	        		
	                "OPCIONES\n"
	               +"---- -- --------\n"
	               +"1. Encender Persiana común.\n"
	               +"2. Encender Persiana Moderna.\n"
	               +"3. Salir.\n"
	               +"Seleccione opción: "
	        );
	        return Integer.parseInt( S.nextLine() );
	    }

	    private static void usarPersiana() {
	    	persiana.subir();
	    	
	        persiana.mantener();
	        	
	        persiana.bajar();
	        }

}
