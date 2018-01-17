package canal;

public class Presentador extends Trabajador {

	private int cantidadProgPresenta;
	private String canalAparece;

	public Presentador() {
	}

	public int getProgPresenta() {
		return cantidadProgPresenta;
	}

	public void setProgPresenta(int cantidadProgPresenta) {
		this.cantidadProgPresenta = cantidadProgPresenta;
	}

	public String getCanalAparece() {
		return canalAparece;
	}

	public void setCanalAparece(String canalAparece) {
		this.canalAparece = canalAparece;
	}

}
