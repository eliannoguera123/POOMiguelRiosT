package poo.taller.punto2a.dominio;

import poo.hotel.dominio.Habitacion;
import poo.taller.punto2a.dominio.Mecato;
import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {

    private String marca;
    private String nombreMaquinaMecato;
    private List<Mecato> productos;

    //Constructor
    public DispensadorMecato(String marca, String nombreMaquinaMecato) {
        this.marca = marca;
        this.nombreMaquinaMecato = nombreMaquinaMecato;
        this.productos = productos;
    }


    //Operaciones
    private boolean sacarUnidadNombre(String nombreproducto){
        List<Mecato> product =new ArrayList<>();
        for(Mecato pro1: this.getProductos()){
            if(pro1.getNombre().equals(nombreproducto)){
                return true;
            }
        }
        return false;
    }


    public int consultarUnidadesDeProducto(){
        return 0;
    }

    public int consultarTotalUnidades(){
        return 0;
    }

    public int aumentarStock(){
        return 0;
    }

    //Getter
    public String getMarca() {
        return marca;
    }
    public List<Mecato> getProductos() {
        return productos;
    }
    //Setter
    public void setProductos(List<Mecato> productos) {
        this.productos = productos;
    }
}
