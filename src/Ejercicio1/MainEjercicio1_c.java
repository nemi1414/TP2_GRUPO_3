package Ejercicio1;
import java.time.LocalDate;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {

		TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();
		
		 Empleado e1 = new Empleado("22334455", "Alejandro", "Madero", LocalDate.of(1994, 5, 5), "Masculino", "Av. Cabildo 15", "11223344", "ale.madero@gmail.com", "desarrollador");		
		 Empleado e2 = new Empleado("12345678", "Judith", "Polgar", LocalDate.of(1976, 7, 23), "Femenino", "Av. del Libertador 1554", "11345465", "judith.polgar@gmail.com", "Supervisora");		
		 Empleado e3 = new Empleado("47888222", "Faustino", "Oro", LocalDate.of(2013, 5, 2), "Masculino", "Av. Cordoba 24", "11446654", "faustiino.oro@gmail.com", "Pasante");
		 Empleado e4 = new Empleado("45654777", "Lionel", "Messi", LocalDate.of(1987, 7, 25), "Masculino", "Av. Barcelona 2465", "11665544", "lionel.messi@gmail.com", "Sysadmin");
		 Empleado e5 = new Empleado("38999888", "Magnus", "Carlsen", LocalDate.of(1990, 2,18), "Masculino", "Av. chess 24", "11567899", "magnus.carlsen@gmail.com", "devops");


		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		
		Iterator it = new Iterator();
		
		
		
		System.out.println(listaEmpleados);
		
	}

}
