
public class Premios {
	private String concepto;
	private int cantidadDePremios;
	private int costePuntos;
	
	public Premios(String concepto, int cantidadDePremios, int costePuntos) {
		this.concepto = concepto;
		this.cantidadDePremios = cantidadDePremios;
		this.costePuntos = costePuntos;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getCantidadDePremios() {
		return cantidadDePremios;
	}

	public void setCantidadDePremios(int cantidadDePremios) {
		 this.cantidadDePremios = cantidadDePremios;
	}

	public int getCostePuntos() {
		return costePuntos;
	}

	public void setCostePuntos(int costePuntos) {
		this.costePuntos = costePuntos;
	}
	
	public void restarPremios() {
		this.cantidadDePremios --;
	}
	
}
