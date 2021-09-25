package poo.desafio.app;
import poo.desafio.dominio.Calculadora;
import javax.swing.*;
import java.util.Arrays;

public class AppDesafio {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/uco.png");
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("LG");
        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "Elije una opcion",
                    "Calculadora ", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir").toArray(), null);

            switch (opcionElegida) {
                case OPCION_SUMAR :
                    calculadora.sumar();
                    break;
                case OPCION_RESTAR :
                    calculadora.restar();
                    break;
                case OPCION_MULTIPLICAR :
                    calculadora.multiplicar();
                    break;
                case OPCION_DIVIDIR :
                    calculadora.dividir();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
        }
    }

