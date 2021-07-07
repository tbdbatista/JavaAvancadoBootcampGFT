import java.util.*;

public class OrdemParImpar {
    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);
        LinkedList<Integer> listaPar = new LinkedList<>();
        LinkedList<Integer> listaImpar = new LinkedList<>();

        int a = leitor.nextInt();

        for(int i = 0; i < a; i++){
            int b = leitor.nextInt();
            if(b % 2 == 0) {
                listaPar.add(b);
            } else {
                listaImpar.add(b);
            }
        }
        Collections.sort(listaPar);
        Collections.sort(listaImpar, Collections.reverseOrder());

        for (int par : listaPar) System.out.println(par);
        for (int impar : listaImpar) System.out.println(impar);

    }
}