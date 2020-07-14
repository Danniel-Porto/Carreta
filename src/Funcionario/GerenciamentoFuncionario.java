/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Danniel
 */
public class GerenciamentoFuncionario {

    //Obs: estou utilizando o erro java.lang.NumberFormatException para 
    //verificar se o parametro do método é número ou texto como parametro
    //para a busca.
    private static List<Funcionario> lista = new ArrayList<>();

    //Método para inserção de Funcionario já instanciado no ArrayList.
    //A instanciação do funcionário deve ser feita antes do método.
    public static void incluir(Funcionario funcionario) {
        lista.add(funcionario);
    }

    /*
    Método para solicitar qualquer informação de qualquer funcionário
    utilizando o nome ou o cpf.
    Este método retorna um Int que representa o indice no ArrayList
    no qual o funcionário desejado está localizado.
    Para receber o endereço de "João" por exemplo:
    por nome:   lista.get(consultar("Joao")).getEndereco();
    ou por cpf: lista.get(consultar("14895432952")).getEndereco();
    
    **IMPORTANTE**: Fiz com que o método retorne o valor -1 para quando o 
    usuario não é encontrado. Tem que lembrar de tratar isso no front.
     */
    public static int consultar(String cpf) {
        for (Funcionario Funcionario : lista) {
            if (Funcionario.getCpf().equals(cpf)) {
                return lista.indexOf(Funcionario);
            }
        }

        return -1;
    }

    /*
    Método para substituir TODAS as informações de um funcionário pelo
    cpf ou nome (String busca) pelas informações de uma nova instancia
    de funcionário (Funcionario funcionario).
     */
    public static int alterar(int id) {
        
        for(Funcionario funcionario: lista){
            if(funcionario.getId() == id){
                return lista.indexOf(funcionario);              
            }
        }   
        return -1;
    }

   
    public static int excluir(int id) {
        for(Funcionario Funcionario: lista){
            if(Funcionario.getId() == id){
                lista.remove(lista.indexOf(Funcionario));
                return 1;
            }
        }   
        return -1;
    }

    /*
    Método para Validar existencia de funcionário por nome ou cpf.
    Retorna valor booleano.
    Exemplo: if (validar("Joao")) {...
     */
    public static boolean validar(String busca) {
        try {
            Integer.parseInt(busca);
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getCpf().equals(busca)) {
                    return true;
                }
            }
        } catch (java.lang.NumberFormatException falhaConversao) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNome().equals(busca)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String listar(int i) {

        String nome = lista.get(i).getNome();
        String bairro = lista.get(i).getBairro();
        int codigo = lista.get(i).getCodigo();
        String endereco = lista.get(i).getEndereco();
        double salario = lista.get(i).getSalario();
        String estado = lista.get(i).getUf();
        LocalDate data = lista.get(i).getDate();
        String cpf = lista.get(i).getCpf();
        String rg = lista.get(i).getRg();
        int id = lista.get(i).getId();
        String tipo = lista.get(i).getTipo();

        String info = "Tipo: " + tipo
                + "\nNome: " + nome
                + "\nData de admissão: " + data
                + "\nSalário: " + salario
                + "\nCPF: " + cpf
                + "\nBairro: " + bairro
                + "\nEndereço: " + endereco
                + "\nEstado: " + estado
                + "\nRG: " + rg
                + "\nCódigo: " + codigo
                + "\nID: " + id;

        return info;
    }

    public static List<Funcionario> getLista() {
        return lista;
    }

}
