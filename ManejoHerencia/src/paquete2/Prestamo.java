/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona nombresPersona;
    protected Persona apellidosPersona;
    protected Persona username;
    protected int numeroMeses;
    protected String ciudad;

    public Prestamo(Persona a, Persona b, Persona c, int d) {
        nombresPersona = a;
        apellidosPersona = b;
        username = c;
        numeroMeses = d;
    }

    public void establecerNombresPersona(Persona nom) {
        nombresPersona = nom;
    }

    public void establecerApellidoPersona(Persona ape) {
        apellidosPersona = ape;
    }

    public void establecerUsuario(Persona s) {
        username = s;
    }

    public void establecerNumeroMeses(int n) {
        numeroMeses = n;
    }

    public void establecerCiudad(String s) {
        ciudad = s;
    }

    public Persona obtenerNombrePersona() {
        return nombresPersona;
    }

    public Persona obtenerApellidoPersona() {
        return apellidosPersona;
    }

    public Persona obtenerUsuario() {
        return username;
    }

    public int obtenerNumeroMeses() {
        return numeroMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena2 = String.format("%s %s\n"
                + "Usuario: %s\n"
                + "Numero de meses: %s\n"
                + "Ciudad: %s\n",
                obtenerNombrePersona().obtenerNombrePersona(),
                obtenerApellidoPersona().obtenerApellidoPersona(),
                obtenerUsuario().obtenerUsuario(),
                numeroMeses,
                ciudad);
        return cadena2;
    }
}
