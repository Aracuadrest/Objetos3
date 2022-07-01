package ppal;

import java.util.Scanner;

import clases.Cuenta;
import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Persona
		
		Persona p1 = new Persona("Ana",32,"50000000a");
		Persona p2 = new Persona();
		
		System.out.println("Introduce los datos:");
		System.out.println("Nombre: ");
		p2.setNombre(teclado.nextLine());
		
		System.out.println("DNI: ");
		p2.setDni(teclado.nextLine());
		
		System.out.println("Edad: ");
		p2.setEdad(teclado.nextInt());
		
		
		
		System.out.println("Los datos son:");
		p1.mostrar();
		
		if (p1.esMayorDeEdad()) {
			System.out.println(p1.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p1.getNombre() + " no es mayor de edad");
		}
		// Cuenta
		
		Cuenta c1 = new Cuenta(p1,123.92f);
		c1.mostrar();
		
		c1.ingresar(1200);
		System.out.println(c1.getSaldo());
		c1.ingresar(-14.16f);
		System.out.println(c1.getSaldo());
		c1.retirar(20);
		System.out.println(c1.getSaldo());
		
		/*//Avi�n
		
		Avi�n a1 = new Avi�n("Airbus",4);
		Avi�n a2 = new Avi�n("Lookheed",4);
		
		System.out.println("Datos del avi�n a1:");
		System.out.println("Fabricante: "+a1.getFabricante());
		System.out.println("N�mero de motores: "+a1.getMotores());
		System.out.println("Datos del avi�n a2:");
		System.out.println("Fabricante: "+a2.getFabricante());
		System.out.println("N�mero de motores: "+a2.getMotores());
		
		a2.setFabricante("Boing");
		a2.mostrar();
		a1.cambiarFabricante(a1);
		
		//Pel�cula
		
		Pelicula peli1 = new Pelicula("Gandhi","Richard Attenborough","DRAMA",191,1982,8.1);
		Pelicula peli2 = new Pelicula("Thor","Kenneth Branagh","ACCION",115,2011,7.0);
		
		peli1.imprimir();
		peli2.imprimir();
		
		System.out.println("La pelicula "+peli1.getNombre()+" es una pelicula epica? "+peli1.esPeliculaEpica());
		
		System.out.println("La pelicula "+peli2.getNombre()+" es una pelicula epica? "+peli2.esPeliculaEpica());
	
		System.out.println("La valoraci�n de la pelicula "+peli1.getNombre()+" es "+peli1.calcularValoracion());

		System.out.println("La valoraci�n de la pelicula "+peli2.getNombre()+" es "+peli2.calcularValoracion());
	
		System.out.println("La pelicula "+peli1.getNombre()+" es similar a la pelicula "+peli2.getNombre()+" ?"+peli1.esSimilar(peli2));
	*/
	}
	

}
