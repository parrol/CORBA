package manejadores;


/**
* manejadores/facturaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/LABAM/Documents/Parra/Sistemas Distribuidos/CORBA/CORBA/CorbaInterface/src/corbainterface/generar.idl
* martes 28 de mayo de 2019 15H59' PYT
*/

public interface facturaOperations 
{
  void generar (String nombre, String cedula, String direccionp, manejadores.Productos[] productos, String company, String direccionc, String telefono, int numero);
} // interface facturaOperations
