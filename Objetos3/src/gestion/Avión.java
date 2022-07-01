package gestion;

public class Avión {

	private String fabricante;
	private int motores;
	
	
	public Avión(String f, int m) {
		super();
		this.fabricante = f;
		this.motores = m;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public int getMotores() {
		return motores;
	}


	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	public String imprimirFabricante() {
		return fabricante;
	}

	
	public void cambiarFabricante(Avión a) {
		this.fabricante="Lookheed";
	}
	public void mostrar() {
		System.out.println("El fabricante es: "+fabricante);
		System.out.println("Número de motores: "+motores);
	}

}
