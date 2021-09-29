package poo.desafio.app;
import poo.desafio.dominio.Calculadora;
import javax.swing.*;
import java.util.Arrays;

public class AppDesafio {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/Calculadora.png");
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;
    private static final int OPCION_CHECKBOX = 4;

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("LG");
        JCheckBox checkBox = new JCheckBox("¿Quieres redondear?");
        int n;
        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "¿Que operación deseas hacer?",
                    "Calculadora ", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir",checkBox).toArray(), null);
            switch (opcionElegida) {
                case OPCION_SUMAR :

                    n = calculadora.ingresarn();
                    calculadora.sumar(n);

                    break;
                case OPCION_RESTAR :
                    n = calculadora.ingresarn();
                    calculadora.restar(n);
                    break;
                case OPCION_MULTIPLICAR :
                    n = calculadora.ingresarn();
                    calculadora.multiplicar(n);
                    break;
                case OPCION_DIVIDIR :
                    n = calculadora.ingresarn();
                    calculadora.dividir(n);
                    break;

                case OPCION_CHECKBOX :
                    boolean check = checkBox.isSelected();

                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
        }
    }

