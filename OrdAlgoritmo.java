import java.util.Comparator;
import java.util.List;

public interface OrdAlgoritmo {
    void ordenar(List<Produto> produtos, Comparator<Produto> criterio);
}
