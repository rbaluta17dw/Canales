package canal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class CanalTV {

	private int numCanal;
	private String nombreCanal;
	private boolean privado;
	private ArrayList<ProgramaTV> listaPrograma;

	public CanalTV() {
	}

	public int getNumCanal() {
		return numCanal;
	}

	public void setNumCanal(int numCanal) {
		this.numCanal = numCanal;
	}

	public String getNombreCanal() {
		return nombreCanal;
	}

	public void setNombreCanal(String nombreCanal) {
		this.nombreCanal = nombreCanal;
	}

	public boolean isPrivado() {
		return privado;
	}

	public void setPrivado(boolean privado) {
		this.privado = privado;
	}

	public ArrayList<ProgramaTV> getListaPrograma() {
		return listaPrograma;
	}

	public void setListaPrograma(ArrayList<ProgramaTV> listaPrograma) {
		this.listaPrograma = listaPrograma;
	}

	public void addPrograma(ProgramaTV programa) {
		listaPrograma.add(programa);
	}
	public void crearFicheroCanal(String nombreCanal){
		File f = new File("D:/Robert_Baluta/2. Evaluacion/archivos/canales/" + nombreCanal + ".txt");
		if(f.exists()){
			System.out.println("El canal " + nombreCanal + " ya existe.");
		}else{
			try {
				FileWriter fileWriter;
				fileWriter = new FileWriter(f);
				PrintWriter printWrite = new PrintWriter(fileWriter);
				printWrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void mostrarInfo(ArrayList<ProgramaTV> listaPrograma) {
		System.out.println("El nombre del canal es: " + nombreCanal);
		if (privado) {
			System.out.println("Este canal es privado");
		} else {
			System.out.println("Este canal es publico");
		}
		Iterator<ProgramaTV> i = listaPrograma.iterator();
		if (i.hasNext()) {
			while (i.hasNext()) {
				String infoPrograma = ((ProgramaTV) i).getInfo();
				System.out.println(infoPrograma);
			}
		} else {
			System.out.println("No hay programas");
		}
	}

	public void addPrograma(String nomProg, int duracion, String categoria) {
		ProgramaTV p = new ProgramaTV();
		p.setCategoria(categoria);
		p.setDuracion(duracion);
		p.setNomProg(nomProg);

		listaPrograma.add(p);
	}
}
