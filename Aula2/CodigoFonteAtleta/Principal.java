import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Atleta objetoAtleta = new Atleta(); 
    System.out.println("Digite o nome do atleta:");
    Scanner entradaDeDados = new Scanner(System.in);
    JogadorFutebol objJogadorDeFutebol = new JogadorFutebol();
    objJogadorDeFutebol.nomeAtleta = entradaDeDados.nextLine();

    System.out.println("Digite a idade do atleta: ");
    objJogadorDeFutebol.idade = Integer.parseInt(entradaDeDados.nextLine());
    System.out.println(objetoAtleta.idade);
    
    objJogadorDeFutebol.pernaMaisForte = entradaDeDados.nextLine();
    imprimir(objJogadorDeFutebol);
  }

  public static void imprimir(JogadorFutebol objJogadorFutebol) {
    System.out.println(objJogadorFutebol.nomeAtleta);
    System.out.println(objJogadorFutebol.pernaMaisForte);
    System.out.println(objJogadorFutebol.idade);
  }
}