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

    @Override
    public int getId() {
        return componente.getId();
    }

    @Override
    public void setQtdEstoque(int qtd) {
        componente.setQtdEstoque(qtd);
    }

    @Override
    public void setPreco(double preco) {
        componente.setPreco(preco);
    }
}