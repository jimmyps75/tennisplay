package pichincha.com;
import java.util.Scanner;

public class main {

    //declaration and instantiation
    public static void main( String[] args ) {
        String jugador = " ";
        boolean continuar;
        int jugadorPuntajeA = 0, jugadorPuntajeB = 0;
        int ar[]=new int[3];
        int a, b, c = 0;
        Scanner s;
        do {
            s = new Scanner( System.in );
            System.out.println("escribe el literal si el punto es para el jugador A o Jugador B");
            System.out.println("el punto es para el jugador:");
            jugador = s.nextLine();

            continuar = acumularPuntaje(ar, jugador);
            System.out.println("continuar:");

            continuar = s.nextBoolean();

        }while ( continuar);

    }

    public static boolean acumularPuntaje(int[] ar, String jugador){
        boolean respuesta;
        ar[2]=ar[2] + 1;
        switch(jugador) {
            case "A":
                ar[0]=ar[0] + 15;
                if (ar[0] == 45) {
                    ar[0] = 40;
                }
                break;
            case "B":
                ar[1]=ar[1] + 15;
                if (ar[1] == 45) {
                    ar[1] = 40;
                }
                break;
            default:
                // code block
        }

        System.out.println("puntuacion jugador A: " + ar[0]);
        System.out.println("puntuacion jugador B: " + ar[1]);
        respuesta = statusPlayers(ar);
        return respuesta;
    }

    public static boolean statusPlayers(int[] ar){

        if( (ar[0] == 40) && (ar[1] < 40) ){
            System.out.println("El jugador A: Win" + ar[0]);
            return false;
        }
        
        if( (ar[0] < 40) && (ar[1] == 40) ){
            System.out.println("El jugador B: Win" + ar[1]);
            return false;
        }

        if( (ar[0] == 40) && (ar[1] == 40) ){
            System.out.println("Los Jugadores estan: Deuce Jugador A:" + ar[0] + "Jugador B:" +ar[1]);
            return false;
        }
        return true;
    }


}
