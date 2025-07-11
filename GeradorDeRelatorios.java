import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GeradorDeRelatorios { 
    private List<Produto> produtos;
    private OrdAlgoritmo ordAlgoritmo;
    private Comparator<Produto> criterioOrdenacao;
    private Filtro filtro;

    public GeradorDeRelatorios(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setAlgoritmoOrdenacao(OrdAlgoritmo algoritmo) {
        this.ordAlgoritmo = algoritmo;
    }

    public void setCriterioOrdenacao(Comparator<Produto> criterio) {
        this.criterioOrdenacao = criterio;
    }

    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public void gerarRelatorio(String nomeArquivo) throws IOException {
        // Ordenação
        if (ordAlgoritmo != null && criterioOrdenacao != null) {
            ordAlgoritmo.ordenar(produtos, criterioOrdenacao);
        }

        // Filtragem
        List<Produto> produtosFiltrados = new ArrayList<>();
        for (Produto p : produtos) {
            if (filtro == null || filtro.aplicar(p)) {
                produtosFiltrados.add(p);
            }
        }

        // Geração do HTML
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("<html><body>\n");
            for (Produto p : produtosFiltrados) {
                writer.write(p.formataParaImpressao() + "<br/>\n");
            }
            writer.write("</body></html>\n");
        }
    }
}