/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbacliente;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Oriana
 */
public class Interfaz {

    public static ArrayList interfaz = new ArrayList<JFrame>();

    public Interfaz() {
    }

    public static ArrayList getInterfaz() {
        return interfaz;
    }

    public static void setInterfaz(ArrayList interfaz) {
        Interfaz.interfaz = interfaz;
    }
    
    public static JFrame getInterfaz(int index){
        return (JFrame) interfaz.get(index);
    }
    
    
}
