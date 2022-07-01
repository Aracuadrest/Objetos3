package gestion;

public class Cuenta {
	private Persona titular;
	private float cantidad;

	public Cuenta() {

	}
	

	public Cuenta(Persona titular, float cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}


	public Persona getTitular() {
		return titular;
	}

	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	private void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public void mostrar() {
		System.out.println("El titular: "+titular.getDni());
		System.out.println("Cantidad: "+cantidad);
	}
	
	public float ingresar(float cant) {
		if (cant>=0) {
			this.cantidad=cantidad+cant;
		}else {
			this.cantidad=cantidad;
		}
		return cantidad;
	}
	public float retirar(float cant) {
		this.cantidad=cantidad-cant;
		return cantidad;
	}
	
	
}