package mapa;

import graficos.Pantalla;

public abstract class Mapa {
	private int ancho;
	private int alto;

	private int[] cuadros;

	public Mapa(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;

		cuadros = new int[ancho * alto];
		generarMapa();
	}

	public Mapa(String ruta) {
		cargarMapa(ruta);
	}

	private void generarMapa() {

	}

	public void cargarMapa(String ruta) {
	}

	public void actualizar() {
	}

	public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla) {
	}
}
