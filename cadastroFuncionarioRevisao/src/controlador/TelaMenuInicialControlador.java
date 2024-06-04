package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaMenuGerente;

public class TelaMenuInicialControlador implements ActionListener {

	//Atributos da classe
	JTextField opcao;
	
	//Telas
	TelaMenuGerente telaMenuGerente = new TelaMenuGerente();
	
	
	public TelaMenuInicialControlador(JTextField opcao) {
		this.opcao = opcao;
	}

	@Override//Vamos entrar no polimorfismo
	public void actionPerformed(ActionEvent e) {
		
		if(opcao.getText().equals("1") || opcao.getText().equals("2") ) {
				switch (opcao.getText()) {
					case "1": {
						telaMenuGerente.chamarTelaMenuGerente();
						System.out.println("Direcione para tela do gerente");
						break;
						
					}
					case "2": {
						
						System.out.println("Direcione para tela do atendente");
						break;
					}
					case "3": {
							System.exit(0);
							break;
							
					}
					
				}
		}else {
			JOptionPane.showMessageDialog(null, "A opcão " + opcao.getText() +" Não é valida");
			
		}
		
	}

}
