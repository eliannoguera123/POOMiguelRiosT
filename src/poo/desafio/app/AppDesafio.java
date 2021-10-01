package poo.desafio.app;
import poo.desafio.dominio.Calculadora;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDesafio {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/Calculadora.png");
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;
    private static final int OPCION_CHECKBOX = 4;
    private static int n;

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("LG");
        JCheckBox checkBox = new JCheckBox("¿Quieres redondear?");
        List<Double> listaNumeros;
        listaNumeros = new ArrayList<>();
        int n;
        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "¿Que operación deseas hacer?",
                    "Calculadora ", 0, 0, icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir",checkBox).toArray(), null);
            switch (opcionElegida) {
                case OPCION_SUMAR :

                    n = ingresarN();
                    for (int i = 0; i< n; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumero();
                                listaNumeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("Numero no válido");
                            }
                            System.out.println(listaNumeros);
                        }while(numero<0);
                    }
                    double resultadoSuma = calculadora.sumar(listaNumeros);
                    mostrarMensaje("El resultado de la suma es: " + resultadoSuma);
                    listaNumeros.clear();
                    break;

                case OPCION_RESTAR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumero();
                                listaNumeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("Numero no válido");
                            }
                            System.out.println(listaNumeros);
                        }while(numero<0);
                    }
                    double resultadoResta = calculadora.restar(listaNumeros);
                    mostrarMensaje("El resultado de la resta es: " + resultadoResta);
                    listaNumeros.clear();

                    break;

                case OPCION_MULTIPLICAR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumero();
                                listaNumeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("Numero no válido");
                            }
                            System.out.println(listaNumeros);
                        }while(numero<0);
                    }
                    double resultadoMultiplicacion = calculadora.multiplicar(listaNumeros);
                    mostrarMensaje("El resultado de la multiplicación es: "+resultadoMultiplicacion);
                    listaNumeros.clear();
                    break;

                case OPCION_DIVIDIR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumero();
                                listaNumeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("Numero no válido");
                            }
                            System.out.println(listaNumeros);
                        }while(numero<0);
                    }
                   double resultadoDivision = calculadora.dividir(listaNumeros, checkBox.isSelected());
                    mostrarMensaje("El resultado de la división es: "+resultadoDivision);
                    listaNumeros.clear();
                    break;

                case OPCION_CHECKBOX :
                    boolean check = checkBox.isSelected();

                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
        }

        //METODOS

        //INGRESAR N
    public static int ingresarN(){
        do{
            try{
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n "));
                if(n<1){
                    JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
                }
            }catch (NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
            }
        }while(n<1);
        return n;
    }

    //INGRESAR NUMERO
    public static double ingresarNumero(){
        do{
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                return numero;
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no valido");
                continue;
            }
        }while(true);
    }

    //MOSTRAR MENSAJEE
    private static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }

}

