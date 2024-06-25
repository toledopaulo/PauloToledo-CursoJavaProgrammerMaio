package gui;

import entidade.Correntista;
import entidade.CorrentistaBasico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CorrentistaBasicoPanel extends JPanel {
    private ArrayList<Correntista> correntistasBasico;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public CorrentistaBasicoPanel(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        this.correntistasBasico = new ArrayList<>();

        setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(16, 1));
        JTextField nomeField = new JTextField();
        JTextField cpfField = new JTextField();
        JTextField cepField = new JTextField();
        JTextField localidadeField = new JTextField();
        JTextField logradouroField = new JTextField();
        JTextField ufField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField qtdTransacaoField = new JTextField();

        formPanel.add(new JLabel("Nome:"));
        formPanel.add(nomeField);
        formPanel.add(new JLabel("CPF:"));
        formPanel.add(cpfField);
        formPanel.add(new JLabel("CEP:"));
        formPanel.add(cepField);
        formPanel.add(new JLabel("Localidade:"));
        formPanel.add(localidadeField);
        formPanel.add(new JLabel("Logradouro:"));
        formPanel.add(logradouroField);
        formPanel.add(new JLabel("UF:"));
        formPanel.add(ufField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Qtd Transacao:"));
        formPanel.add(qtdTransacaoField);

        JButton addButton = new JButton("Adicionar");
        JButton editButton = new JButton("Editar");
        JButton deleteButton = new JButton("Deletar");
        JButton listButton = new JButton("Listar");
        JButton backButton = new JButton("Voltar");

        formPanel.add(addButton);
        formPanel.add(editButton);
        formPanel.add(deleteButton);
        formPanel.add(listButton);
        formPanel.add(backButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCorrentista(nomeField, cpfField, cepField, localidadeField, logradouroField, ufField, emailField, qtdTransacaoField);
            }
        });

        editButton.addActionListener(e -> editarCorrentista());
        deleteButton.addActionListener(e -> deletarCorrentista());
        listButton.addActionListener(e -> cardLayout.show(mainPanel, "ListarBasico"));
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Seleção"));

        add(formPanel, BorderLayout.CENTER);
    }

    private void adicionarCorrentista(JTextField nomeField, JTextField cpfField, JTextField cepField, JTextField localidadeField, JTextField logradouroField, JTextField ufField, JTextField emailField, JTextField qtdTransacaoField) {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String cep = cepField.getText();
        String localidade = localidadeField.getText();
        String logradouro = logradouroField.getText();
        String uf = ufField.getText();
        String email = emailField.getText();
        int qtdTransacao = Integer.parseInt(qtdTransacaoField.getText());
        Correntista.Endereco endereco = new Correntista.Endereco(cep, localidade, logradouro, uf);

        CorrentistaBasico correntista = new CorrentistaBasico(nome, cpf, endereco, email, qtdTransacao);
        correntistasBasico.add(correntista);

        limparCampos(nomeField, cpfField, cepField, localidadeField, logradouroField, ufField, emailField, qtdTransacaoField);
    }

    private void editarCorrentista() {
        JOptionPane.showMessageDialog(this, "Funcionalidade de edição ainda não implementada");
    }

    private void deletarCorrentista() {
        JOptionPane.showMessageDialog(this, "Funcionalidade de deleção ainda não implementada");
    }

    private void limparCampos(JTextField nomeField, JTextField cpfField, JTextField cepField, JTextField localidadeField, JTextField logradouroField, JTextField ufField, JTextField emailField, JTextField qtdTransacaoField) {
        nomeField.setText("");
        cpfField.setText("");
        cepField.setText("");
        localidadeField.setText("");
        logradouroField.setText("");
        ufField.setText("");
        emailField.setText("");
        qtdTransacaoField.setText("");
    }

    public ArrayList<Correntista> getCorrentistasBasico() {
        return correntistasBasico;
    }
}
