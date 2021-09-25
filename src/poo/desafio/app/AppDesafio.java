package poo.desafio.app;
import poo.desafio.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;

public class AppDesafio {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/calculadoraicono.png");



    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("LG");

        while(true){

            int opcionElegida = JOptionPane.showOptionDialog(null, "Elije una opcion",
                    "Calculadora ", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir").toArray(), "sumar");
        }





    }


}
