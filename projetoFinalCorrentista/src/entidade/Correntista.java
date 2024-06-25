package entidade;

public abstract class Correntista {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String email;
    private int qtdTransacao;
    private double valorDaAnuidade;

    public static class Endereco {
        private String cep;
        private String localidade;
        private String logradouro;
        private String uf;

        public Endereco(String cep, String localidade, String logradouro, String uf) {
            this.cep = cep;
            this.localidade = localidade;
            this.logradouro = logradouro;
            this.uf = uf;
        }

        @Override
        public String toString() {
            return logradouro + ", " + localidade + ", " + uf + ", " + cep;
        }
    }

    public Correntista(String nome, String cpf, Endereco endereco, String email, int qtdTransacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.qtdTransacao = qtdTransacao;
        this.valorDaAnuidade = calcularAnuidade();
    }

    public abstract double calcularAnuidade();

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Email: " + email +
                ", QtdTransacao: " + qtdTransacao + ", Anuidade: " + valorDaAnuidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public int getQtdTransacao() {
        return qtdTransacao;
    }

    public double getValorDaAnuidade() {
        return valorDaAnuidade;
    }
}