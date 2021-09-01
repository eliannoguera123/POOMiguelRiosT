package poo.banco.dominio;

public class CuentaBancaria {
    // Atributos
    private int numero;
    private String tipoCuenta;
    private long saldo;
    private Persona propietario;
    private Banco banco;
    private boolean activa;

    public CuentaBancaria(int numero, String tipoCuenta, Persona propietario, Banco banco) {
        this.numero = numero;
        this.tipoCuenta = tipoCuenta;
        this.propietario = propietario;
        this.banco = banco;
        this.activa = true;
        this.saldo = 0;
    }

    public CuentaBancaria(int numero, String tipoCuenta, long saldo, Persona propietario, Banco banco) {
        this(numero, tipoCuenta, propietario, banco);
        this.saldo = saldo;
    }

    // Métodos
    public void activar() {
        activa = true;
    }

    public void inactivar() {
        activa = false;
    }

    public boolean consignar(long dineroAConsignar) {
        if (activa == true) {
            saldo += dineroAConsignar;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(long dineroARetirar) {
        if (this.activa == true && this.saldo >= dineroARetirar) {
            this.saldo -= dineroARetirar;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(CuentaBancaria cuentaDestino, long dineroATransferir) {
        boolean retiro = this.retirar(dineroATransferir);

        if (retiro == true) {
            boolean consigno = cuentaDestino.consignar(dineroATransferir);

            if (consigno == true) {
                return true;
            } else {
                this.consignar(dineroATransferir);
                return false;
            }
        } else {
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo de la cuenta " + numero + " es: $" + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public Banco getBanco() {
        return banco;
    }

    public boolean isActiva() {
        return activa;
    }
}
