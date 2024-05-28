package entidade;

public abstract class Veiculo {

    private String marca; // Variaveis privadas
    private String modelo;
    private String cor;


    //Metodos de Acesso -> Encapsulamento
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }


    public Veiculo() {

    }

}