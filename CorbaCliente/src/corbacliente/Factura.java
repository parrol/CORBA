/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbacliente;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Oriana
 */
public class Factura {

    private Persona persona;
    private ArrayList<Producto> productos;
    private String company;
    private String direccion;
    private String telefono;
    private int numero;
    private float total;

    public Factura(Persona persona, ArrayList<Producto> productos, String company, String direccion, String telefono, int numero) {
        this.persona = persona;
        this.productos = productos;
        this.company = company;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numero = numero;
        this.total = 0;
    }

    public Persona getPersona() {
        return persona;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getCompany() {
        return company;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumero() {
        return numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    

    public void imprimir() {
        System.out.println("/////////////////////////////////");
        System.out.println("SENIAT");
        System.out.println("Company: " + this.company);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Numero de factura: " + this.numero);
        System.out.println("Hora: " + new java.util.Date());
        System.out.println("Datos del consumidor");
        System.out.println("Nombre: " + this.persona.getNombre());
        System.out.println("Cedula: " + this.persona.getCedula());
        System.out.println("Direccion: " + this.persona.getDireccion());
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
