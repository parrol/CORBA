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
        Object x = null;
        if (lista.get(index) instanceof Productos) {
            Productos p = (Productos) lista.get(index);
            System.out.println(p);
            return p.getNombre();
        }
        if (lista.get(index) instanceof Persona) {
            Persona p = (Persona) lista.get(index);
            System.out.println(p);
            return p.getNombre();
        }
        return x;
    }

    public void add(Productos p) {
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }

    public void add(Persona p) {
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }

    public void delete(int index) {
        lista.remove(index);
        this.fireIntervalRemoved(index, getSize(), getSize() + 1);
    }

    public void removeAll() {
        lista.removeAll(lista);
    }

    public Productos getProducto(int index) {
        return (Productos) lista.get(index);
    }

    public Persona getPersona(int index) {
        return (Persona) lista.get(index);
    }

    public ArrayList getLista() {
        return lista;
    }

}
