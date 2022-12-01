import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a letra A para começar o cronometro");
        String letra = sc.next().toUpperCase();
        LocalDateTime a = LocalDateTime.now();

        System.out.println("Digite a letra B para parar o cronometro");
        String letra1 = sc.next().toUpperCase();
        LocalDateTime b = LocalDateTime.now();

        Long t1 = Duration.between(a, b).toMillis();
        System.out.println("Milissegundos passados: " + t1);
    }
    /*private static int apertouBotao (){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a letra A para começar o cronometro");
        String letra = sc.next().toUpperCase();
        LocalDateTime a = LocalDateTime.now();
       if (letra.equals("A")) {
            a = LocalDateTime.now();
        } else {
            System.out.println("Digitou incorretamente, vamos começar novamente");
            apertouBotao();
        }

        System.out.println("Digite a letra B para parar o cronometro");
        String letra1 = sc.next().toUpperCase();
        LocalDateTime b = LocalDateTime.now();
        if (letra1.equals("B")) {
            System.out.println("Digite a letra B para parar o cronometro");
            b = LocalDateTime.now();
        } else {
            System.out.println("Digitou incorretamente, vamos começar novamente");
            apertouBotao();
        }



    }*/
}
