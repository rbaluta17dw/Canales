package canal;

import java.util.Scanner;

public class MainCanal {

	public static void main(String[] args) {
		final int CREARC = 1;
		final int SELEC = 2;
		final int LEERC = 3;
		final int ACTUALIZARC = 4;
		final int BORRARC = 5;
		final int CREARP = 6;
		final int LEERP = 7;
		final int ACTUALIZARP = 8;
		final int BORRARP = 9;
		final int SALIR = 0;
		int opcion;
		
		
		String nombreCanal;
		
		Scanner scan = new Scanner(System.in);
		
		CatalogoTV catag = new CatalogoTV();
		do {

			System.out.println(CREARC + "- Crear canal de television");
			System.out.println(SELEC + "- Seleccionar canal de television");
			System.out.println(LEERC + "- Mostrar lista de canales de television y su informacion");
			System.out.println(ACTUALIZARC + "- Cambiar si el canal de television es privado o publico");
			System.out.println(BORRARC + "- Borrar un canal de television");
			System.out.println(CREARP + "- Crear programa de television");
			System.out.println(LEERP + "- Mostrar informacion de programa de television");
			System.out.println(ACTUALIZARP + "- Cambiar duracion de programa de television");
			System.out.println(BORRARP + "- Borrar programa de television");
			System.out.println(SALIR + "- Salir del programa");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			
			
			switch (opcion) {
			case CREARC:
				System.out.println("Escribe el nombre del canal de TV que quieres crear");
				nombreCanal = scan.nextLine();
				catag.crearFicheroCanal(nombreCanal);
				catag.crearFichCatalogo(nombreCanal);
				break;
			case SELEC:
				System.out.println("Escribe el nombre del canal de TV que quieres seleccionar");
				nombreCanal = scan.nextLine();
				break;
			case ACTUALIZARC:

				break;
			case BORRARC:

				break;
			case CREARP:

				break;
			case LEERP:

				break;
			case ACTUALIZARP:

				break;
			case BORRARP:

				break;
			case SALIR:
				
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != SALIR);
	}

}
