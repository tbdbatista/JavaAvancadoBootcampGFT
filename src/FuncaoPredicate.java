import java.util.function.Predicate;

public class FuncaoPredicate {
    public static void main(String[] args) {

        //Predicate<String> checaStringVazia = texto -> texto.isEmpty();
        Predicate<String> checaStringVazia = String::isEmpty;
        System.out.println(checaStringVazia.test(""));
        System.out.println(checaStringVazia.test("Cheia"));

    }
}
