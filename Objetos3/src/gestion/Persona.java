package gestion;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("DNI: "+dni);
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		}
		return false;
		
	}
}
