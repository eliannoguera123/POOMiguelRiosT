package poo.juego.app;
import poo.juego.dominio.Juego;
import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    private static ImageIcon icono = new ImageIcon("C:/Users/HG/MiguelRiosTPOO/icongamee.jpg");
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
                    if(juego.getNombreJugador() == null){
                        juego.setNombreJugador(ingresarNombre());
                    }
                    JOptionPane.showMessageDialog(null,"Bienvenido "+juego.getNombreJugador());
                    int jugadaPC = juego.jugadaPC();
                    int jugadaElegidaJugador = JOptionPane.showOptionDialog(null,"Seleccione: ","Juego",0,JOptionPane.QUESTION_MESSAGE,icono,Arrays.asList("PIEDRA","PAPEL","TIJERA").toArray(),null);
                    JOptionPane.showMessageDialog(null,juego.getNombreJugador()+"Seleccionó: \n"+jugada(jugadaElegidaJugador)+"\n"+"PC seleccionó: \n"+jugada(jugadaPC));
                    String mostrarResultado = juego.jugar(jugadaElegidaJugador,jugadaPC);
                    JOptionPane.showMessageDialog(null,mostrarResultado);
                    break;

                case OPCION_PUNTAJE:
                    if(juego.getNombreJugador() == null){
                        juego.setNombreJugador(ingresarNombre());
                    }
                    JOptionPane.showMessageDialog(null,"¡PUNTAJES! \n "+juego.getNombreJugador()+": "+juego.getGanadasJugador()+"\n PC: "+juego.getGanadasPC()+"\n Empates: "+juego.getEmpates() );
                    break;

                case OPCION_INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"INSTRUCCIONES\n Las reglas del piedra, papel o tijera son milenarias \n tu oponente será la imbatible máquina!\n " +
                            "para poder ganarle deberás conocer las reglas elementales... \n \n La PIEDRA es fuerte contra TIJERA, pero pierde contra PAPEL \n  " +
                            "El PAPEL es poderoso contra la PIEDRA, pero débil contra el filo de las TIJERAS \n Las TIJERAS son fuertes contra el PAPEL, pero débiles contra la PIEDRA \n" +
                            "Recuerda si tu jugada es la misma que la de tu oponente, quedarán en EMPATE \n\n ¡BUENA SUERTE!");
                    break;
                case OPCION_CAMBIAR_NOMBRE:
                    juego.setNombreJugador(ingresarNombre());
                    juego.setGanadasJugador(0);
                    juego.setGanadasPC(0);
                    juego.setEmpates(0);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
    }

    //METODOSS
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
