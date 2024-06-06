import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class FabricaConexao {

    Scanner senhaInput = new Scanner(System.in);
    private static String USUARIO = "root"; // O usuario do banco
    private String SENHA = senhaInput.nextLine(); // A senha do banco
    private static String BANCO_URL = "jdbc:mysql://localhost:3306/exemplo?useTimezone=true&serverTimezone=UTC";//URL DO BANCO

    public Connection criarConexaoComBaseExemplo() {

        Connection conexaoBandoDadosExemplo = null;

        try {
            conexaoBandoDadosExemplo = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Conexão falhou.");

        }

        return conexaoBandoDadosExemplo;
    }







}
