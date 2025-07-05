import java.util.Comparator;
import java.util.List;

public class OrdInsertionSort implements OrdAlgoritmo{
    @Override
    public void ordenar(List<Produto> produtos, Comparator<Produto> criterio) {
        for (int i = 1; i < produtos.size(); i++) {
            Produto chave = produtos.get(i);
            int j = i - 1;
            while (j >= 0 && criterio.compare(produtos.get(j), chave) > 0) {
                produtos.set(j + 1, produtos.get(j));
                j--;
            }
            produtos.set(j + 1, chave);
        }
    }
}
