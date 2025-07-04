import java.util.Comparator;

public class CrescComparadorDescricao implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return prod1.getDescricao().compareTo(prod2.getDescricao());
    }
}