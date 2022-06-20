/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorCancelar;

    public PrestamoAutomovil(String n, Persona a, Persona b, Persona c, int d,
            String e, String f, double g) {
        super(a, b, c, d);
        establecerCiudad(n);
        garante1 = a;
        tipo = e;
        marca = f;
        valorAutomovil = g;
    }

    @Override
    public void establecerCiudad(String c) {
        ciudad = c.toLowerCase();
    }

    public void establecerGarante(Persona c) {
        garante1 = c;
    }

    public void establecerTipo(String s) {
        tipo = s;
    }

    public void establecerMarca(String s) {
        marca = s;
    }

    public void establecerValorAutomovil(double valor) {
        valorAutomovil = valor;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorAutomovil / numeroMeses;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Garante:%s %s\n"
                + "Usuario:%s\n"
                + "Numero de meses: %s\n"
                + "Ciudad: %s\n"
                + "Tipo de automovil: %s\n"
                + "Marca: %s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor total: %.2f\n",
                obtenerGarante().obtenerNombrePersona(),
                obtenerApellidoPersona().obtenerApellidoPersona(),
                obtenerUsuario().obtenerUsuario(),
                numeroMeses,
                ciudad,
                obtenerTipo(),
                obtenerMarca(),
                obtenerValorAutomovil(),
                obtenerValorCancelar());
        return cadenaFinal;
    }

}
