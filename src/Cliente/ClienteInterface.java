package Cliente;

public interface ClienteInterface {
    public void cadastrar(ClienteVO clienteVO);
    public int consultar(String cpf);
    public int alterar(int id);
    public int excluir(int id);
}
