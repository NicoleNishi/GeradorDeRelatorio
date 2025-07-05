import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {

    public static List<Produto> carregarProdutos(String caminhoArquivo) {
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            // Pula o cabeçalho, se houver
            if ((linha = br.readLine()) != null && linha.contains("id")) {
                // pula cabeçalho
            } else {
                // se não houver cabeçalho, processa essa linha também
                produtos.add(linhaParaProduto(linha));
            }

            while ((linha = br.readLine()) != null) {
                produtos.add(linhaParaProduto(linha));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }

        return produtos;
    }

    private static Produto linhaParaProduto(String linha) {
        // Exemplo de linha: 1,Caneta,Papelaria,2.5,100
        String[] partes = linha.split(",");

        int id = Integer.parseInt(partes[0]);
        String descricao = partes[1];
        String categoria = partes[2];
        double preco = Double.parseDouble(partes[3]);
        int qtdEstoque = Integer.parseInt(partes[4]);

        return new ProdutoPadrao(id, descricao, categoria, qtdEstoque, preco);
    }
}