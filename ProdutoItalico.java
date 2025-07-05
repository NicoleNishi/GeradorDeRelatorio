public class ProdutoItalico extends ProdutoDecorator {
    public ProdutoItalico(Produto componente) {
        super(componente);
    }

    @Override
    public String formataParaImpressao() {
        return "<i>" + componente.formataParaImpressao() + "</i>";
    }
}
