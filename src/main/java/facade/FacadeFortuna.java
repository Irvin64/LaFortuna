
package facade;
//clases importadas para el funcionamiento y conexion entre clases
import Panaderia.Sucursales;
import Panaderia.Transportista;


public class FacadeFortuna {
    //variables privadas

    private Sucursales sucursales;
    private Transportista transportista;
    
    public FacadeFortuna(){
        
        sucursales = new Sucursales();
        transportista = new Transportista();
    }
    //Datos con diagrama facade el cual mostrara los datos del repartidos, sucursales, precio y la placa
    //del repartidos al momento de ser llamada
    public void clienteBuscando(String placa,String nombre,String sucursal,int precio){
        sucursales.buscar(nombre, sucursal);
        transportista.buscar(placa, precio);
    } 
}
