package poo.taller.punto2a.dominio;

public class Mecato {
    //Atributos
    private String nombre;
    private int codigo;
    private int precio;
    private int cantidadActual;

    //Constructor
    public Mecato(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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


    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
