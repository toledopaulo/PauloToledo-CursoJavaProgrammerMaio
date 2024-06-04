package entidade;

public abstract class Animal {

    private String Nome;
    private String Idade;
    private double preco;
    private String Peso;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getIdade() {
        return Idade;
    }
    public void setIdade(String idade) {
        Idade = idade;
    }
    public String getPreco() {
        String novoPreco  = Double.parseDouble(preco);
        return novoPreco;
    }
    public void setPreco(String preco) {
        this.preco = Double.parseDouble(preco);
    }
    public String getPeso() {
        return Peso;
    }
    public void setPeso(String peso) {
        Peso = peso;
    }





}