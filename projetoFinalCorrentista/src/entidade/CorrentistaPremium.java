package entidade;

public class CorrentistaPremium extends Correntista {
    private double limiteDeCredito;

    public CorrentistaPremium(String nome, String cpf, Endereco endereco, String email, int qtdTransacao, double limiteDeCredito) {
        super(nome, cpf, endereco, email, qtdTransacao);
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public double calcularAnuidade() {
        return getQtdTransacao() * 0.7;
    }

    @Override
    public String toString() {
        return super.toString() + ", LimiteDeCredito: " + limiteDeCredito;
    }
}