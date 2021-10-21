package poo.practicaDesafio2.app;


import poo.practicaDesafio2.dominio.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppFacturacion {
    public static void mostrarTotal(){

    }

    public static void main(String[] args){
        List<Factura> facturas = new ArrayList<>();
        Factura facturaConIva = new FacturaConIva(1,20,LocalDateTime.now(),16);
        Factura facturaConIva12 = new FacturaConIva12(2,15, LocalDateTime.now());
        Factura facturaConIbaYDescuento = new FacturaConIvaYDescuento(3,30,LocalDateTime.now(),16,20);
        Factura facturaSinIva = new FacturaSinIva(4,60,LocalDateTime.now());
        Factura facturaConDescuento = new FacturaConDescuento(5,100, LocalDateTime.now(),30);

        facturas.add(facturaConIva);
        facturas.add(facturaConIva12);
        facturas.add(facturaConIbaYDescuento);
        facturas.add(facturaSinIva);
        facturas.add(facturaConDescuento);

    }

}


