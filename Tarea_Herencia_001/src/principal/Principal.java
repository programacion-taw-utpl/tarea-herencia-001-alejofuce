/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import laempresa.*;
import personal.*;

/**
 *
 * @author eafuc
 */
public class Principal {

    public static void main(String[] Args) {
        Trabajador tr1 = new Trabajador("Ana Luisa", "Velez Alcivar", 30, "12903939", 100, 40, 10);
        Trabajador tr2 = new Trabajador("Mario Anibal", "Vela Narvaez", 35, "212889", 100, 50, 10);
        Trabajador[] T = new Trabajador[2];
        T[0] = tr1;
        T[1] = tr2;
        EmpresaPrivada ep = new EmpresaPrivada(T, 200000, 12);
        System.out.println(ep);

    }
}
