import java.util.function.Function;

public class FuncaoFunction {
    public static void main(String[] args) {

        Function<String, String> retornaNomeInvertido = texto -> new StringBuilder(texto).reverse().toString();
        //necessita retorno obrigatoriamente
        System.out.println(retornaNomeInvertido.apply("Socorram-me subino onibus em-marrocoS"));

    }
}
