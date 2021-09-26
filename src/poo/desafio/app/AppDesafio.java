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
        int n;
        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "Elije una opcion",
                    "Calculadora ", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir").toArray(), null);

            switch (opcionElegida) {
                case OPCION_SUMAR :
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                    calculadora.sumar(n);
                    break;
                case OPCION_RESTAR :
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                    calculadora.restar(n);
                    break;
                case OPCION_MULTIPLICAR :
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                    calculadora.multiplicar(n);
                    break;
                case OPCION_DIVIDIR :
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                    calculadora.dividir(n);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
        }
    }

