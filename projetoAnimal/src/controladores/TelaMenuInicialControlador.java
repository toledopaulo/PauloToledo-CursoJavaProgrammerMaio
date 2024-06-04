package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaMenuCachorro;
import tela.TelaMenuCobra;

public class TelaMenuInicialControlador implements ActionListener {

    JTextField opcao;

    TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
    TelaMenuCobra telaMenuCobra = new TelaMenuCobra();

    public TelaMenuInicialControlador(JTextField opcao) {
        this.opcao = opcao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(opcao.getText().equals("1") || opcao.getText().equals("2")) {

            switch (opcao.getText()) {
                case "1" : {
                    telaMenuCachorro.chamarTelaMenuCachorro();
                    break;
                }
                case "2" : {
                    telaMenuCobra.chamarTelaMenuCobra();
                    break;
                }
                case "3" : {
                    System.exit(0);
                    break;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"A opção "+ opcao.getText() + "Não é valida");

        }

    }

}