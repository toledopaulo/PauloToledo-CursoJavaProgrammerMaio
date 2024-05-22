import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner inserirDados = new Scanner(System.in);
    Animal objetoAnimal = new Animal();
    Galinha objetoGalinha = new Galinha();
    Cachorro objetoCachorro = new Cachorro();

    System.out.println("Nome da galinha: ");
    objetoGalinha.nome = inserirDados.nextLine();
    System.out.println("Idade da galinha: ");
    objetoGalinha.idade = Integer.parseInt(inserirDados.nextLine());
    System.out.println("Cor da pena da galinha: ");
    objetoGalinha.corPena = inserirDados.nextLine();
    System.out.println("Nome do cachorro: ");
    objetoCachorro.nome = inserirDados.nextLine();
    System.out.println("Idade do cachorro: ");
    objetoCachorro.idade = Integer.parseInt(inserirDados.nextLine());
    System.out.println("Cor do pelo do cachorro: ");
    objetoCachorro.corPelo = inserirDados.nextLine();
    imprimirInfoGalinha(objetoGalinha);
    imprimirInfoCachorro(objetoCachorro);
  }

  public static void imprimirInfoGalinha(Galinha objetoGalinha) {
    System.out.println("Nome Galinha > " + objetoGalinha.nome);
    System.out.println("Idade Galinha > " + objetoGalinha.idade);
    System.out.println("Cor da Pena > " + objetoGalinha.corPena);
    System.out.println();
  }

  public static void imprimirInfoCachorro(Cachorro objetoCachorro) {
    System.out.println("Nome Cachorro > " + objetoCachorro.nome);
    System.out.println("Idade Cachorro > " + objetoCachorro.idade);
    System.out.println("Cor do Pelo > " + objetoCachorro.corPelo);
    System.out.println();
  }
}
