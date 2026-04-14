package Ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		Persona p1 = new Persona("AA202020", "Juan", "Perez",
				LocalDate.of(1992, 5, 10), "M", "Calle 123", "123456789", "juan@mail.com");
		Persona p2 = new Persona("20202020", "Ana", "Gomez",
				LocalDate.of(1995, 8, 20), "F", "Calle 456", "987654321", "ana@mail.com");
				// Caso 1
			    try {
			        Persona.verificarDNI(p1.getDni());
			        System.out.println("Persona 1 agregada correctamente");
			    } catch (ExVerificarDNI e) {
			        System.out.println("Persona 1 no agregada por no verificar el DNI");
			    }
		
			    // Caso 2
			    try {
			        Persona.verificarDNI(p2.getDni());
			        System.out.println("Persona 2 agregada correctamente");
			    } catch (ExVerificarDNI e) {
			        System.out.println("Persona 2 no agregada por no verificar el DNI");
			    }
    }

}


