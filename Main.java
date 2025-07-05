import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoNegrito(new ProdutoPadrao("Caneta", "Papelaria", 2.5, 10)));
        produtos.add(new ProdutoItalico(new ProdutoPadrao("Lápis", "Papelaria", 1.5, 20)));
        produtos.add(new ProdutoCor(new ProdutoPadrao("Borracha", "Papelaria", 3.0, 5), "red"));

        GeradorDeRelatorio gerador = new GeradorDeRelatorio(produtos);

        gerador.setAlgoritmoOrdenacao(new InsertionSort()); // ou new QuickSort()
        gerador.setCriterioOrdenacao(new ComparadorPorDescricao());
        gerador.setFiltro(new FiltroTodos());

        try {
            gerador.gerarRelatorio("relatorio.html");
            System.out.println("Relatório gerado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao gerar relatório: " + e.getMessage());
        }
    }
}
