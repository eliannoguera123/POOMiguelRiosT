package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public  class FacturaSinIva extends Factura{
    public FacturaSinIva(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha);
    }

   @Override
    public long calcularTotal() {
        return 0; // en este return quisiera llamar al valor de valor del constructor de arriba
    }
}
