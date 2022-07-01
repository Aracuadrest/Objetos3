package clases;

public class Pelicula {
	
	private String nombre;
	private String director;
	//private enum genero {ACCION,COMEDIA,DRAMA,SUSPENSO};
	private String genero; //Accion, comedia, drama o suspenso
	private int duracion;
	private int a�o;
	private double calificacion;
	
	
	public Pelicula(String n, String di,String g, int du, int a, double c) {
		super();
		this.nombre = n;
		this.director = di;
		this.genero=g;
		this.duracion = du;
		this.a�o = a;
		this.calificacion = c;
	}


	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDirector() {
		return director;
	}


	private void setDirector(String director) {
		this.director = director;
	}


	public String getGenero() {
		return genero;
	}


	private void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	private void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getA�o() {
		return a�o;
	}


	private void setA�o(int a�o) {
		this.a�o = a�o;
	}


	public double getCalificacion() {
		return calificacion;
	}


	private void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Director: "+director);
		System.out.println("G�nero: "+genero);
		System.out.println("Duraci�n: "+duracion);
		System.out.println("A�o: "+a�o);
		System.out.println("Calificaci�n: "+calificacion);
		
	}
	
	public boolean esPeliculaEpica() {
		if (duracion>=180) {
			return true;
		}
		return false;
	}
	public String calcularValoracion() {
		if(calificacion>=0 && calificacion<=2) {
			return "Muy mala";
		}else if (calificacion>2 && calificacion<=5) {
			return "Mala";
		}else if (calificacion>5 && calificacion<=7) {
			return "Regular";
		}else if (calificacion>7 && calificacion<=8) {
			return "Buena";
		}else if (calificacion>8 && calificacion<=10) {
			return "Excelente";
		}
		return "Error en los datos";
	}	
			
	public boolean esSimilar(Pelicula p) {
		if (this.genero.equals(p.genero) && this.calcularValoracion().equals(p.calcularValoracion())) {
			return true;
		}return false;
	}
			
			
}
