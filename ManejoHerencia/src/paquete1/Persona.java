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
public class Persona {

    private String nombrePersona;
    private String apellidoPersona;
    private String username;

    public void establecerNombrePersona(String s) {
        nombrePersona = s;
    }

    public void establecerApellidoPersona(String s) {
        apellidoPersona = s;
    }

    public void establecerUsuario(String s) {
        username = s;
    }

    public String obtenerNombrePersona() {
        return nombrePersona;
    }

    public String obtenerApellidoPersona() {
        return apellidoPersona;
    }

    public String obtenerUsuario() {
        return username;
    }

    @Override
    public String toString() {
        String cadena1 = String.format("%s %s\n"
                + "%s\n",
                nombrePersona,
                apellidoPersona,
                username);
        return cadena1;
    }
}
