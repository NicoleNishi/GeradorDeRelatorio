public abstract class ProdutoDecorator implements Produto {
    protected Produto componente;

    public ProdutoDecorator(Produto componente) {
        this.componente = componente;
    }

    @Override
    public String getDescricao() {
        return componente.getDescricao();
    }

    @Override
    public String getCategoria() {
        return componente.getCategoria();
    }

    @Override
    public double getPreco() {
        return componente.getPreco();
    }

    @Override
    public int getQtdEstoque() {
        return componente.getQtdEstoque();
    }
}
