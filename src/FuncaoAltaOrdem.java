public class FuncaoAltaOrdem {
    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
            Funções de alta ordem
            são funções que retornam uma outra função ou que recebem uma função como parâmetro
----------------------------------------------------------------------------------------------------------------------*/

        double aA = 0.5;
        double bB = 4d;

        Calculo soma = (a, b) -> a + b;
        Calculo subtrai = (a, b) -> a - b;
        Calculo divide = (a, b) -> a / b;
        Calculo multiplica = (a, b) -> a * b;
        Calculo potencia = (a, b) -> {
            if (b == 0) return 1;
            double resultado = a;
            for (int i = 1; i < b; i++){
                resultado = resultado * a;
            }
            return resultado;
        };


        System.out.println("Soma " + aA + " + " + bB + " = " + executaCalculo(soma, aA, bB));
        System.out.println("Subtração " + aA + " - " + bB + " = " + executaCalculo(subtrai, aA, bB));
        System.out.println("Divisão " + aA + " / " + bB + " = " + executaCalculo(divide, aA, bB));
        System.out.println("Multiplicação " + aA + " * " + bB + " = " + executaCalculo(multiplica, aA, bB));
        System.out.println("Potência de " + aA + " elevado a " + bB + " = " + executaCalculo(potencia, aA, bB));

    }
    public static double executaCalculo(Calculo executa, double a, double b){
        return executa.calcular(a, b);
    }
}
@FunctionalInterface
interface Calculo {
    public double calcular(double a, double b);
}