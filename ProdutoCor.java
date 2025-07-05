public class ProdutoCor extends ProdutoDecorator {
    private String cor;

    public ProdutoCor(Produto componente, String cor) {
        super(componente);
        this.cor = cor;
    }

    @Override
    public String formataParaImpressao() {
        return "<font color=\"" + cor + "\">" + componente.formataParaImpressao() + "</font>";
    }
}