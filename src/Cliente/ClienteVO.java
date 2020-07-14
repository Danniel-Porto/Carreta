package Cliente;

public class ClienteVO {
    private String cpf;
    private String rg;
    private String nome;
    private String endereco;
    private String estado;
    private String bairro;
    private String cidade;
    private String tipo;
    private int id = (int)(Math.random() * (999999999 - 0 + 1) + 0); // gera um id para o cliente, intervalo entre 0 e 999999999;

    public ClienteVO(String cpf, String rg, String nome, String endereco, String estado, String bairro, String cidade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.bairro = bairro;
        this.cidade = cidade;
        this.tipo = "Cliente";
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}
