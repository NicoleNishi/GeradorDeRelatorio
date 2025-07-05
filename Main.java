import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoNegrito(new ProdutoPadrao(1, "Caneta", "Papelaria", 2, 10.0)));
        produtos.add(new ProdutoItalico(new ProdutoPadrao(2, "Lápis", "Papelaria", 1, 20.0)));
        produtos.add(new ProdutoCor(new ProdutoPadrao(3, "Borracha", "Papelaria", 3, 5.0), "red"));

        GeradorDeRelatorios gerador = new GeradorDeRelatorios(produtos);

        gerador.setAlgoritmoOrdenacao(new OrdInsertionSort()); // ou new QuickSort()
        gerador.setCriterioOrdenacao(new CrescComparadorDescricao());
        gerador.setFiltro(new FiltroTodos());

        try {
            gerador.gerarRelatorio("relatorio.html");
            System.out.println("Relatório gerado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao gerar relatório: " + e.getMessage());
        }
    }
}
