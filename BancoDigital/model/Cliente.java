package model;

public final class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String cpf, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public String getNome()     { return nome; }
    public String getCpf()      { return cpf; }

    private void setTelefone(String telefone) {
        if (telefone == null)
            throw new IllegalArgumentException("número telefone não pode ser null");
        this.telefone = telefone;
    }

    private void setEndereco(String endereco) {
        if (endereco == null)
            throw new IllegalArgumentException("número telefone não pode ser null");
        this.endereco = endereco;
    }

    private void setNome(String nome) {
        if (nome == null)
            throw new IllegalArgumentException("nome não pode ser null");
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        if (cpf == null)
            throw new IllegalArgumentException("cpf não pode ser null");
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("%nNome: %s%nCPF: %s%nEndereço: %s%nContacto: %s", getNome(), getCpf(), getEndereco(), getTelefone());
    }
}
