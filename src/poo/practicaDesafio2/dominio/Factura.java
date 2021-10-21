package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public abstract class Factura {
    private int numero;
    private long valor;
    private LocalDateTime fecha;
    public abstract long calcularTotal();
}

