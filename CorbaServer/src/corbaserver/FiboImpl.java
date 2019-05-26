package corbaserver;

import example.fibonacciPOA;

/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class FiboImpl extends fibonacciPOA {

    @Override
    public String generar(int numero) {
	String cadena = "";
        for (int i = 1; i <= numero; i++) {
            double raiz = Math.sqrt(5);
            int rta = (int) ((1 / raiz) * (Math.pow((1 + raiz) / 2, i)) - (1 / raiz) * (Math.pow((1 - raiz) / 2, i)));            
            cadena += Math.round(rta) + " ";
        }
        return cadena;
    }

}