
package Panaderia;
//Clases importadas para la conexion y funcionamiento del programa
import facade.FacadeFortuna;
import javax.swing.JOptionPane;


class Pedido {
    
     public static void main(String[] args){
    //Declarar el cliente que hizo el pedio, y el trasnportista que esta llevando
    //al igual que los pedidos y domicilios
    
         FacadeFortuna trasportista = new FacadeFortuna();
         trasportista.clienteBuscando("TPYC35276", "La fortuna Centro","Maravatio",220);
         
       
       //Declarar la clase Pedido Exitoso, la cual mostrara el mensaje
       //del pedio exitoso
       PedidoExitoso pedido = PedidoExitoso.getInstancia();
       pedido.conectar();
     
     }
    
    
}
