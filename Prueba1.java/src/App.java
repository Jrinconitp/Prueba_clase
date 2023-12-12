import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int PreguntaPorHacer;
        int PreguntaRandom;
        String respuesta;

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        String[] preguntas = new String[10];

        preguntas[0] = "¿Qué país tiene la mayor superficie del mundo?";
        preguntas[1] = "¿Qué ciudad es la capital de Australia?";
        preguntas[2] = "¿Qué deporte practica el español Rafael Nadal?";
        preguntas[3] = "¿En qué año se celebraron los primeros Juegos Olímpicos de la era moderna?";
        preguntas[4] = "¿Qué instrumento musical tiene 88 teclas?";
        preguntas[5] = "¿Qué animal aparece en la bandera de Uganda?";
        preguntas[6] = "¿Qué rey francés fue conocido como el Rey Sol?";
        preguntas[7] = "¿Qué civilización antigua construyó la ciudad de Machu Picchu?";
        preguntas[8] = "¿Qué figura geométrica tiene cuatro lados iguales y cuatro ángulos rectos?";
        preguntas[9] = "¿Qué número se obtiene al multiplicar 9 por 9?";

        String[] respuestas = new String[10];

        respuestas[0] = "Rusia";
        respuestas[1] = "Canberra";
        respuestas[2] = "Tenis";
        respuestas[3] = "1896";
        respuestas[4] = "piano";
        respuestas[5] = "Grulla";
        respuestas[6] = "Luis XIV";
        respuestas[7] = "Inca";
        respuestas[8] = "81";
        respuestas[9] = "Cuadrado";

        System.out.println("Bienvenido al juego de las preguntas,¿Estas preparado?");
        System.out.println();

        System.out.println("¿Cuantas preguntas quieres hacer?");

        PreguntaPorHacer = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < PreguntaPorHacer; i++) {

            PreguntaRandom = rm.nextInt(0, 10);

            System.out.println(preguntas[PreguntaRandom]);

            System.out.print("Dime tu respusta ----> ");
            respuesta = sc.nextLine();
            
            if (respuesta.equals(respuestas[PreguntaRandom])) {
                System.out.println("HAS HACERTADO!!");
            }else{
                System.out.println("Has fallado :(");
            }

        }

        System.out.println();
        System.out.println("HAS TER,MINADO EL JUEGO!!");;

    }
}
