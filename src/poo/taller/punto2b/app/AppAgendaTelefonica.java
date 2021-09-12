package poo.taller.punto2b.app;


import poo.taller.punto2b.dominio.AgendaTelefonica;
import poo.taller.punto2b.dominio.Contacto;
public class AppAgendaTelefonica {
    public static void main(String[] args) {
        System.out.println("Agenda Telefonica");
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica("AgendaDOSMIL");
        Contacto Miguel =new Contacto("Miguel", "Rios",304353214);
        Contacto Camilo = new Contacto("Camilo","Ayala",320869204);

        agendaTelefonica.crearContacto(Miguel);
        agendaTelefonica.crearContacto(Camilo);

        Contacto a = agendaTelefonica.buscar(304353214);
        System.out.println(a);
        Contacto b = agendaTelefonica.buscar(30435);
        System.out.println(b);

        boolean c = agendaTelefonica.eliminarContacto(304353);
        System.out.println(c);


    }


}
