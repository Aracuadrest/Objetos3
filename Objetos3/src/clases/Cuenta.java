package clases;

public class Cuenta {
	private Persona titular;
	private float saldo;

	//Constructor: es obligatorio al menos el titular de la cuenta
	public Cuenta(Persona titular) {
		super();
		this.titular = titular;
		this.saldo=0;
	}


	public Cuenta(Persona titular, float saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}


	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void mostrar() {
		System.out.println("_______________");
		System.out.println("El titular");
		titular.mostrar(); //llamamos a mostrar() de Persona
		System.out.println("Saldo: "+saldo);
		System.out.println("_______________");
	}
	
	public float ingresar(float cant) {
		if (cant>=0) {
			this.saldo=saldo+cant;
		}else {
			this.saldo=saldo;
		}
		return saldo;
	}
	public float retirar(float cant) {
		this.saldo=saldo-cant;
		return saldo;
	}
	
	
}