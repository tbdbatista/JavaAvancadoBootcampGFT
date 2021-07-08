public class ExemplosThread {
    public static void main(String[] args) {

/*----------------------------------------------------------------------------------------------------------------------
                Threads
                    Trabalha como um subsistema, dividindo os processos em duas ou mais tarefas
                    Essas tarefas múltiplas podem ser executadas simultaneamente para rodar mais rápido, principalmente
                    comparados a programas que são executados em um único bloco.
                Processamento síncrono
                    processos que ocorrem em sequência, respeitando uma fila
                    um processo deve terminar para que outro comece
                Processamento assíncrono
                    quando dois ou mais processos são realizados ao mesmo tempo
                    processos realizados de forma simultânea
----------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Loading .......");

        GeradorPdf gerarPdf = new GeradorPdf();
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento(gerarPdf);
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
        gerarPdf.start();
        barraDeCarregamento.run();


        barraDeCarregamento2.start();
        barraDeCarregamento3.start();

    }
}

class GeradorPdf extends Thread{


    @Override
    public void run() {
        System.out.println("Gerando PDF");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread gerarPdf;

    public BarraDeCarregamento(Thread gerarPdf) {
        this.gerarPdf = gerarPdf;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                if(!gerarPdf.isAlive()) break;
                System.out.println(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {
        super.run();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Carregando2: " + this.getName());
    }

}
class BarraDeCarregamento3 extends Thread{
    @Override
    public void run() {
        super.run();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Carregando3: " + this.getName());
    }

}
