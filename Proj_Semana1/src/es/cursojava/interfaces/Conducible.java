package es.cursojava.interfaces;
/**
 * 
 * Esta es la interfaz que uso en mis clases , con los metodos firmados.
 * @author Cristian Valencia
 *
 */
public interface Conducible {
	
	public void arrancar();
	
	public void avanzar(int avance);
	
	public void retroceder (int marchaAtras);
	
	public void parar();
	
	public float velocidad();

}
