import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeCSV {

    public static List<Produto> carregarProdutos(String caminhoArquivo) throws IOException {
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue; // pula o cabeçalho
                }

                String[] campos = linha.split(",");
                if (campos.length < 8) continue; // pula linhas incompletas

                int id = Integer.parseInt(campos[0].trim());
                String descricao = campos[1].trim();
                String categoria = campos[2].trim();
                int qtdEstoque = Integer.parseInt(campos[3].trim());
                double preco = Double.parseDouble(campos[4].trim());

                boolean negrito = Boolean.parseBoolean(campos[5].trim());
                boolean italico = Boolean.parseBoolean(campos[6].trim());
                String cor = campos[7].trim();

                Produto produto = new ProdutoPadrao(id, descricao, categoria, qtdEstoque, preco);

                if (!cor.equalsIgnoreCase("null") && !cor.isEmpty()) {
                    produto = new ProdutoCor(produto, cor);
                }
                if (italico) {
                    produto = new ProdutoItalico(produto);
                }
                if (negrito) {
                    produto = new ProdutoNegrito(produto);
                }

                produtos.add(produto);
            }
        }

        return produtos;
    }
}