import java.util.LinkedList;
import java.util.Scanner;

public class IS2app {
	static private int tarjeta=1000;
	static private LinkedList<Cliente> tarjetas;
	static private LinkedList<Premios> premios;
	static private LinkedList<Tienda> tiendas;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String resp; //= scan.nextLine();
		int respInt; //= scan.nextInt();
		tarjetas = new LinkedList<Cliente>();
		premios = new LinkedList<Premios>();
		tiendas = new LinkedList<Tienda>();

		while(true) {
			System.out.println("Elige opción: ");
			System.out.println("1: Cliente");
			System.out.println("2: Empresa");
			respInt = scan.nextInt();
			if(respInt == 1) {
				System.out.println("Elige opción: ");
				System.out.println("1: Pedir tarjeta");
				System.out.println("2: Consultar puntos");
				System.out.println("3: Canjear premio");
				respInt = scan.nextInt();
				resp = scan.nextLine();
				switch (respInt) {
				case 1:
					String nombre;
					String apellidos;
					String direccion;
					int telefono;
					String email;
					System.out.println("Nombre: ");
					nombre=scan.nextLine();
					System.out.println("Apellidos: ");
					apellidos=scan.nextLine();
					System.out.println("Direccion: ");
					direccion=scan.nextLine();
					System.out.println("Telefono: ");
					telefono=scan.nextInt();
					scan.nextLine();
					System.out.println("Email: ");
					email=scan.nextLine();
					Cliente cliente = new Cliente(nombre, apellidos, direccion, telefono, email, tarjeta);
					tarjeta++;
					tarjetas.add(cliente);
					System.out.println("Se ha asignado la tarjeta con número " + cliente.getTarjeta().getNumTarjeta() +
							" al cliente " + cliente.getNombre() + " " + cliente.getApellidos());
					break;
				case 2:
					System.out.println("Introduce numero de tarjeta: ");
					respInt=scan.nextInt();
					scan.nextLine();
					for(int i = 0; i<tarjetas.size(); i++) {
						//System.out.println("Comparo esto -> "+tarjetas.get(i).getTarjeta().getPuntos() +" con esto -> " + respInt);
						if(tarjetas.get(i).getTarjeta().getNumTarjeta() == respInt) {
							System.out.println("El usuario " + tarjetas.get(i).getNombre() + " " +tarjetas.get(i).getApellidos() +" tiene "
									+ tarjetas.get(i).getTarjeta().getPuntos() + " puntos");
						}
						else {
							System.out.println("No existe tarjeta con número " + respInt);
						}
					}
					break;
				case 3:
					System.out.println("Canjeado de premios");
					for(int i = 0; i<premios.size(); i++) {
						System.out.println("-------------------------------------");
						System.out.println("Concepto: " + premios.get(i).getConcepto());
						System.out.println("Coste de puntos: " + premios.get(i).getCostePuntos());
						System.out.println("Cantida disponible: " + premios.get(i).getCantidadDePremios());
						System.out.println("-------------------------------------");
					}

					System.out.println("Concepto elegido");
					resp = scan.nextLine();
					for(int i = 0; i<premios.size(); i++) {
						if(resp.equals(premios.get(i).getConcepto())) {
							System.out.println("Introduce tarjeta");
							respInt = scan.nextInt();
							scan.nextLine();
							for(int j = 0; j<tarjetas.size(); j++) {
								if(tarjetas.get(j).getTarjeta().getNumTarjeta() == respInt) {
									if(tarjetas.get(j).getTarjeta().getPuntos()>=premios.get(i).getCostePuntos()) {
										System.out.println("Se han canjeado los puntos por el premio seleccionado");
										tarjetas.get(j).getTarjeta().actualizarPuntos(-premios.get(j).getCostePuntos());
										premios.get(j).restarPremios();
									} else 
										System.out.println("No tienes puntos suficientes");
								}
								else {
									System.out.println("No existe tarjeta con número " + respInt);
								}
							}

						}
					}
				}

			} else {
				System.out.println("Elige opción: ");
				System.out.println("1: Añadir tienda");
				System.out.println("2: Añadir premio");
				respInt = scan.nextInt();
				resp = scan.nextLine();
				switch(respInt) {
				case 1:
					System.out.println("Introduce nombre de la tienda");
					String nombreTienda = scan.nextLine();
					Tienda tienda = new Tienda (nombreTienda);
					tiendas.add(tienda);
					break;
				case 2:
					System.out.println("Introduce concepto del premio");
					String concepto = scan.nextLine();
					System.out.println("Introduce coste en puntos del premio");
					int puntosPremio = scan.nextInt();
					scan.nextLine();
					System.out.println("Introduce unidades del premio");
					int cantidadPremio = scan.nextInt();
					scan.nextLine();
					Premios premio = new Premios (concepto, puntosPremio, cantidadPremio);
					premios.add(premio);
					break;

				}

			}


		}
	}
}
