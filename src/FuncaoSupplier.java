import java.util.function.Supplier;

public class FuncaoSupplier {
    public static void main(String[] args) {

        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        System.out.println(instanciaPessoa.get());


    }
}

class Pessoa {
    private Integer idade;
    private String nome;

    public Pessoa() {
        this.idade = 25;
        this.nome = "João";
    }

    @Override
    public String toString() {
        return "idade= " + idade + ", nome= " + nome;
    }
}