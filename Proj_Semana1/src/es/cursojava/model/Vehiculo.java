package es.cursojava.model;

import es.cursojava.interfaces.Conducible;

/**
 * 
 * @author Cristian Valencia
 *Esta la clase padre vehiculo, de la cual podemos crear las clases hijos coche y camion, con sus respectivos atributos.
 */
public abstract class Vehiculo implements Conducible {
	
	protected String color;
	
	
	public Vehiculo(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
