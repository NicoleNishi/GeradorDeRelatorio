public class FiltroTodos implements Filtro {
    @Override
    public boolean aplicar(Produto produto) {
        return true; // Aceita todos os produtos
    }
}