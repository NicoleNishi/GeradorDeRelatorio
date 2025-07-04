import java.util.Comparator;

public class DecComparadorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return Double.compare(prod2.getPreco(), prod1.getPreco());
    }
}