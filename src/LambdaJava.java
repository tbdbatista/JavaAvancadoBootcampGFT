public class LambdaJava {
    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
            Lambda no Java
            Obedecem o conceito do paradigma funcional
            alta produtividade para lidar com objetos
----------------------------------------------------------------------------------------------------------------------*/
        Funcao geraSaida = valor -> valor;
        Funcao1 soma = (valor1, valor2) -> valor1 + valor2;
        System.out.println(soma.somar(1, 3));
        System.out.println(geraSaida.gerar("thiago"));

        //exemplo da aula usando lambda
        Funcao colocaPrefixoDoutor = valor -> "Dr. " + valor;
        System.out.println(colocaPrefixoDoutor.gerar("Thiago B. D. Batista"));

    }
}

@FunctionalInterface // protege pra não criar mais de 1 interface funcional
interface Funcao {
    String gerar(String valor);
}

interface Funcao1 {
    int somar(int x, int y);
}