package Ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona
{
	private final int legajo; //Ahora es constante
	private String puesto; 
	private static int contadorLegajos = 1000; //hacemos que inicie en 1000
	
	//Constructores	

	public Empleado() {
		super();
		this.legajo = contadorLegajos++; //implementamos el contador de legajos
		this.puesto = "sin puesto";
	}

	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.legajo = contadorLegajos++; // implementamos el contador de legajos
		this.puesto = puesto;
	}
	
	// Metodo estatico
	
	public static int devuelveProximoLegajo() {
		return contadorLegajos;
	}
	
	//Getters y Setters
	
	public int getLegajo() {
		return legajo;
	}
	/*public void setLegajo(int legajo) {  quito este setLegajo ya que ahora es constante
		this.legajo = legajo;
	}*/
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Empleado [Legajo=" + legajo +  ", Puesto=" + puesto +  "]" + ", " + super.toString();
	}
}