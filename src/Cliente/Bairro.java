package Cliente;

import java.util.ArrayList;

/**
 *
 * @author 1191537827
 */
public class Bairro {
    private ArrayList<String> bairroLista;
    
    public Bairro() {
        this.bairroLista = new ArrayList();
    }
    
    public String cadastrar(String nome){
        bairroLista.add(nome);
        //System.out.println("Bairro cadastrado com sucesso!");
        return "";
    }
    
    public boolean consultar(String nome){
        for (int i=0; i<bairroLista.size(); i++){
            if (bairroLista.get(i).equals(nome)){
                //System.out.println("Bairro encontrado na posicão: "+i);
                return true;
            }
        }
        
        //System.out.println("Bairro não encontrado");
        return false;
    }
}
