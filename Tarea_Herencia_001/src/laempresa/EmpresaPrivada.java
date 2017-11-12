/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author eafuc
 */
public class EmpresaPrivada extends Empresa{

    private double ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(Trabajador[] T, double vmf, int ns) {
        super(T);
        establecer_ventas_mensual_fijo(vmf);
        establecer_numero_sucursales(ns);
    }

    public void establecer_ventas_mensual_fijo(double vmf) {
        ventas_mensual_fijo = vmf;
    }

    public double obtener_ventas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void establecer_numero_sucursales(int ns) {
        numero_sucursales = ns;
    }

    public int obtener_numero_sucursales() {
        return numero_sucursales;
    }

    @Override
    public String toString() {
        String cadena_trabajadores = "";
        Trabajador[] X = obtener_trabajadores();
        for (int i = 0; i < X.length; i++) {
            cadena_trabajadores += (i + 1) + ")\t" + X[i];
        }
        String cadena = String.format("%s\nVentas: $ %.0f\nSucursales: %d\nLista de trabajadores:\n\n\t%s",
                super.toString(), obtener_ventas_mensual_fijo(), obtener_numero_sucursales(), cadena_trabajadores);
        return cadena;
    }
}
