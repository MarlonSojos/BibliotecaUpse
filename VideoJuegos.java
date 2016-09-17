package upse.poo.proyecto;
/**
 * 
 * @author Blas Benites y Marlon Sojos 
 *
 */
public class VideoJuegos extends ItemAudioVisuales implements Entregable{	
	private int horasEstimadas = 10;
	private String compa�ia;
	
	public VideoJuegos(String titulo, int horasEstimadas) {
		super(titulo);
		this.horasEstimadas = horasEstimadas;
	}
	public VideoJuegos(String titulo, boolean entregado, Generos tipoGenero, int horasEstimadas, String compa�ia) {
		super(titulo, entregado, tipoGenero);
		this.horasEstimadas= horasEstimadas;
		this.compa�ia = compa�ia;
	}
	public VideoJuegos(String titulo, Generos tipoGenero, int horasEstimadas, String compa�ia) {
		super(titulo, tipoGenero);
		this.horasEstimadas= horasEstimadas;
		this.compa�ia = compa�ia;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////
	
public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	@Override
	public String toString() {
		return "VideoJuegos [horasEstimadas=" + horasEstimadas + ", compa�ia=" + compa�ia + ", titulo=" + titulo
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



	
	
	
	

	
	

