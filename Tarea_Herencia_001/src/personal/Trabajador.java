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
public class Trabajador extends Persona {

    private double costo_seguro;
    private double horas_trabajadas;
    private double costo_por_hora;

    public Trabajador(String n, String a, int e, String c, double cs, double ht, double ch) {
        super(n, a, e, c);
        establecer_costo_seguro(cs);
        establecer_horas_trabajadas(ht);
        establecer_costo_por_hora(ch);
    }

    public void establecer_costo_seguro(double cs) {
        costo_seguro = cs;
    }

    public double obtener_costo_seguro() {
        return costo_seguro;
    }

    public void establecer_horas_trabajadas(double ht) {
        horas_trabajadas = ht;
    }

    public double obtener_horas_trabajadas() {
        return horas_trabajadas;
    }

    public void establecer_costo_por_hora(double ch) {
        costo_por_hora = ch;
    }

    public double obtener_costo_por_hora() {
        return costo_por_hora;
    }

    public double obtener_sueldo() {
        double sue = 0;
        sue = (horas_trabajadas * costo_por_hora) + costo_seguro;
        return sue;
    }
    @Override
    public String toString(){
        String cadena = String.format("%s\tSeguro: $ %d\n\tHoras trabajadas: %d\n\tValor por hora: $ %d\n\tSueldo: $ %d\n",
                super.toString(), obtener_costo_seguro(), obtener_horas_trabajadas(), obtener_costo_por_hora(), obtener_sueldo());
        return cadena;
    }
}
