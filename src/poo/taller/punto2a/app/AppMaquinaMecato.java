package poo.taller.punto2a.app;

import poo.hotel.dominio.Habitacion;
import poo.taller.punto2a.dominio.Mecato;
import poo.taller.punto2a.dominio.DispensadorMecato;

import java.util.List;

public class AppMaquinaMecato {
    public static void main(String[] args) {
        DispensadorMecato maquina= new DispensadorMecato("LG","MECATOTRONIX 3000");
        System.out.println("Maquina de Mecato MECATOTRONIX 3000");
        Mecato producto1= new Mecato("Chocorramo",1,7);
        Mecato producto2= new Mecato("PapasAir",2,5);

        maquina.getProductos().add(producto1);
        maquina.getProductos().add(producto2);
        System.out.println(producto1);

       // List<Mecato> product = maquina.sacarUnidadNombre(producto1);

    }
}
