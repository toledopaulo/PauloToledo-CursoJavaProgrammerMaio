package gui;

import javax.swing.*;
import java.awt.*;

public class SelecionarTipoCorrentistaPanel extends JPanel {
    public SelecionarTipoCorrentistaPanel(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new GridLayout(3, 1));

        JButton basicoButton = new JButton("Correntista Básico");
        JButton premiumButton = new JButton("Correntista Premium");

        basicoButton.addActionListener(e -> cardLayout.show(mainPanel, "Basico"));
        premiumButton.addActionListener(e -> cardLayout.show(mainPanel, "Premium"));

        add(new JLabel("Selecione o tipo de correntista:", SwingConstants.CENTER));
        add(basicoButton);
        add(premiumButton);
    }
}
