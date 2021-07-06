import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {


        BiPredicate<Integer, Integer> verificaSeMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificaSeMaior.test(2,4));
        System.out.println(verificaSeMaior.test(9,7));
        System.out.println(verificaSeMaior.test(8,4));

    }
}
