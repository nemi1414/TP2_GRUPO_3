package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEjercicio1_b {

    public static void main(String[] args) {

        // Instanciacion de los 5 objetos Empleado
        Empleado emp1 = new Empleado("35111222", "Lucas", "Berlingeri", LocalDate.of(1994, 5, 14), "Masculino", "Av. Bunge 123, Pinamar", "2254112233", "lucas@email.com", "Desarrollador");
        Empleado emp2 = new Empleado("27444555", "Juan Román", "Riquelme", LocalDate.of(1978, 6, 24), "Masculino", "Brandsen 805, La Boca", "1166778899", "roman@email.com", "Gerente");
        Empleado emp3 = new Empleado("40999888", "Hodor", "Stark", LocalDate.of(2017, 8, 20), "Masculino", "Calle de los Pinos 456", "1199001122", "hodor@email.com", "Seguridad");
        Empleado emp4 = new Empleado("38123456", "Marta", "Gomez", LocalDate.of(1998, 2, 15), "Femenino", "Roma 789", "1122334455", "marta@email.com", "Analista de Datos");
        Empleado emp5 = new Empleado("32987654", "Roberto", "Carlos", LocalDate.of(1985, 11, 3), "Masculino", "Ruta 11 Km 5", "1155443322", "roberto@correo.com", "Operador Logístico");

        // Creacion del ArrayList
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Agregado de los empleados a la lista
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);
        listaEmpleados.add(emp5);

        // Mensaje para verificar la carga exitosa
        System.out.println("Se han agregado exitosamente " + listaEmpleados.size() + " empleados al ArrayList.");
        
    }
}