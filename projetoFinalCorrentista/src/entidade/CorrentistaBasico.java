package entidade;

public class CorrentistaBasico extends Correntista {
    public CorrentistaBasico(String nome, String cpf, Endereco endereco, String email, int qtdTransacao) {
        super(nome, cpf, endereco, email, qtdTransacao);
    }

    @Override
    public double calcularAnuidade() {
        return getQtdTransacao() * 0.5;
    }

    public double limiteDeSaque() {
        return 1000.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", LimiteDeSaque: " + limiteDeSaque();
    }
}
