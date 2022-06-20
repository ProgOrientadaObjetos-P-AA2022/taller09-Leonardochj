/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {

    private String nombreInstitucion;
    private String siglas;

    public void establecerNombreInstitucion(String s) {
        nombreInstitucion = s;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombreInstitucion() {
        return nombreInstitucion;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena1 = String.format("%s\n"
                + "%s\n",
                nombreInstitucion,
                siglas);
        return cadena1;
    }
}
