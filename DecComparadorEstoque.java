import java.util.Comparator;

public class DecComparadorEstoque implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Integer.compare(prod2.getQtdEstoque(), prod1.getQtdEstoque());
    }
}