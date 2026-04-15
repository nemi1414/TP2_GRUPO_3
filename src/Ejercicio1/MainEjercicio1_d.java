package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

    public static void main(String[] args) {

        // Instanciamos  5 Personas (Con un DNI duplicado intencionalmente)
    	
        Persona p1 = new Persona("11111111", "Carlos", "Tevez", LocalDate.of(1984, 2, 5), "Masculino", "Fuerte Apache 123", "1122334455", "carlos@mail.com");
        Persona p2 = new Persona("22222222", "Lionel", "Messi", LocalDate.of(1987, 6, 24), "Masculino", "Rosario 456", "1199887766", "lio@mail.com");
        Persona p3 = new Persona("33333333", "Emanuel", "Ginobili", LocalDate.of(1977, 7, 28), "Masculino", "Bahia Blanca 789", "1144556677", "manu@mail.com");
        Persona p4 = new Persona("44444444", "Gabriela", "Sabatini", LocalDate.of(1970, 5, 16), "Femenino", "CABA 321", "1155667788", "gaby@mail.com");
        Persona p5 = new Persona("11111111", "Clon", "De Tevez", LocalDate.of(2000, 1, 1), "Masculino", "Falsa 123", "00000000", "clon@mail.com");

        
        HashSet<Persona> setPersonas = new HashSet<>();

        setPersonas.add(p1);
        setPersonas.add(p2);
        setPersonas.add(p3);
        setPersonas.add(p4);
        setPersonas.add(p5); // Duplicada

        // Recorrido con Iterator para verificar
        
        System.out.println("--- LISTA DE PERSONAS EN EL HASHSET ---");
        System.out.println("Cantidad de registros guardados: " + setPersonas.size());
        
        Iterator<Persona> it = setPersonas.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            System.out.println(p.toString()); 
        }
    }
}