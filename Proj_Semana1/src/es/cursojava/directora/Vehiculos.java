package es.cursojava.directora;


import es.cursojava.model.Camion;
import es.cursojava.model.Coche;

/*
 * Esta es mi clase main en la cual creo las instancias de nuestras clases coche y camion, y probamos sus respectivos metodos.
 */
public class Vehiculos {

	public static void main(String[] args) {
		
	
		Coche coche1 = new Coche("Blanco","Megane","grb3006");
		
		coche1.arrancar();
		
		coche1.avanzar(10);
		
		coche1.retroceder(5);
		
		coche1.parar();
		
		coche1.setColor("Rojo");
		
		System.out.println(coche1.toString());
		
		Camion camion1 = new Camion("Blanco","Megane","grb3006");
		
		camion1.arrancar();
		
		camion1.avanzar(10);
		
		camion1.retroceder(5);
		
		camion1.parar();
		
		camion1.setColor("Rojo");
		
		System.out.println(camion1.toString());
		
		camion1.arrancar();
		
		camion1.avanzar(30);
		
		camion1.retroceder(10);
		
		camion1.parar();
		
		camion1.setColor("Azul");
		
		System.out.println(camion1.toString());
		
		camion1.arrancar();
		
		camion1.avanzar(50);
		
		camion1.retroceder(10);
		
		camion1.parar();
		
		camion1.setColor("Verde");
		
		System.out.println(camion1.toString());
			
		for (float velocidad:camion1.tacometro) {
			System.out.println(velocidad);
			
		}
		
	}

}
