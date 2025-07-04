public class FiltroPrecoIntervalo implements Filtro {
    private double minimo;
    private double maximo;

    public FiltroPrecoIntervalo(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public boolean aplicar(Produto produto) {
        double preco = produto.getPreco();
        return preco >= minimo && preco <= maximo;
    }
}