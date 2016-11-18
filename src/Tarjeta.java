
public class Tarjeta {
	private int numero;
	private int puntos;
	
	public Tarjeta(int numero) {
		this.numero=numero;
		this.puntos=0;
	}
	
	public void actualizarPuntos(int puntos) {
		this.puntos = this.puntos + puntos;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public int getNumTarjeta() {
		return numero;
	}
}
