/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author eafuc
 */
public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private String cedula;

    public Persona(String n, String a, int e, String c) {
        establecer_nombres(n);
        establecer_apellidos(a);
        establecer_edad(e);
        establecer_cedula(c);
    }

    public void establecer_nombres(String n) {
        nombres = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_apellidos(String a) {
        apellidos = a;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_edad(int e) {
        edad = e;
    }

    public int obtener_edad() {
        return edad;
    }

    public void establecer_cedula(String c) {
        cedula = c;
    }

    public String obtener_cedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n\t\t%d años de edad\n\t\tCI: %s\n",
                obtener_nombres(), obtener_apellidos(), obtener_edad(), obtener_cedula());
        return cadena;
    }
}
