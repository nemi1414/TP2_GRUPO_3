package Ejercicio1;
import java.time.LocalDate;


public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	
	//Constructores
	
	public Persona() {
		this.nombre = "sin nombre";
		this.fechaNacimiento = LocalDate.of(2025, 1, 1);
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento,String genero, String direccion, String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	
	// Getters and Setters
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//3. Método toString 
	
	@Override
	public String toString() {
	    return "Persona [DNI=" + dni + ", Nombre=" + nombre + ", Apellido=" + apellido + 
	           ", Fecha Nacimiento=" + fechaNacimiento + ", Genero=" + genero + 
	           ", Direccion=" + direccion + ", Telefono=" + telefono + ", Email=" + email + "]";
	}
	
	public static void verificarDNI(String dni) throws ExVerificarDNI {

	    // Verifica que sean 8 digitos
	    if (!dni.matches("\\d{8}")) {
	        throw new ExVerificarDNI("El DNI debe tener exactamente 8 dígitos");
	    }

	}

}