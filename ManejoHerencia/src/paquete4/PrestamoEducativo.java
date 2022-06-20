/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String n, Persona a, Persona b, Persona c, int d,
            String e, InstitucionEducativa f, double g) {
        super(a, b, c, d);
        establecerCiudad(n);
        centroEducativo = f;
        nivelEstudio = e;
        valorCarrera = g;
    }

    @Override
    public void establecerCiudad(String c) {
        ciudad = c.toUpperCase();
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerNivelEstudio(String s) {
        nivelEstudio = s;
    }

    public void establecerValorCarrera(double valor) {
        valorCarrera = valor;
    }

    public void calcularValorMensual() {
        valorMensual = valorCarrera / numeroMeses - (valorCarrera / numeroMeses) * 0.1;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Centro Educativo: %s\n"
                + "Persona: %s %s\n"
                + "Usuario: %s\n"
                + "Numero de meses: %s\n"
                + "Ciudad: %s\n"
                + "Nivel de Estudio: %s\n"
                + "Valor de la carrera: %s\n"
                + "Valor mensual: %.2f\n",
                obtenerCentroEducativo().obtenerNombreInstitucion(),
                obtenerNombrePersona().obtenerNombrePersona(),
                obtenerApellidoPersona().obtenerApellidoPersona(),
                obtenerUsuario().obtenerUsuario(),
                numeroMeses,
                ciudad,
                obtenerNivelEstudio(),
                obtenerValorCarrera(),
                obtenerValorMensual());
        return cadenaFinal;
    }
}
