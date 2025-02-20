public class Carro extends GrupoPecas {

    public Carro(String nome) {
        super(nome);
    }
    
    @Override
    public void mostrarDetalhes(String indent) {
        System.out.println(indent + "Detalhes do " + nome + ":");
        super.mostrarDetalhes(indent);
    }
}
