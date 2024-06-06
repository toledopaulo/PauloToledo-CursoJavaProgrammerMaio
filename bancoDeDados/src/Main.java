import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main (String args[]){

        FabricaConexao conexao = new FabricaConexao();// Instancia a classe que contém o metodo que retorna o objeto de conexão


        Connection conexãoRecebida = conexao.criarConexaoComBaseExemplo();

        if (conexãoRecebida == null) {
            System.out.println("Conexão falhou!");
        }else {
            System.out.println("Conectado ao banco de dados!");
        }

    }

}
