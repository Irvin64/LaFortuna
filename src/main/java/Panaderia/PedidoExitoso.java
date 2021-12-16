
package Panaderia;

import javax.swing.JOptionPane;

//Este apartado sirve para hacer el diseño singleton, el cual mandara mensaje
// de que el pedido se realizo con exito
public class PedidoExitoso {
    //se coloca la instancia para el pedido
    
     private static PedidoExitoso instancia;
    
    //Constructor de la clase privada
    public PedidoExitoso(){
    
    }
    
    
    public static PedidoExitoso getInstancia(){
        //comprobación de que se creo o no con un if o else
        if(instancia == null)
            instancia = new PedidoExitoso();
        else
            JOptionPane.showMessageDialog(null, "Cargando...");
        return instancia; 
    }
    
    //El mensaje de que el pedido se realizo con exito
    public void conectar(){
    JOptionPane.showMessageDialog(null, "El pedido se ha realizado con exito");
    }
}
