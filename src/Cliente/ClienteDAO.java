package Cliente;

import java.util.ArrayList;

public class ClienteDAO implements ClienteInterface{
    private final ArrayList<ClienteVO> clienteLista;

    public ClienteDAO() {
        this.clienteLista = new ArrayList();
    }
    
    @Override
    public void cadastrar(ClienteVO clienteVO){
        clienteLista.add(clienteVO);
        //System.out.println("Cliente cadastrado com sucesso!");
    }
    
    @Override
    public int consultar(String cpf){
        for (ClienteVO ClienteVO: this.clienteLista){
            if (ClienteVO.getCpf().equals(cpf)){
                //System.out.println("Cliente encontrado na posicão: "+i);
                return clienteLista.indexOf(ClienteVO);
            }
        }
        
        //System.out.println("Cliente não encontrado para o cpf informado!");
        return -1;
    }
    
    @Override
    public int alterar(int id){
    
        for(ClienteVO clienteVO: this.clienteLista){
            if(clienteVO.getId() == id){
                
                return this.clienteLista.indexOf(clienteVO);              
            }
        }
        return -1;
    }
    
    
    @Override
    public int excluir(int id){
        for(ClienteVO clienteVO: this.clienteLista){
            if(clienteVO.getId() == id){
                this.clienteLista.remove(this.clienteLista.indexOf(clienteVO));
                //System.out.println("Cliente removido com sucesso!");
                return 1;
            }
        }   
        return -1;
    }
    
      public String listar(int i) {
        String bairro = clienteLista.get(i).getBairro();
        String cidade = clienteLista.get(i).getCidade();
        String cpf = clienteLista.get(i).getCpf();
        String endereco = clienteLista.get(i).getEndereco();
        String estado =  clienteLista.get(i).getEstado();
        String rg = clienteLista.get(i).getRg();
        String nome = clienteLista.get(i).getNome();
        int id =clienteLista.get(i).getId();
        String tipo = clienteLista.get(i).getTipo();
        
        String info = "Tipo: " + tipo
                +       "\nNome: " + nome
                +      "\nCidade: " + cidade
                +      "\nCPF: " + cpf
                +       "\nBairro: " + bairro
                +       "\nEndereço: " + endereco
                +       "\nEstado: " + estado
                +       "\nRG: " + rg
                +       "\nID: " + id;
        
        return info;
    }

    public ArrayList<ClienteVO> getClienteLista() {
        return clienteLista;
    }
    
}
