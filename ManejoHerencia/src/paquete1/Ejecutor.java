/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese 1 para calcular el prestamo de un "
                    + "automovil o 2 para calcular el prestamo de un instituto "
                    + "eduactivo");
            int n = entrada.nextInt();
            if (n == 1) {
                System.out.println("DATOS SOBRE EL PRESTAMO DEL AUTOMOVIL\n");
                System.out.println("Ingrese el nombre de la persona");
                entrada.nextLine();
                String nombrePersona = entrada.nextLine();
                System.out.println("Ingrese el apellido de la persona");
                String apellidoPersona = entrada.nextLine();
                System.out.println("Ingrese el nombre del usuario");
                String username = entrada.nextLine();
                System.out.println("Ingrese el numero de meses del prestamo");
                int nMeses = entrada.nextInt();
                System.out.println("Ingrese la ciudad donde realiza el prestamo");
                entrada.nextLine();
                String ciudad = entrada.nextLine();
                System.out.println("Ingrese el tipo de automovil");
                String tipo = entrada.nextLine();
                System.out.println("Ingrese la marca del automovil");
                String marca = entrada.nextLine();
                System.out.println("Ingrese el valor del automovil");
                double precioAutomovil = entrada.nextDouble();

                Persona persona1 = new Persona();
                Persona persona2 = new Persona();
                Persona persona3 = new Persona();
                persona1.establecerNombrePersona(nombrePersona);
                persona2.establecerApellidoPersona(apellidoPersona);
                persona3.establecerUsuario(username);

                Prestamo datosPrestamo = new Prestamo(persona1, persona2,
                        persona3, nMeses);

                PrestamoAutomovil datosPrestamoAutomovil
                        = new PrestamoAutomovil(ciudad, persona1, persona2,
                                persona3, nMeses, tipo, marca, precioAutomovil);

                datosPrestamoAutomovil.calcularValorCancelar();
                
                System.out.println("----------------------------------------");

                System.out.println(datosPrestamoAutomovil);
            } else {
                if (n == 2) {
                    System.out.println("DATOS SOBRE EL PRESTAMO DE UN INSTITUTO EDUCATIVO\n");
                    System.out.println("Ingrese el nombre de la persona");
                    entrada.nextLine();
                    String nombrePersona = entrada.nextLine();
                    System.out.println("Ingrese el apellido de la persona");
                    String apellidoPersona = entrada.nextLine();
                    System.out.println("Ingrese el nombre del usuario");
                    String username = entrada.nextLine();
                    System.out.println("Ingrese el instituto educativo");
                    String instituto = entrada.nextLine();
                    System.out.println("Ingrese las siglas del instituto");
                    String siglas = entrada.nextLine();
                    System.out.println("Ingrese el numero de meses del prestamo");
                    int nMeses = entrada.nextInt();
                    System.out.println("Ingrese la ciudad donde realiza el prestamo");
                    entrada.nextLine();
                    String ciudad = entrada.nextLine();
                    System.out.println("Ingrese el nivel de estudio");
                    String nivelEstudio = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera");
                    double valorCarrera = entrada.nextDouble();

                    Persona persona1 = new Persona();
                    Persona persona2 = new Persona();
                    Persona persona3 = new Persona();
                    persona1.establecerNombrePersona(nombrePersona);
                    persona2.establecerApellidoPersona(apellidoPersona);
                    persona3.establecerUsuario(username);

                    InstitucionEducativa instituto1 = new InstitucionEducativa();
                    InstitucionEducativa instituto2 = new InstitucionEducativa();
                    instituto1.establecerNombreInstitucion(instituto);
                    instituto2.establecerSiglas(siglas);

                    Prestamo datosPrestamo = new Prestamo(persona1, persona2,
                            persona3, nMeses);

                    PrestamoEducativo datosPrestamoEducativo
                            = new PrestamoEducativo(ciudad, persona1, persona2,
                                    persona3, nMeses, nivelEstudio, instituto1,
                                    valorCarrera);

                    datosPrestamoEducativo.calcularValorMensual();
                    
                    System.out.println("------------------------------------");

                    System.out.printf("Siglas del centro educativo: %s\n", 
                            instituto2.obtenerSiglas());
                    System.out.println(datosPrestamoEducativo);
                } else {
                    System.out.println("Error. Fuera de rango");
                }
            }
            System.out.println("Ingrese 5 si desea salir del ciclo");
            int numeroSalida = entrada.nextInt();
            if (numeroSalida == 5) {
                bandera = false;
            }
        }
        System.out.println("");
    }
}
