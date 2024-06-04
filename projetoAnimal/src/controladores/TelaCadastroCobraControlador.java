package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidade.Cobra;
import gerenciaArquivo.ManipuladorArquivo;

public class TelaCadastroCobraControlador implements ActionListener {


    JTextField caixaTextoPrimeiroCampoRecebidoNome;
    JTextField caixaTextoSegundoCampoRecebidoCaf;
    JTextField caixaTextoTerceiroCampoRecebidoCorPelo;

    ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();

    public TelaCadastroCobraControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
                                        JTextField caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoCorPelo) {

        this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
        this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
        this.caixaTextoTerceiroCampoRecebidoCorPelo = caixaTextoTerceiroCampoRecebidoCorPelo;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        registrarArquivo();
        System.out.println("Cobra registrada, arquivo txt editado!");
    }

    public void registrarArquivo() {
        Cobra cobra = new Cobra();
        cobra.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
        cobra.setCAF(caixaTextoSegundoCampoRecebidoCaf.getText());
        cobra.setTipoVeneno(caixaTextoTerceiroCampoRecebidoCorPelo.getText());

        manipuladorArquivo.registrarCobra(cobra);
    }
}