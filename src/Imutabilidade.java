import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor =20;

        UnaryOperator<Integer> dobraValor = (valorus) -> valorus * 2;

        System.out.println("dobra valor " + dobraValor.apply(valor));
        System.out.println("valor original " + valor);
        // imutabilidade --> o valor não muda, mesmo assim temos o valor dele dobrado na saída anterior
    }
}
