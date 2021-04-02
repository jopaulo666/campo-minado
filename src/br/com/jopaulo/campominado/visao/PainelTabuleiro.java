package br.com.jopaulo.campominado.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.jopaulo.campominado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {

			SwingUtilities.invokeLater(() -> {
				
				if (e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Parabéns, você ganhou!!!");
				} else {
					JOptionPane.showMessageDialog(this, "Que pena, você perdeu!!!");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
