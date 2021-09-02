package poo.taller.punto2a.dominio;

import java.util.List;

public class DispensadorMecato {
    //Atributos
    private String marca;
    private Mecato productos;

    //Constructor
    public DispensadorMecato(Mecato productos) {
        this.productos = productos;
    }

    //Operaciones
    private boolean sacarUnidadNombre(){
        return false;
    }

    private boolean sacarUnidadCodigo(){
        return false;
    }

    //FALTA ESTE PROCESO CON LISTA
   // private List<String> consultarAgotados(){
    //return String;
    //}

    private int consultarUnidadesDeProducto(){
        return 0;
    }

    private int consultarTotalUnidades(){
        return 0;
    }

    private int aumentarStock(){
        return 0;
    }


    //Getter
    public String getMarca() {
        return marca;
    }

    public Mecato getProductos() {
        return productos;
    }

    //Setter

    public void setProductos(Mecato productos) {
        this.productos = productos;
    }
}
