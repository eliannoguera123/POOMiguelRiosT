package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaConIva12 extends FacturaConIva{


    public FacturaConIva12(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha, 12);
    }

    @Override
    public long calcularTotal() {
        return 0;
    }

}
