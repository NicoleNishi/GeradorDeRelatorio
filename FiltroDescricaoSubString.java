public class FiltroDescricaoSubString implements Filtro {
    private String trecho;

    public FiltroDescricaoSubString(String trecho) {
        this.trecho = trecho.toLowerCase();
    }

    @Override
    public boolean aplicar(Produto produto) {
        return produto.getDescricao().toLowerCase().contains(trecho);
    }
}