import java.util.Comparator;
import java.util.List;

public class OrdQuickSort implements OrdAlgoritmo {
    @Override
    public void ordenar(List<Produto> produtos, Comparator<Produto> criterio) {
        quickSort(produtos, criterio, 0, produtos.size() - 1);
    }

    private void quickSort(List<Produto> produtos, Comparator<Produto> criterio, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particiona(produtos, criterio, inicio, fim);
            quickSort(produtos, criterio, inicio, pivo - 1);
            quickSort(produtos, criterio, pivo + 1, fim);
        }
    }

    private int particiona(List<Produto> produtos, Comparator<Produto> criterio, int inicio, int fim) {
        Produto pivo = produtos.get(fim);
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (criterio.compare(produtos.get(j), pivo) <= 0) {
                i++;
                troca(produtos, i, j);
            }
        }
        troca(produtos, i + 1, fim);
        return i + 1;
    }

    private void troca(List<Produto> produtos, int i, int j) {
        Produto temp = produtos.get(i);
        produtos.set(i, produtos.get(j));
        produtos.set(j, temp);
    }
}
