package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public  class Peliculas extends ItemAudioVisuales implements Entregable{
	private int duracion;
	
	public Peliculas(String titulo, Generos tipoGenero, int duracion) {
		super(titulo,  tipoGenero);
		this.duracion = duracion;
	}
//////////////////////////////////////////////////////////////////

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Peliculas [duracion=" + duracion + ", titulo=" + titulo + ", entregado=" + entregado + ", tipoGenero="
				+ tipoGenero + "]\n";
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
///////////////////////////////////////////////////////////////////////////

	@Override
	public int compareTo(Entregable o) {
			Peliculas v1 = (Peliculas)o;
			if(this.getDuracion()<v1.getDuracion()){
				return -1;
			}else if(this.getDuracion()>v1.getDuracion()){
				return +1;
	}
		return 0;
	
	}

	@Override
	public void entregar() {
		this.entregado= true ; 
	}
	@Override
	public void devolver() {
		this.entregado = false;
		
	}
	@Override
	public boolean isEntregado() {
		return entregado;
	}

}
