import java.time.LocalDate;
import java.time.Period;

public class Bodas {
    public static void main(String[] args) {

        LocalDate casamento = LocalDate.parse("2012-07-06");
        LocalDate dataIncluida = LocalDate.parse("2022-11-30");

        int t2 = Period.between(casamento, dataIncluida).getYears();
        System.out.println("Anos entre o casamento e a data incluida: " + t2);

        switch (t2) {
            case 1:
                System.out.println("Feliz bodas de papel");
                break;
            case 5:
                System.out.println("Feliz bodas de madeira ou ferro");
                break;
            case 10:
                System.out.println("Feliz bodas de estanho");
                break;
            case 15:
                System.out.println("Feliz bodas de cristal");
                break;
            case 30:
                System.out.println("Feliz bodas de pérola");
                break;
            case 40:
                System.out.println("Feliz bodas de esmeralda");
                break;
            case 50:
                System.out.println("Feliz bodas de ouro");
                break;
            default:
                System.out.println("Sem comemoração para você");
        }
    }
}
