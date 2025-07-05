import java.util.Comparator;

public class DecrComparadorDescricao implements Comparator<Produto> {
    @Override
    public int compare(Produto prod1, Produto prod2) {
        return prod2.getDescricao().compareTo(prod1.getDescricao());
    }
}
