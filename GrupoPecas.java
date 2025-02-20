import java.util.ArrayList;
import java.util.List;

public class GrupoPecas implements ComponenteCarro {
    protected String nome;
    private List<ComponenteCarro> componentes = new ArrayList<>();

    public GrupoPecas(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteCarro componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteCarro componente) {
        componentes.remove(componente);
    }

    @Override
    public double getValor() {
        double total = 0;
        for (ComponenteCarro componente : componentes) {
            total += componente.getValor();
        }
        return total;
    }

    @Override
    public void mostrarDetalhes(String indent) {
        System.out.println(indent + "Grupo: " + nome);
        for (ComponenteCarro componente : componentes) {
            componente.mostrarDetalhes(indent + "\t");
        }
        System.out.println(indent + "Subtotal do grupo '" + nome + "': R$" + getValor());
    }
}
