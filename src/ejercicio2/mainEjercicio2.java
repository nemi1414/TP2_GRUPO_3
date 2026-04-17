package ejercicio2;
import java.util.ArrayList;

public class mainEjercicio2 {

	public static void main(String[] args) {
				
		ArrayList<IEdificio> lista = new ArrayList<IEdificio>(); 
		
	
		// Agregar 3 Polideportivos 
		Polideportivo p1 = new Polideportivo("Poli Norte", 1500.0, 1);
		Polideportivo p2 = new Polideportivo("Poli Sur", 2000.0, 2);
		Polideportivo p3 = new Polideportivo("Poli Centro", 1800.0, 1);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		
		// Agregar 2 Edificios de oficinas:
		EdificioDeOficinas ofi1 = new EdificioDeOficinas(25, 1200.5);
		EdificioDeOficinas ofi2 = new EdificioDeOficinas(50, 3400.0);
		
		lista.add(ofi1);
		lista.add(ofi2);
		
		System.out.println("Carga de datos exitosa. Elementos en la lista: " + lista.size());
		
		
		// Iterador
		
	}

}