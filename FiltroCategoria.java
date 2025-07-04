public class FiltroCategoria implements Filtro {
    private String categoria;

    public FiltroCategoria (String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean aplicar(Produto produto) {
        return produto.getCategoria().equalsIgnoreCase(categoria);
    }
}