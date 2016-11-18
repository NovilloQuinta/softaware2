
/*Li hu black*/

public class Cliente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private String email;
	private Tarjeta tarjeta;

	public Cliente (String nombre, String apellidos, String direccion, int telefono, String email, int numeroTarjeta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.tarjeta = new Tarjeta(numeroTarjeta);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/*public void darBajaTarjeta(int numero) {
		if(this.tarjeta.getNumTarjeta() == numero) {
			this.tarjeta=null;
		}
	} */
	
	public Tarjeta getTarjeta(){
		return this.tarjeta;
	}
	

}
