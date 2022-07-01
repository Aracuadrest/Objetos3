package ppal;

import clases.Cuenta;
import clases.Persona;

public class PruebaClase {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Ana",32,"50000000a");
		
		Cuenta c1 = new Cuenta(p1,123.92f);
		System.out.println("La cuenta 1 es:");
		c1.mostrar();
		
		Persona p2 = new Persona("Juan",28,"30000000p");
		
		Cuenta c2 = new Cuenta(p2);
		System.out.println("La cuenta 2 es:");
		c2.mostrar();
		
		//cambiamos datos de persona se actualiza cuenta porque la cuenta esta referenciada
		p2.setNombre("Alberto");
		c2.mostrar();
		
		c1.ingresar(1200);
		System.out.println(c1.getSaldo());
		c1.ingresar(-14.16f);
		System.out.println(c1.getSaldo());
		c1.retirar(20);
		System.out.println(c1.getSaldo());

	}

}
