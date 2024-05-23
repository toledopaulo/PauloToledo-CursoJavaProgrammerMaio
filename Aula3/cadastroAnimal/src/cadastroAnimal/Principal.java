package cadastroAnimal;
import entidade.Animal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Animal objetoAnimal = new Animal();
		Scanner inserirDados = new Scanner(System.in);
		System.out.println("Insira o nome do animal: ");
		objetoAnimal.nome = inserirDados.nextLine();
		System.out.println("Insira a idade do animal: ");
		objetoAnimal.idade = Integer.parseInt(inserirDados.nextLine());
		System.out.println("Insira o peso do animal em kg: ");
		objetoAnimal.peso = Float.parseFloat(inserirDados.nextLine());
		objetoAnimal.preco = calcularPrecoAnimal(objetoAnimal);
		imprimirInformacaoAnimal(objetoAnimal);
	}
	
	public static Double calcularPrecoAnimal(Animal objetoAnimal) {
		Double precoAnimal = objetoAnimal.peso * 50.0;
		
		return precoAnimal;
	}
	
	public static void imprimirInformacaoAnimal(Animal animal) {
		System.out.println("Nome do animal >" + animal.nome);
		System.out.println("Idade > " + animal.idade);
		System.out.println("Peso > " + animal.peso);
		System.out.println("Preço > R$" + animal.preco);
	}
}
