package canal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainCanal {

	public static void main(String[] args) {

		ArrayList<Canal> canales = new ArrayList<Canal>();
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
		int numCanal;
		String privado;
		String nomProg;
		int duracion;
		String categoria;

		Scanner scan = new Scanner(System.in);
		Canal canal = new Canal();
		do {

			System.out.println(CREARC + "- Crear canal de television");
			System.out.println(SELEC + "- Seleccionar canal de television");
			System.out.println(LEERC + "- Mostrar lista de canales de television y su informacion");
			System.out.println(ACTUALIZARC + "- Cambiar si el canal de television es privado o publico");
			System.out.println(BORRARC + "- Borrar un canal de television");
			System.out.println(SALIR + "- Salir del programa");

			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case CREARC:
				// crear el objeto

				/*
				 * al crear el objeto se creara tambien el fichero donde luego
				 * se guardara dicho canal
				 */

				System.out.println("Escribe el nombre del canal de TV que quieres crear");
				nombreCanal = scan.nextLine();
				canal.setNombreCanal(nombreCanal);
				System.out.println("Escribe el numero del canal de TV que quieres crear");
				numCanal = Integer.parseInt(scan.nextLine());
				canal.setNumCanal(numCanal);
				System.out.println("¿El canal es privado o publico? (escribe publico o privado)");
				privado = scan.nextLine();
				if (privado.equalsIgnoreCase("privado")) {
					canal.setPrivado(true);
				} else if (privado.equalsIgnoreCase("publico")) {
					canal.setPrivado(false);
				} else {
					System.out.println("El valor introducido es erroneo");
				}
				canal.setNombreCanal(nombreCanal);
				canal.crearFicheroCanal(nombreCanal);
				canal.crearFichCatalogo(nombreCanal);
				break;
			case SELEC:
				System.out.println("Escribe el nombre del canal de TV que quieres seleccionar");
				nombreCanal = scan.nextLine();
				Iterator<Canal> i = canales.iterator();
				while (i.hasNext()) {
					i.next();
					if (i.equals(nombreCanal)) {
						System.out.println("Has seleccionado el canal " + nombreCanal);
						do {
							System.out.println(CREARP + "- Crear programa de television");
							System.out.println(LEERP + "- Mostrar informacion de programa de television");
							System.out.println(ACTUALIZARP + "- Cambiar duracion de programa de television");
							System.out.println(BORRARP + "- Borrar programa de television");
							System.out.println(SALIR + "- Salir del programa");

							opcion = Integer.parseInt(scan.nextLine());

							switch (opcion) {
							case CREARP:
								System.out.println("Escribe el nombre del programa que quieres crear");
								nomProg = scan.nextLine();
								System.out.println("¿Cuanto dura el programa?");
								duracion = Integer.parseInt(scan.nextLine());
								System.out.println("A que categoria pertenece el programa");
								categoria = scan.nextLine();
								canal.addPrograma(nomProg, duracion, categoria, nombreCanal);
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
				break;
			case LEERC:
				Iterator<Canal> j = canales.iterator();
				while (j.hasNext()){
					System.out.println(j.next());
				}
				break;
			case ACTUALIZARC:

				break;
			case BORRARC:

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
