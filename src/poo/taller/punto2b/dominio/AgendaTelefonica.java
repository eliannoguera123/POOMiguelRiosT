package poo.taller.punto2b.dominio;

import java.util.List;

public class AgendaTelefonica {
    private int cantidadTotalContactos;
    private List<Contacto> contactosFavoritos;
    //

    public AgendaTelefonica(int cantidadTotalContactos, List<Contacto> contactosFavoritos) {
        this.cantidadTotalContactos = cantidadTotalContactos;
        this.contactosFavoritos = contactosFavoritos;
    }



    //public Contacto crearNuevoContacto(){

    //    return Contacto;
   // }

    public boolean eliminarContacto(){
        return true;
    }

    public boolean buscarContactoNombre(){
        return true;
    }
    public boolean buscarContactoApellido(){
        return true;
    }
    public boolean buscarContactoNumero(){
        return true;
    }

    public int cambiarNumeroContacto(){
        return 0;
    }

    //public List<Contacto> ordenAlfabetico(){
       // return List<Contacto>;
    //}


    public int getCantidadTotalContactos() {
        return cantidadTotalContactos;
    }

    public List<Contacto> getContactosFavoritos() {
        return contactosFavoritos;
    }

    public void setCantidadTotalContactos(int cantidadTotalContactos) {
        this.cantidadTotalContactos = cantidadTotalContactos;
    }

    public void setContactosFavoritos(List<Contacto> contactosFavoritos) {
        this.contactosFavoritos = contactosFavoritos;
    }
}
