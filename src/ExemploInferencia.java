import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class ExemploInferencia {
    public static void main(String[] args) throws IOException {

        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();

        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
                regras var
                    NÃO PODE
                        ser usada em nível de classe
                        utilizar como parâmetro
                        ser utilizadas em variáveis locais não inicializadas
                    PODE
                        fazer inferência dentro de métodos
                        dentro de for
                        variáveis locais inicializadas
                        usar em try/catch
----------------------------------------------------------------------------------------------------------------------*/