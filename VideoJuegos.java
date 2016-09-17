package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public class VideoJuegos extends ItemAudioVisuales implements Entregable{	
	private int horasEstimadas = 10;
	private String compañia;
	
	public VideoJuegos(String titulo, int horasEstimadas) {
		super(titulo);
		this.horasEstimadas = horasEstimadas;
	}
	public VideoJuegos(String titulo, boolean entregado, Generos tipoGenero, int horasEstimadas, String compañia) {
		super(titulo, entregado, tipoGenero);
		this.horasEstimadas= horasEstimadas;
		this.compañia = compañia;
	}
	public VideoJuegos(String titulo, Generos tipoGenero, int horasEstimadas, String compañia) {
		super(titulo, tipoGenero);
		this.horasEstimadas= horasEstimadas;
		this.compañia = compañia;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////
	
public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public String toString() {
		return "VideoJuegos [horasEstimadas=" + horasEstimadas + ", compañia=" + compañia + ", titulo=" + titulo
				+ ", entregado=" + entregado + ", tipoGenero=" + tipoGenero + "]\n";
	}
	@Override
	public int compareTo(Entregable o) {
			VideoJuegos v1 = (VideoJuegos)o;
			if(this.getHorasEstimadas()<v1.getHorasEstimadas()){
				return -1;
			}else if(this.getHorasEstimadas()>v1.getHorasEstimadas()){
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



	
	
	
	

	
	

