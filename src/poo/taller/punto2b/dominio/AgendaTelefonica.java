package poo.taller.punto2b.dominio;

import poo.taller.punto2a.dominio.Mecato;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private String nombreDeAgenda;
    public static final int CANTIDAD_MAXIMA_CONTACTOS = 20;
    private int cantidadTotalContactos;
    private List<Contacto> contactosFavoritos;
    private List<Contacto> contactos = new ArrayList<>();
    //


    public AgendaTelefonica(String nombreDeAgenda) {
        this.nombreDeAgenda = nombreDeAgenda;
    }

    public Contacto buscar(int numero){
          Contacto numeroBuscado = null;
          for(Contacto contacto: this.contactos){
              if(contacto.getNumero() == numero){
                  numeroBuscado = contacto;

              }
          }
          return numeroBuscado;

    }

   public boolean crearContacto(Contacto contacto){
        if(this.contactos.size() < CANTIDAD_MAXIMA_CONTACTOS){
            if (contacto != null) {
                this.contactos.add(contacto);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
   }

    public boolean eliminarContacto(int numero){
        Contacto numeroAEliminar = buscar(numero);
        if(numeroAEliminar != null){
            this.contactos.remove(numeroAEliminar);
            return true;
        }else{
            return false;
        }
    }

    public Contacto buscarContactoNombre(String nombre){
        Contacto nombreABuscar = null;
        for(Contacto contacto: this.contactos) {
            if(nombreABuscar.getNombre().equalsIgnoreCase(nombre)){
                nombreABuscar = contacto;
            }
        }
        return nombreABuscar;
    }

    public Contacto buscarContactoApellido(String apellido){
        Contacto apellidoBuscado = null;
        for(Contacto contacto: this.contactos){
            if(apellidoBuscado.getApellido().equalsIgnoreCase(apellido) ){
                apellidoBuscado = contacto;
            }
        }
        return  apellidoBuscado;
    }


    public boolean cambiarNumeroContacto(int numeroNuevo, Contacto contacto){
        int numeroViejo = contacto.getNumero();
        if(numeroViejo != numeroNuevo){
             contacto.setNumero(numeroNuevo);
             return true;
        }else{
            System.out.println("El numero nuevo es igual al numero viejo");
            return false;
        }
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
