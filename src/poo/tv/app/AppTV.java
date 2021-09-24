package poo.tv.app;

import poo.tv.dominio.Televisor;

import javax.swing.*;

public class AppTV {
    public static void main(String[] args) {
        ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/uco.png");
        //JOptionPane.showMessageDialog(null,"HOLA POO!");
        //JOptionPane.showMessageDialog(null,"HOLA POO!","Miguel Rios",JOptionPane.WARNING_MESSAGE,icono);
        String nombre = JOptionPane.showInputDialog("Hola");
        System.out.println("Hola "+ nombre);






        /*Televisor tv = new Televisor("LENO0VO", "Versionm 8.0", (short) 50);
        System.out.println("Marca es " + tv.marca);

        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        System.out.println("Volumen: " + tv.volumenActual);*/


    }
}
