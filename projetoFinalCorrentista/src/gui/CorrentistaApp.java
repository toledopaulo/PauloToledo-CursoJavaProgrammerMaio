package gui;

import javax.swing.*;
import java.awt.*;

public class CorrentistaApp {
    private static CardLayout cardLayout = new CardLayout();
    private static JPanel mainPanel = new JPanel(cardLayout);
    private static CorrentistaBasicoPanel correntistaBasicoPanel;
    private static CorrentistaPremiumPanel correntistaPremiumPanel;
    private static ListaCorrentistasPanel listarBasicoPanel;
    private static ListaCorrentistasPanel listarPremiumPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gerenciamento de Correntistas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        JPanel selecionarTipoCorrentistaPanel = new SelecionarTipoCorrentistaPanel(cardLayout, mainPanel);
        correntistaBasicoPanel = new CorrentistaBasicoPanel(cardLayout, mainPanel);
        correntistaPremiumPanel = new CorrentistaPremiumPanel(cardLayout, mainPanel);
        listarBasicoPanel = new ListaCorrentistasPanel(cardLayout, mainPanel, correntistaBasicoPanel.getCorrentistasBasico(), "Basico");
        listarPremiumPanel = new ListaCorrentistasPanel(cardLayout, mainPanel, correntistaPremiumPanel.getCorrentistasPremium(), "Premium");

        mainPanel.add(selecionarTipoCorrentistaPanel, "Seleção");
        mainPanel.add(correntistaBasicoPanel, "Basico");
        mainPanel.add(correntistaPremiumPanel, "Premium");
        mainPanel.add(listarBasicoPanel, "ListarBasico");
        mainPanel.add(listarPremiumPanel, "ListarPremium");

        frame.add(mainPanel);
        cardLayout.show(mainPanel, "Seleção");
        frame.setVisible(true);
    }
}
