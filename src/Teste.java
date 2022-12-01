interface Strategy{
    double apply (double a, double b);
}

class Maximo implements Strategy{
    @Override
    public double apply(double a, double b) {
        return a > b ? a:b;
    }
}

class Minimo implements Strategy {
    @Override
    public double apply(double a, double b) {
        return a<b ? a:b;
    }
}
class Context{
    private final Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double execute (double a, double b){
        return strategy.apply(a,b);
    }
}
public class Teste {
    public static void main(String[] args) {

        Maximo maximo = new Maximo();
        Context context = new Context(maximo);
        System.out.println("O máximo de dois números: " + context.execute(4.0,5.0));

        System.out.println("O mínimo de dois números: "+new Context(new Minimo()).execute(4.0,5.0));
        System.out.println("A soma de dois números: "+ new Context((double a, double b) -> a+b).execute(10.0, 8.0));
        System.out.println("A subtração de dois números: " + new Context((a, b) -> a+b).execute(10.0, 8.0));
        System.out.println("A média de dois números: " + new Context((a, b) -> (a+b)/2).execute(30.0, 6.0));
        System.out.println("A soma de dois números: "+ new Context(Double::sum).execute(20.0, 18.0));
    }
}