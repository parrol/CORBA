package manejadores;

/**
* manejadores/ProductosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/LABAM/Documents/Parra/Sistemas Distribuidos/CORBA/CORBA/CorbaInterface/src/corbainterface/generar.idl
* martes 28 de mayo de 2019 15H59' PYT
*/

public final class ProductosHolder implements org.omg.CORBA.portable.Streamable
{
  public manejadores.Productos value = null;

  public ProductosHolder ()
  {
  }

  public ProductosHolder (manejadores.Productos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = manejadores.ProductosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    manejadores.ProductosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return manejadores.ProductosHelper.type ();
  }

}
