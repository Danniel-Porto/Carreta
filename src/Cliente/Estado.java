package Cliente;

import java.util.ArrayList;

/**
 *
 * @author 1191537827
 */
public class Estado {
    private ArrayList<String> estadoLista;
    
    public Estado() {
        this.estadoLista = new ArrayList();
    }
    
    public String cadastrar(String nome){
        estadoLista.add(nome);
        //System.out.println("Estado cadastrado com sucesso!");
        return "OK";
    }
    
    public boolean consultar(String nome){
        for (int i=0; i<estadoLista.size(); i++){
            if (estadoLista.get(i).equals(nome)){
                //System.out.println("Estado encontrado na posicão: "+i);
                return true;
            }
        }
        
        //System.out.println("Estado não encontrado");
        return false;
    }
}
