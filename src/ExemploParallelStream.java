import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ExemploParallelStream {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(fatorial -> fatorial(fatorial)); // Serial stream
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial= " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(fatorial -> fatorial(fatorial)); // Parallel stream
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel = " + (fim - inicio));


        List<String> nomes = Arrays.asList("Thiago", "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Ricardo",
                "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Thiago",
                "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Ricardo",
                "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Thiago",
                "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Ricardo",
                "Pedro", "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio", "Pedro",
                "João", "Lucas", "Felipe", "Henrique", "Matheus",
                "Claudio", "Amadeus", "Vitor", "Viniscius", "Moraes", "Moreira", "José", "Luiz", "Renato", "Rafael",
                "Mathias", "Guilherme", "Fernando", "Denis", "Roberto", "Geraldo", "Adilson", "Paulo", "Bartolomeu",
                "Francisco", "Carlos", "Cassio", "Murilo", "André", "Antonio", "Bruno", "Romeu", "Dionizio");

        inicio = System.currentTimeMillis();
        nomes.forEach(System.out::print);
        fim = System.currentTimeMillis();
        System.out.println("\n Tempo de execução Serial = " + (fim - inicio));

        inicio = System.currentTimeMillis();
        nomes.parallelStream().forEach(System.out::print);
        fim = System.currentTimeMillis();
        System.out.println("\n Tempo de execução Parallel = " + (fim - inicio));


    }

    public static long  fatorial(long numero){
        long fatorial = 1;

        for(long i=2; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

}
