public class Recursividade {
    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
                    Recursividade
                    Uma função chama a si mesma
                    Quantas vezes for necessário
----------------------------------------------------------------------------------------------------------------------*/

        System.out.println(fatorial(15));
        System.out.println(fatorialComTailCall(10, 1));

/*----------------------------------------------------------------------------------------------------------------------
                    Memorization
                    técnica de otimização que utiliza o cache para o resultado de uma função
                    Nas seguintes execuções a resposta é mais rápida, porque o valor já está armazenado no cache
----------------------------------------------------------------------------------------------------------------------*/

    }

    public static int fatorial (int value){
        if (value == 1){
            return value;
        }
        return value * fatorial(value - 1);
    }
/*----------------------------------------------------------------------------------------------------------------------
                    Exemplo com TailCall, mas o Java não executa sem empilhar
----------------------------------------------------------------------------------------------------------------------*/
    public static int fatorialComTailCall(int valor, int numero){
        if (valor == 1){
            return numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
/*----------------------------------------------------------------------------------------------------------------------
                    Tomar muito cuidado com recursividade, é muito fácil retornar um Erro de StackOverflow
                    ou mesmo ultrapassar o tamanho do numero que será retornado
----------------------------------------------------------------------------------------------------------------------*/

}
