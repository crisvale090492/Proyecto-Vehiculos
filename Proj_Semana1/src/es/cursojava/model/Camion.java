package es.cursojava.model;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.interfaces.Conducible;

/**
 * 
 * @author Cristian Valencia
 *Esta es la clase camion que hereda de la super clase vehiculo y implementa la interfaz Conducible, que ademas cuenta con un atributo tacometro en el cual guardamos las velocidades de un recorrido.
 */
public class Camion extends Vehiculo implements Conducible {

	private String nombre;
		
	public List<Float> tacometro = new ArrayList();
	
	private final String MATRICULA;
	
	private final int NUMERO_DE_RUEDAS = 4;
		
	private static float contadorCalculoVelocidadEspacio;
	
	private static float contadorCalculoVelocidadTiempo;
	
	public Camion(String color, String nombre, String matricula) {
		super(color);
		this.nombre = nombre;
		this.MATRICULA = matricula;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMATRICULA() {
		return MATRICULA;
	}
	

	public int getNUMERO_DE_RUEDAS() {
		return NUMERO_DE_RUEDAS;
	}
	
	/**
	 * Este es el metodo arrancar, el cual nos indica el momento en el que comienza nuestra variable de tiempo, la cual aumentamos en uno cada vez que avanzamos, retrosedemos y al arrancar, para despues poder calcular la velocidad, ademas en el llamamos al metodo velocidad y añadimos el float que nos devuelve que seria la velocidad, dentro del atributo arraylist tacometro. 
	 */
	@Override
	public void arrancar() {
		System.out.println("Tiempo inicial de viaje "+ contadorCalculoVelocidadTiempo);
		contadorCalculoVelocidadTiempo++;
	}
	
	/**
	 * Este es el metodo avanzar en el cual aumentamos nuestra variable contadorCalculoVelocidadTiempo, con el valor del parametro que nos entra , para despues poder calcular la velocidad, ademas en el llamamos al metodo velocidad y añadimos el float que nos devuelve que seria la velocidad, dentro del atributo arraylist tacometro. 
	 */
	@Override
	public void avanzar(int avance) {
		contadorCalculoVelocidadTiempo++;
		System.out.println("Avanzo "+ avance + " metros, tiempo actual de viaje "+ contadorCalculoVelocidadTiempo);
		contadorCalculoVelocidadEspacio += avance;
		tacometro.add(velocidad());
	}

	/*
	 * este es el metodo retroceder en el cual seguimos aumentando las variables de tiempo y espacio, para poder calcular la velocidad, ademas en el llamamos al metodo velocidad y añadimos el float que nos devuelve que seria la velocidad, dentro del atributo arraylist tacometro. 
	 */
	 
	@Override
	public void retroceder(int marchaAtras) {
		contadorCalculoVelocidadTiempo++;
		System.out.println("Retrocedio "+ marchaAtras + " metros, tiempo actual de viaje "+ contadorCalculoVelocidadTiempo);
		contadorCalculoVelocidadEspacio += marchaAtras;
		tacometro.add(velocidad());
	}
	
	/*
	 * Este es el metodo en el que inidicamos por medio de nuestra variable de tiempo , lo que tardamos en un viaje.
	 */
	@Override
	public void parar() {
		System.out.println("Tiempo final de vaije " + contadorCalculoVelocidadTiempo);
		contadorCalculoVelocidadTiempo = 0;
		contadorCalculoVelocidadEspacio = 0;
	}

	/*
	 * Este es el metodo velocidad en el cual damos valor a la variable velocidad , con la division de nuestra variable espacio y de nuestra variable tiempo, lo devolvemos por medio de un float.
	 */
	@Override
	public float velocidad() {
		float velocidad = contadorCalculoVelocidadEspacio/contadorCalculoVelocidadTiempo;
		return velocidad;
	}
	
	@Override
	public String toString() {
		return "Camion [nombre=" + nombre + ", MATRICULA=" + MATRICULA + ", color=" + color + ", NUMERO_DE_RUEDAS=" + NUMERO_DE_RUEDAS +"]";
	}
	

}
