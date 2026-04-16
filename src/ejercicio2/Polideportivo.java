package ejercicio2;

public class Polideportivo implements IInstalacionDeportiva, IEdificio {

	// Atributos
	
	private String nombre;
	private double superficie;
	private int tipoDeInstalacion; 

	// Constructor
	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	// Metodos de interfaces
	
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie; 
	}

	//  Getters & Setters 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	// Metodo toString
	
	@Override
	public String toString() {
		return "Polideportivo [Nombre=" + nombre + ", Superficie=" + superficie 
				+ " m2, Tipo de Instalacion=" + tipoDeInstalacion + "]";
	}
}