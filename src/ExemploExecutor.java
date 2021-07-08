import com.sun.source.doctree.ThrowsTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExemploExecutor {
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {


        Casa casa = new Casa(new Quarto());

        casa.obterAfazeres().forEach(atividade -> pessoasParaExecutarAtividade.execute(() -> atividade.realizar()));

        /* ou
        List<? extends Future<?>> afazeres = casa.obterAfazeres().stream().
                map(atividade -> pessoasParaExecutarAtividade.submit(() -> atividade.realizar())).
                collect(Collectors.toList());
         */

        pessoasParaExecutarAtividade.shutdown();

    }
}

class  Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeres() {
        return this.comodos.stream().map(Comodo::obterAfazeres)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade{
    void realizar();
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeres();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeres(){
        return Arrays.asList(
                this::arrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa);
    }

    private void arrumarCama() {
        System.out.println("Arrumando cama.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cama arrumada.");
    }

    private void varrerQuarto() {
        System.out.println("Varrendo o quarto.");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Quarto limpo.");
    }

    private void arrumarGuardaRoupa() {
        System.out.println("Arrumando o guarda-roupa.");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Guarda-roupa arrumado.");
    }
}