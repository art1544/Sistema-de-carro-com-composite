public class Peca implements ComponenteCarro {
    private String nome;
    private double valor;

    public Peca(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public void mostrarDetalhes(String indent) {
        System.out.println(indent + "Peça: " + nome + " - Valor: R$" + valor);
    }
}
