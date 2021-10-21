package poo.practicaDesafio2.dominio;

import java.time.LocalDateTime;

public abstract class Factura {
    private int numero;
    private long valor;
    private LocalDateTime fecha;

    public Factura(int numero, long valor, LocalDateTime fecha) {
        this.numero = numero;
        this.valor = valor;
        this.fecha = fecha;
    }

    public abstract long calcularTotal();

}

