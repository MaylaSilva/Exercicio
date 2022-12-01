import java.time.Duration;
import java.time.LocalTime;

public class BancoDeHoras {
    public static void main(String[] args) {

        String entradaDados = "08:01 12:11   | 14:03 18:12"
                .replace("|","")
                .replace("  "," ");
        String[] horarios = entradaDados.split(" ");

        LocalTime[] e = new LocalTime[entradaDados.length()];


        for (int i = 0; i<horarios.length;i++){
                e[i] = LocalTime.parse(horarios[i]);
        }

//        LocalTime entrada1 = LocalTime.of(7,55);
//        LocalTime saida1 = LocalTime.of(11,55);
        Long t1 = Duration.between(e[0],e[1]).toMinutes();
        System.out.println(t1);

//        LocalTime entrada2 = LocalTime.of(13,54);
//        LocalTime saida2 = LocalTime.of(17,58);
        Long t2 = Duration.between(e[3],e[4]).toMinutes();
        System.out.println(t2);

        long soma = t1 + t2;
        System.out.println(soma);

        if (soma >= 470){
            System.out.println("Trabalhou corretamente");
        } else {
            System.out.println("Trabalhou a menos, será descontado");
        }
    }
}