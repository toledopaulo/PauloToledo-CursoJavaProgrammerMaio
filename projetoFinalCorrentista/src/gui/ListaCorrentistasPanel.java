package gui;

import entidade.Correntista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListaCorrentistasPanel extends JPanel {
    private JTextArea displayArea;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private ArrayList<Correntista> correntistas;

    public ListaCorrentistasPanel(CardLayout cardLayout, JPanel mainPanel, ArrayList<Correntista> correntistas, String backPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        this.correntistas = correntistas;

        setLayout(new BorderLayout());
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, backPanel));

        add(scrollPane, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
    }

    public void listarCorrentistas() {
        displayArea.setText("");
        for (Correntista c : correntistas) {
            displayArea.append(c.toString() + "\n");
        }
    }
}
