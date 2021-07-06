import java.util.Arrays;

public class ParadigmaFuncional {
    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
            Paradigma Funcional no Java
            Funções e imutabilidade em Paradigma Funcional
            Lambda no Java
            Recursividade
----------------------------------------------------------------------------------------------------------------------*/
            // Comparando paradigma funcional X imperativo //

        int[] valores = {1, 2, 3, 4, 5, 6};

        //fucional
        Arrays.stream(valores).filter(numero -> numero % 2 == 0).map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        Arrays.stream(valores).filter(numero -> numero % 2 == 0).map(numero -> numero * 2)
                .forEach(System.out::println);

        //imperativo
        for (int valor : valores) {
            if (valor % 2 == 0) System.out.println(valor * 2);
        }








    }
}
