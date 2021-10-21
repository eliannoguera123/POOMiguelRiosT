package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaConIvaYDescuento extends FacturaConIva{

    private int porcDescuento;

    public FacturaConIvaYDescuento(int numero, long valor, LocalDateTime fecha, int iva, int porcDescuento) {
        super(numero, valor, fecha, iva);
        this.porcDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        return 0;
    }
}
