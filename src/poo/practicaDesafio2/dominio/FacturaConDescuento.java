package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaConDescuento extends FacturaSinIva{

    private int porcDescuento;

    public FacturaConDescuento(int numero, long valor, LocalDateTime fecha, int porcDescuento) {
        super(numero, valor, fecha);
        this.porcDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        return 0;
    }
}
