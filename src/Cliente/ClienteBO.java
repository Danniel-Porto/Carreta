package Cliente;

import javax.swing.JOptionPane;

public class ClienteBO implements ClienteInterface{
    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteBO() {
    }
    
    public void cadastrar(ClienteVO clienteVO){
        // verificando se o cpf é válido (fluxo alternativo 4a)
        if (clienteVO.getCpf().length() != 14){
            JOptionPane.showMessageDialog(null, "CPF inválido", null, JOptionPane.PLAIN_MESSAGE);
        }
        
        // verificando se o bairro já está cadastrado (fluxo alternativo 4b)
        // e cadastra caso ainda não esteja cadastrado
        Bairro bairro = new Bairro();
        if (bairro.consultar(clienteVO.getBairro()) == false){
            bairro.cadastrar(clienteVO.getBairro());
        }
        
        // verificando se a cidade já está cadastrado (fluxo alternativo 4c)
        // e cadastra caso ainda não esteja cadastrado
        Cidade cidade = new Cidade();
        if (cidade.consultar(clienteVO.getCidade()) == false){
            cidade.cadastrar(clienteVO.getCidade());
        }
        
        // verificando se o estado já está cadastrado (fluxo alternativo 4d)
        // e cadastra caso ainda não esteja cadastrado
        Estado estado = new Estado();
        if (estado.consultar(clienteVO.getEstado()) == false){
            estado.cadastrar(clienteVO.getEstado());
        }
        
        clienteDAO.cadastrar(clienteVO);
        
    }
    
    public int consultar(String cpf){
        return clienteDAO.consultar(cpf);
    }
    
    public int alterar(int id){
        return clienteDAO.alterar(id);
    }
    
    public int excluir(int id){
        return clienteDAO.excluir(id);
    }

    public ClienteDAO getClienteDAO() {
        return clienteDAO;
    }
    
}
