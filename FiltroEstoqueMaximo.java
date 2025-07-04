public class FiltroEstoqueMaximo implements Filtro {
    private int limite;

    public FiltroEstoqueMaximo(int limite) {
        this.limite = limite;
    }

    @Override
    public boolean aplicar(Produto produto) {
        return produto.getQtdEstoque() <= limite;
    }
}