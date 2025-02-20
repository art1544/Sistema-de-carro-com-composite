public interface ComponenteCarro {
    double getValor();
    void mostrarDetalhes(String indent);

    default void mostrarDetalhes() {
        mostrarDetalhes("");
    }
}
