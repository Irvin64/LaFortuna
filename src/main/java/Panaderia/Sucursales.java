// clase de las sucursales de las cuales sale el pan
package Panaderia;
import static Panaderia.Transportista.numeroAleatorio;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class Sucursales {
    // Entrada de datos donde se coloca el nombre y pedido del cliente
    String name = JOptionPane.showInputDialog("ingresa tu nombre: ");
    String pedido = JOptionPane.showInputDialog("ingresa tu pedido: ");
    
    //Mensaje de confirmacion de pedido, donde muestra lo que se pidio y de donde sale como sucursal y ubicacion
    public void buscar(String nombre, String ubicacion){
    String sucursal = Sucursales.buscarSucursales(nombre, ubicacion);
    JOptionPane.showMessageDialog(null, "el pedido de:" +pedido+"\na nombre de: " +name+ "\nSale de la sucursal: " + sucursal + 
        "\nQue se encuentra en: " + ubicacion);
}
    //Sucursales de donde sale el pedido, el cual se realiza de forma aleatoria para ver de donde sale el pedido
    //sale nombre de la tienda y la sucursal
    public static String buscarSucursales(String nombre, String sucursal){
            String[] vuelos = {"San miguel", "Bulebar", "Centro", "Los portales", "Lomas del panteon", "Cuartel V"};
            int indice = 0;
            if(sucursal.startsWith("6"))
                indice = numeroAleatorio(0, vuelos.length -2);
            else
                indice = numeroAleatorio(0, vuelos.length -1);
            String vueloElegido = vuelos[indice];
            return vueloElegido;
    }
    
    //Public static la cual saca el numero aleatorio
    public static int numeroAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
    
}
