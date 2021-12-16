
package Panaderia;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class Transportista {
    //Clase transportista donde pide datos de ingresar la ubicacion del cliente
    String ubicacion = JOptionPane.showInputDialog("ingresa tu ubicacion: ");

//Mensaje de confirmacion de la ubicacion y datos de la compra y trasnportista.. como lo son el precio a pagar
// y la placa de la camioneta
    public void buscar(String placa, int precio){
    String resultado = Transportista.buscarTransportista(placa, precio);
    JOptionPane.showMessageDialog(null,"Sera entregado en: "+ubicacion +"\nSu transportista sera: " + resultado + 
        "\n el total a pagar sera de: " + precio + "\n con la placa de la camioneta: " + placa);
    }
    
    //Numero de trasnportistas los cuales sales de manera aleatoria.
    //en este apartado el cliente se entera de quien es su repartidor, con la placa y precio a pagar
    public static String buscarTransportista(String placa, int precio){
            String[] trasportista = {"Irving", "Alvaro", "Diego", "Cesar", "Ricardo", "Joel", "Adrian", "Rosendo", "El Pepe"};
            int indice = 0;
            if(placa.startsWith("5"))
                indice = numeroAleatorio(0, trasportista.length -5);
            else
                indice = numeroAleatorio(0, trasportista.length -1);
            String vueloElegido = trasportista[indice];
            return vueloElegido;
    }
    //numero aleatorio de clientes
    public static int numeroAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
}
