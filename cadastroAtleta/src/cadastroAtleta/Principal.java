package cadastroVeiculo;
import java.util.Scanner;
import entidade.Atleta;

public class Principal {
	public static void main(String[] args) {
		Atleta objetoAtleta = new Atleta();
		Scanner inserirDados = new Scanner(System.in);
		System.out.println("Informe o nome do atleta: ");
		objetoAtleta.nome = inserirDados.nextLine();
		System.out.println("Informe a idade do atleta: ");
		objetoAtleta.idade = Integer.parseInt(inserirDados.nextLine());
		System.out.println("Informe a quantidade de partidas do atleta: ");
		objetoAtleta.qtdPartidas = Integer.parseInt(inserirDados.nextLine());
		objetoAtleta.salario = calcularSalario(objetoAtleta.qtdPartidas);
		imprimirDadosAtleta(objetoAtleta);
	}
	
	public static Double calcularSalario(int qtdPartidas) {
		double salario = qtdPartidas * 54.50;
		
		return salario;
	}
	
	public static void imprimirDadosAtleta(Atleta objetoAtleta) {
		System.out.println("Nome do atleta> " + objetoAtleta.nome);
		System.out.println("Idade > " + objetoAtleta.idade);
		System.out.println("Salario > " + objetoAtleta.salario);
		System.out.println("Quantidade de partidas > " + objetoAtleta.qtdPartidas);
		
		}	
}	
