package corbaserver;

import java.util.ArrayList;
import manejadores.Productos;
import manejadores.facturaPOA;

public class Metodos extends facturaPOA {

    /*
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
    */
    
    @Override
    public void generar(String nombre, String cedula, String direccionp, Productos[] productos, String company, String direccionc, String telefono, int numero) {
        System.out.println("/////////////////////////////////");
        System.out.println("SENIAT");
        System.out.println("Company: " + company);
        System.out.println("Direccion: " + direccionP);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero de factura: " + numero);
        System.out.println("Hora: " + new java.util.Date());
        System.out.println("Datos del consumidor");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccionC);
        System.out.println("FACTURA");
        int i;
        for (i = 0; i < this.productos.size(); i++) {
            System.out.println(productos.get(i).getNombre() + " > " + productos.get(i).getPrecio());
            this.total += productos.get(i).getPrecio();
        }
        System.out.println("TOTAL> " + this.total);
        System.out.println("/////////////////////////////////");
    }

}
