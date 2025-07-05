public class ProdutoNegrito extends ProdutoDecorator {
    public ProdutoNegrito(Produto componente) {
        super(componente);
    }

    @Override
    public String formataParaImpressao() {
        return "<b>" + componente.formataParaImpressao() + "</b>";
    }
}