package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public interface Entregable extends Comparable<Entregable> {
	public void entregar();
	public void devolver();
	public boolean isEntregado();
			 
}
