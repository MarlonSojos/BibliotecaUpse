package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public class Serie extends ItemAudioVisuales implements Entregable {
	
	private int numeroDeTemporadas = 3;
	private String creador;
	
	public Serie(String titulo, boolean entregado, Generos tipoGenero, int numeroDeTemporadas, String creador) {
		super(titulo, entregado, tipoGenero);
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.creador = creador;
	}

	public Serie(String creador, String titulo) {
		super(titulo);
		this.creador=creador;
	}

	public Serie(String titulo, Generos tipoGenero, int numeroDeTemporadas, String creador) {
		super(titulo, tipoGenero);
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.creador = creador;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
//////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Serie [numeroDeTemporadas=" + numeroDeTemporadas + ", creador=" + creador + ", titulo=" + titulo
				+ ", entregado=" + entregado + ", tipoGenero=" + tipoGenero + "]\n";
	}

	@Override
	public int compareTo(Entregable o) {
			Serie v1 = (Serie)o;
			if(this.getNumeroDeTemporadas()<v1.getNumeroDeTemporadas()){
				return -1;
			}else if(this.getNumeroDeTemporadas()>v1.getNumeroDeTemporadas()){
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
