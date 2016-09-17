package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public abstract class ItemAudioVisuales implements Comparable<Entregable>{
 protected String  titulo;
 protected boolean entregado = false;
 protected Generos tipoGenero;


public ItemAudioVisuales(String titulo, boolean entregado, Generos tipoGenero) {
	this.titulo = titulo;
	this.entregado = entregado;
	this.tipoGenero = tipoGenero;
}

public ItemAudioVisuales(String titulo) {
	this.titulo = titulo;
}

public ItemAudioVisuales(String titulo, Generos tipoGenero) {
	this.titulo = titulo;
	
	this.tipoGenero = tipoGenero;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public Generos getTipoGenero() {
	return tipoGenero;
}

public void setTipoGenero(Generos tipoGenero) {
	this.tipoGenero = tipoGenero;
}

public boolean getEntregado() {
	return entregado;
}

public void setEntregado(boolean entregado) {
	this.entregado = entregado;
}
 
}
