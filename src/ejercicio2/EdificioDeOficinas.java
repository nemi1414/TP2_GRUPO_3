package ejercicio2;

public class EdificioDeOficinas implements IEdificio {

	private int numeroDeOficinas; 
	private double superficie;
	
	//constructores 
	public EdificioDeOficinas(int numeroDeOficinas, double superficie) {
		this.numeroDeOficinas = numeroDeOficinas;
		this.superficie = superficie;
	}
	
	//getters / setters
	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}
	

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	@Override
	public String toString() {
		return "EdificioDeOficinas [numeroDeOficinas=" + numeroDeOficinas + ", superficie=" + superficie + "]";
	}	
}
