import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {

        String[] nomes = {"João","Paulo","João","Oliveira","Santos","Instrutor"};
        Integer[] numeros = {1,2,3,4,5,6,7};
        imprimeNomesFiltrados(nomes);
        imprimeTodosNomes(nomes);
        imprimeTodosNomesString(nomes);
        imprimeDobroNumeros(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Professor");
        profissoes.add("Desenvolvedor");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");
        profissoes.add("Dentista");

        imprimeProfissoesGerente(profissoes);

    }

    private static void imprimeProfissoesGerente(List<String> profissoes) {
        profissoes.stream()
                .filter(prof -> (prof.startsWith("Gerente")))
                .forEach(System.out::println);
    }

    private static void imprimeNomesFiltrados(String... nomes){ // ou (String[] nomes)

        String nomesParaImpressao = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining(" - "));

        System.out.println(nomesParaImpressao);
    }

    private static void imprimeTodosNomesString(String... nomes){ // ou (String[] nomes)

        String nomesParaImpressao = Stream.of(nomes)
                .collect(Collectors.joining(" - "));

        System.out.println(nomesParaImpressao);

        //ou

        nomesParaImpressao = String.join(" - ", nomes);

        System.out.println(nomesParaImpressao);

    }

    private static void imprimeTodosNomes(String... nomes){ // ou (String[] nomes)
        Stream.of(nomes)
                .forEach(System.out::println);
    }

    private static void imprimeDobroNumeros(Integer... numeros){
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);
    }


}
