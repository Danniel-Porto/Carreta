package Cliente;

import java.util.ArrayList;

/**
 *
 * @author 1191537827
 */
public class Cidade {
    private ArrayList<String> cidadeLista;
    
    public Cidade() {
        this.cidadeLista = new ArrayList();
    }
    
    public String cadastrar(String nome){
        cidadeLista.add(nome);
        //System.out.println("Cidade cadastrada com sucesso!");
        return "OK";
    }
    
    public boolean consultar(String nome){
        for (int i=0; i<cidadeLista.size(); i++){
            if (cidadeLista.get(i).equals(nome)){
                //System.out.println("Cidade encontrada na posicão: "+i);
                return true;
            }
        }
        
        //System.out.println("Cidade não encontrada");
        return false;
    }
}
