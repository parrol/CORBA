/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbacliente;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Oriana
 */
public class CustomListModel extends AbstractListModel {

    private ArrayList lista = new ArrayList<>();

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Producto p = (Producto) lista.get(index);
        return p.getNombre();
    }

    public void addProducto(Producto p) {
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }

    public void eliminarProducto(int index) {
        lista.remove(index);
        this.fireIntervalRemoved(index, getSize(), getSize() + 1);
    }

    public Producto getProducto(int index) {
        return (Producto) lista.get(index);
    }

}
