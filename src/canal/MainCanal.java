package canal;

public class MainCanal {

	public static void main(String[] args) {
		final int CREARC = 1;
		final int SELEC = 2;
		final int LEERC = 3;
		final int ACTUALIZARC = 4;
		final int BORRARC = 5;
		final int SALIR = 0;
		int opcion;
		
		do {
			System.out.println(CREARC + "- Crear canal de television");
			System.out.println(SELEC + "- Seleccionar canal de television");
			System.out.println(LEERC + "- Mostrar lista de canales de television");
			System.out.println(ACTUALIZARC + "- Cambiar si el canal de television es privado o publico");
			System.out.println(BORRARC + "- Borrar un canal de television");
			System.out.println();
		}while(opcion != SALIR);
	}

}
