import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner inputDados = new Scanner(System.in);
    Animal objetoAnimal = new Animal();
    System.out.println("Digite o nome do animal: ");
    objetoAnimal.nome = inputDados.nextLine();
    System.out.println("Digite a idade do animal: ");
    objetoAnimal.idade = Integer.parseInt(inputDados.nextLine());
    System.out.println("Nome do animal: " + objetoAnimal.nome);
    System.out.println("Idade do animal: " + objetoAnimal.idade);
  }
}
