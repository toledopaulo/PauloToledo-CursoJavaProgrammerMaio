package entidade;

public class Atleta {
	public String nome;
	public Double salario;
	public Integer idade;
	public Integer qtdPartidas;
	
	
	// Constructor
	
	public Atleta(String nome, Integer idade, Integer qtdPartidas, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.qtdPartidas = qtdPartidas;
		this.salario = salario;
	}
	
	
}
