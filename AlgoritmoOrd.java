import java.util.Comparator;
import java.util.List;

public interface AlgoritmoOrd {
    void ordenar(List<Produto> produtos, Comparator<Produto> criterio);
}
