package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaCadastroCobra;

public class TelaMenuCobraControlador implements ActionListener {

    JTextField opcaoRecebida;

    TelaCadastroCobra cadastroCobra= new TelaCadastroCobra();

    public TelaMenuCobraControlador(JTextField opcaoRecebida) {
        this.opcaoRecebida = opcaoRecebida;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2")) {
            switch (opcaoRecebida.getText()){
                case "1" : {
                    cadastroCobra.chamarTelaCadastroCobra();
                    break;
                }
                case "2" : {
                    break;
                }
                case "3" :{
                    System.exit(0);
                    break;
                }

            }
        }else {
            JOptionPane.showMessageDialog(null,"A opção " + opcaoRecebida.getText()+" não é válida");
        }

    }

}