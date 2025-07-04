import java.util.Comparator;

public class ComparadorEstoque implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Integer.compare(prod1.getQtdEstoque(), prod2.getQtdEstoque());
    }
}