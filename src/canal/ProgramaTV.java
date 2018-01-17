package canal;

public class ProgramaTV implements Mostrator {

	private int duracion;
	private String nomProg;
	private String categoria;
	private int audiencia;

	public ProgramaTV() {
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getNomProg() {
		return nomProg;
	}

	public void setNomProg(String nomProg) {
		this.nomProg = nomProg;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAudiencia() {
		return audiencia;
	}

	public void setAudiencia(int audiencia) {
		this.audiencia = audiencia;
	}

	@Override
	public String getInfo() {
		String mostrar = "Nombre programa: " + nomProg + "\nDuracion programa: " + duracion
				+ "\nCategoria del programa: " + categoria;

		return mostrar;
	}

}
