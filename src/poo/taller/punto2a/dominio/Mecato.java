package poo.taller.punto2a.dominio;

public class Mecato {
    //Atributos
    public String nombre;
    private int codigo;
    private int precio;
    public int cantidadActual;

    //Constructor
    public Mecato(String nombre, int codigo, int cantidadActual) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadActual = cantidadActual;
    }


    //Genero los Getter
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    //Genero los Setter

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
