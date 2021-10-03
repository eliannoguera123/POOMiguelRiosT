package poo.juego.app;
import poo.juego.dominio.Juego;
import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/piedra-papel-tijera.jpg");
    private static final int OPCION_JUGAR = 0;
    private static final int OPCION_PUNTAJE = 1;
    private static final int OPCION_INSTRUCCIONES = 2;
    private static final int OPCION_CAMBIAR_NOMBRE = 3;
    //APPJUEGO
    public static void main(String[] args) {
        Juego juego = new Juego("Piedra, papel o tijeras");

        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null, "PIEDRA, PAPEL O TIJERA!",
                    "Juego ", 0, 0, icono,
                    Arrays.asList("Jugar", "Puntaje", "Instrucciones", "Cambiar Nombre").toArray(), null);
            switch (opcionElegida) {

                case OPCION_JUGAR:

                    if(ingresarNombre() == null){
                        juego.setNombreJugador(ingresarNombre());
                    }
                    int jugadaPC = juego.jugadaPC();
                    int jugadaElegidaJugador = (int) JOptionPane.showInputDialog(null, "Seleccione:",
                            "Juego", JOptionPane.QUESTION_MESSAGE, icono, Juego.OPCION.toArray(), null);
                    JOptionPane.showMessageDialog(null,juego.getNombreJugador()+"Seleccionó: \n"+jugada(jugadaElegidaJugador)+"\n"+"PC seleccionó: \n"+jugada(jugadaPC));
                    String mostrarResultado = juego.jugar(jugadaElegidaJugador,jugadaPC);
                    JOptionPane.showMessageDialog(null,mostrarResultado);

                    //se valida, luego se pone la jugada del pc luego la del jugador que es en la que podemos elegir piedra, papel o tijera y por ultimo va
                    //metodo jugar y despues imprimir datos bonitos

                    break;
                case OPCION_PUNTAJE:
                    JOptionPane.showMessageDialog(null,"VEREMOS PUNTAJE: \n Jugador: "+juego.getGanadasJugador()+"\n PC: "+juego.getGanadasPC()+"\n Empates: "+juego.getEmpates() );
                    break;

                case OPCION_INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"INSTRUCCIONES: ");
                    break;
                case OPCION_CAMBIAR_NOMBRE:
                    juego.setNombreJugador(ingresarNombre());
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }


        }

    }

    //METODOS
    public static String ingresarNombre(){
        String nombreJugador;

        do {
            nombreJugador = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
        }while (nombreJugador == null || nombreJugador.trim().isEmpty());

        return nombreJugador;
    }

    public static String jugada(int jugada){
        if(jugada == 0){
            return "PIEDRA";
        }else if(jugada == 1){
            return "PAPEL";
        }else{
            return "TIJERA";
        }
    }

}
