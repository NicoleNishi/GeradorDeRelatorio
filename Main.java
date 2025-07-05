import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Carrega os produtos de um arquivo CSV
            List<Produto> produtos = LeitorDeCSV.carregarProdutos("produtos.csv");

            // Cria o gerador com os produtos carregados
            GeradorDeRelatorios gerador = new GeradorDeRelatorios(produtos);

            // Define estratégia de ordenação e filtro
            gerador.setAlgoritmoOrdenacao(new OrdQuickSort()); // ou InsertionSort()
            gerador.setCriterioOrdenacao(new CrescComparadorPreco()); // ou qualquer outro
            gerador.setFiltro(new FiltroTodos());

            // Gera o relatório HTML
            gerador.gerarRelatorio("relatorio.html");

            System.out.println("Relatório gerado com sucesso em 'relatorio.html'.");
        } catch (Exception e) {
            System.err.println("Erro ao executar o programa: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
