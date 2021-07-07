import java.util.function.Consumer;

public class FuncaoConsumer {
    public static void main(String[] args) {

        //Consumer<String> imprimeFrase = frase -> System.out.println(frase);

        Consumer<String> imprimeFrase = System.out::println;
        imprimeFrase.accept("Hello World!");

    }
}
