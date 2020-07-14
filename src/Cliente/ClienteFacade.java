package Cliente;

/**
 *
 * @author 1191537827
 */
public class ClienteFacade {
    ClienteBO clienteBO = new ClienteBO();
    
    public void cadastrarCliente(ClienteVO cliente){
        clienteBO.cadastrar(cliente);
    }
    
    public int consultarCliente(String cpf){
        return clienteBO.consultar(cpf);
    }
    
    public int alterarCliente(int id){
        return clienteBO.alterar(id);
    }
    
    public int excluirCliente(int id){
        return clienteBO.excluir(id);
    }
    
    public String cliente(int i) {
        
        return clienteBO.getClienteDAO().listar(i);
        
    }

    public ClienteBO getClienteBO() {
        return clienteBO;
    }
    
    
}
